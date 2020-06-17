Feature: Search products on Amazon
  We will search different products on Amazon
  
  Scenario Outline: Search for mobiles
  Given User is at Amazon homepage
  When User enters "<mobile_name>" in search box
  And User clicks search button
  Then Result page displays "<title>"
  
  Examples:
  |mobile_name|title|
  |samsung mobiles|Amazon.in : samsung mobiles|
  |apple mobiles|Amazon.in : apple mobiles|
  |google mobiles|Amazon.in : google mobiles|