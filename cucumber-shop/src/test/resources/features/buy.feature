Feature: Buy products
    As a customer
    I want to buy products

Background:
    Given the store is ready to service customers
    And a product "Bread" with price 20.00 and stock of 2 exists
    And a product "Jam" with price 80.00 and stock of 2 exists
    And a product "iPhone" with price 100.00 and stock of 2 exists

Scenario: Buy overStock products
    When I overbuy "Bread" with quantity 3
    And I buy "iPhone" with quantity 1
    Then total should be 100

#Scenario: Buy one product
#    When I buy "Bread" with quantity 2
#    Then total should be 41.00

#Scenario Outline: Buy one product
#    When I buy <product> with quantity <quantity>
#    Then total should be <total>
#    Examples:
#        | product  | quantity |  total  |
#        | "Bread"  |     1    |   20.50 |
#        | "Jam"    |     2    |  160.00 |
#        | "iPhone" |     3    |  300.00  |

#Scenario: Buy multiple products
#    When I buy "Bread" with quantity 2
#    And I buy "Jam" with quantity 1
#    And I buy "iPhone" with quantity 2
#    Then total should be 321.00

