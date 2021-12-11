Feature: register test
  Scenario Outline: create an account

    Given navigate to website
    And click sign in button
    And Type "<email>"
    And click on create an account button
    And choose title
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type company "<company>"
    And type address "<address>"
    Examples:
      | email | firstname | lastname | password | company | address |
    |rustemerdem@gmail.co|rustem|erdem|43551|Dodge|Chicago|
    |aslihansahan@gmail.com|aslihan|sahan|49041|Ford|Kocaeli|
