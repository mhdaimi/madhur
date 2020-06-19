package in.amazon.stepDefinition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchProductAmazon {
	
	WebDriver driver;
	
	@Given("User is at Amazon homepage")
	public void user_is_at_Amazon_homepage() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium-Java-Cucumber-jars-exe\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}

	@When("User enters {string} in search box")
	public void user_enters_in_search_box(String string) {
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string);
	}

	@When("User clicks search button")
	public void user_clicks_search_button() {
	    driver.findElement(By.xpath("//*[@value='Go']")).click();
	}

	@Then("Result page displays {string}")
	public void result_page_displays_samsung_mobiles(String title) {
	    Assert.assertEquals(title, driver.getTitle());
	    
	}
	
	@When("User filters result")
	public void user_filters_result(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		System.out.println(map);
		
		List<String> list = dataTable.asList();
		System.out.println(list);
		
		driver.findElement(By.linkText(map.get("Department"))).click();
		driver.findElement(By.id("low-price")).sendKeys(map.get("Min Price"));
		driver.findElement(By.id("high-price")).sendKeys(map.get("Max Price"));
		driver.findElement(By.xpath("//input[contains(text(),'Go')]")).click();
		
		
	}

	@Then("Result page displays {string} records")
	public void result_page_displays_records(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
