Feature: Search products on Amazon
  We will search different products on Amazon
  
  Scenario: Search for mobiles
  Given User is at Amazon homepage
  When User enters "samsung mobile" in search box
  And User clicks search button
  And User filters result
  		|Department|Smartphones|
  		|Max Price|25000|
  		|Min Price|15000|
  		|RAM|6GB|
  Then Result page displays "16" records
  
  
