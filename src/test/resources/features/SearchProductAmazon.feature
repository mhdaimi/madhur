Feature: Search products on Amazon
  We will search different products on Amazon
  
  Scenario: Search for Samsung mobiles
  Given User is at Amazon homepage
  When User enters "Samsung mobiles" in search box
  And User clicks search button
  Then Result page displays samsung mobiles