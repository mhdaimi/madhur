package in.amazon.stepDefinition;

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

	@Then("Result page displays samsung mobiles")
	public void result_page_displays_samsung_mobiles() {
	    Assert.assertEquals("Amazon.in : Samsung mobiles", driver.getTitle());
	    
	}

}
