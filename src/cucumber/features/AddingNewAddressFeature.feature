Feature: Adding new address

  Scenario Outline: User is able to fill the address adding form
    Given User is already logged in and on Your Account Addresses page
    When User clicks on Create new address
    And User enters "<alias>" "<address>" "<zipPostalCode>" "<city>" "<country>" "<phone>" and then confirmation button
    And Check if address alias is "address 1"
    And Check if address body is "John Doe<br>John Doe's Street<br>SW1A 0PW<br>London<br>United Kingdom<br>020 1234 5555"
    And User can delete the address

  Examples:
  | alias     | address             | zipPostalCode | city    | country         | phone          |
  | address 1 | John Doe's Street   | SW1A 0PW      | London  | United Kingdom  | 020 1234 5555  |
#  | address 2 | Jane Doe's  Street  | G2 1DU        | Glasgow | United Kingdom  | 0141 5555 6789 |
