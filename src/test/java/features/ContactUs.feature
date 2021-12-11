Feature: contact us test
  Scenario: go to website and contact us page

    Given navigate to the website
    And click on contact us button
    And select subject heading
    And type order reference
    And type email
    And type a message
    When click on send button
    Then verify success message