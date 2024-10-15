
@smoke
Feature: Search and Place the order for products
 

  @tag1
  Scenario: Search Experience for product serach in home and offers page
    Given user is on Greencart Landing page
    When user serached with shortname "Tom" and extracted actual name of product
    Then user searched for "Tom" shortname in offers page to check if product exist with same name
    


