Feature: Login Test

  @regression
  Scenario: User should navigate To loginPage successFully
    Given I am on homepage
    When  I click on login tab
    Then  I navigate to login page successfully

  @regression
  Scenario: Verify the errorMessage with inValid credentials
    Given I am on homepage
    When  I click on login tab
    And   I navigate to login page successfully
    And   I enter "iamslk@gmail.com" emailID
    And   I enter "654321" password
    And   I click on login button
    Then  I should be able see the error message

  @regression
  Scenario: Verify that user should login successfully with valid credentials
    Given I am on homepage
    When  I click on login tab
    And   I navigate to login page successfully
    And   I enter "iamslk@gmail.com" emailID
    And   I enter "123456" password
    And   I click on login button
    Then  I should be able to see logout Button

  @regression
  Scenario: verify that user should logOut successFully
    Given I am on homepage
    When  I click on login tab
    And   I navigate to login page successfully
    And   I enter "iamslk@gmail.com" emailID
    And   I enter "123456" password
    And   I click on login button
    And   I should be able to see the logout button
    And   I click on logout button
    Then  I can see the login link displayed