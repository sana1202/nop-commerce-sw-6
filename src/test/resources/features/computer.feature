Feature: ComputerPage Test

  @regression @smoke
  Scenario: verify user should navigate To computer page successfully
    Given I am on homepage
    When  I click on computer tab
    Then  I can see the text computer

  @regression @sanity
  Scenario: verify user should navigate to Desktops page successfully
    Given I am on homepage
    When  I click on computer tab
    And   I click on Desktop link
    Then  I can see the desktop text

  @regression
  Scenario Outline: verify that user should Build You Own Computer and add them to cart successfully
    Given I am on homepage
    When  I click on computer tab
    And   I click on Desktop link
    And   I click on Built your own computer
    And   I select  "<processor>" from processor
    And   I select "<ram>" from RAM
    And   I select "<hdd>" from Harddrive
    And   I select "<os>" from operating system
    And   I select "<software>" from software
    And   I click on add to cart button
    Then  I can see the message product has been added to your shopping cart
    Examples:

      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista  Home [+$50.00]   | Total Commander [+$5.00]   |