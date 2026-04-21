Feature: Sales order management in the Serenity Demo Platform

  As a registered employee in the system
  I want to register new orders
  So that I can document the sales made to customers

  Background:
    Given user open the browser
    When the user send the credentials
      | admin    |
      | serenity |

  @order
  Scenario: Successful creation of a basic order with one product
    When the user navigates to the "Orders" section in the "Northwind" module
    And clicks on the "New Order" button
    And fills out the form with the following information:
      | Customer   | Alfreds Futterkiste |
      | Order Date | actual               |
      | Employee   | Laura Callahan       |
    And adds a product to the order detail:
      | Product  | Chai |
      | Quantity | 10   |
      | Price    | 18   |
    And saves the record
    Then the system should the order created successfully

