Feature: Adding new address

  Scenario Outline: User is able to fill the address adding form
    Given User is already logged in and on Your Account Addresses page
    When User enters "<alias>" "<address>" "<zip/postal code>" "<city>" "<country>" "<phone>"
    Then Check if added data is correct

  Examples:
  | alias             | address             | zip/postal code | city    | country        | phone            |
  | address 1         | John Doe's  Street  | SW1A 0PW        | London  | United Kingdom | (020) 1234 5555  |
  | address 2         | Jane Doe's  Street  | G2 1DU          | Glasgow | United Kingdom | (0141) 5555 6789 |
