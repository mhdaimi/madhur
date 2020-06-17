
Feature: Search products on Amazon
  We will search different products on Amazon
  @Smoke
  Scenario: Search for Samsung mobiles
  Given User is at Amazon homepage
  When User enters "Samsung mobiles" in search box
  And User clicks search button
  Then Result page displays "Amazon : samsung mobiles"
  
  Scenario: Search for Samsung mobiles
  Given User is at Amazon homepage
  When User enters "apple mobiles" in search box
  And User clicks search button
  Then Result page displays "Amazon : apple mobiles"  
  