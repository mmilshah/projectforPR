@live
Feature: Add product to the cart

  Scenario Outline: search product

    Given User is in the homepage
    When User search for products "<product>"
    Then User should be able to see the list of searched product "<product>"
    When User selects the desire product
    And User selects the "<size>"

    Examples:
      | product | size|
      | Adidas    | UK 8 |
#      | Nike      |
#      | Lacoste   |

 #   Scenario Outline: Add product to the cart

   #   Given User is on "<product>" page
#      #When User selects the desire "<product>"
#      And User selects the "<size>"
#      And  adds the product to the cart
#      Then "<product>" should be added to the cart

     # Examples:
      #  | product | size |
       # | Adidas  | 8    |