Feature: Car rent out
  @rentOut
  Scenario: Fill in form to rent out the car
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on 'Let car work' link
    And User enters location
    And User enters manufacture
    And User enters model
    And User enters year
    And User selects fuel
    And User enters seats
    And User enters car class
    And User enters car registration number
    And User enters price
    And User click on Submit button
    Then User verifies Car is added
    And User quites browser





