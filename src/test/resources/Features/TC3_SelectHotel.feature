@Select
Feature: Verifying OMR Branch Selecthotel Automation

  Background: 
    Given User is on OMR Branch hotel page

  Scenario Outline: Select hotel and verify navigate to book hotel upon accepting the alert
    When User login "<username>","<password>"
    Then User should verify success message after login "Welcome Jeya"
    When User search the "<Select State>","<Select City>","<Select Room Type>","<Check-In>","<Check-Out>","<No.OfRooms>","<No.Of Adults>" and "<No.Of Childrens>"
    Then User should verify the success message after search hotel "Select Hotel"
    When User select the hotel
    And User accept the alert
    Then User should verify the success message after accept the alert message "Book Hotel" and save the hotel name

    Examples: 
      | username                | password       | Select State | Select City | Select Room Type | Check-In   | Check-Out  | No.OfRooms | No.Of Adults | No.Of Childrens |
      | pkssuryasd718@gmail.com | 14@Myselfsurya | Karnataka    | Mangalore   | Deluxe           | 2023-03-22 | 2023-03-24 | 1-One      | 2-Two        |               2 |

  Scenario Outline: Select hotel and verify navigating in the same page upon dismiss the alert
    When User login "<username>","<password>"
    Then User should verify success message after login "Welcome Jeya"
    When User search the "<Select State>","<Select City>","<Select Room Type>","<Check-In>","<Check-Out>","<No.OfRooms>","<No.Of Adults>" and "<No.Of Childrens>"
    Then User should verify the success message after search hotel "Select Hotel"
    When User select the hotel
    And User dismiss the alert
    Then User should verify the success message after search hotel "Select Hotel"

    Examples: 
      | username                | password       | Select State | Select City | Select Room Type | Check-In   | Check-Out  | No.OfRooms | No.Of Adults | No.Of Childrens |
      | pkssuryasd718@gmail.com | 14@Myselfsurya | Karnataka    | Mangalore   | Deluxe           | 2023-03-22 | 2023-03-24 | 1-One      | 2-Two        |               2 |

  Scenario Outline: Verify sorting functionality hotel price from high to low
    When User login "<username>","<password>"
    Then User should verify success message after login "Welcome Jeya"
    When User search the "<Select State>","<Select City>","<Select Room Type>","<Check-In>","<Check-Out>","<No.OfRooms>","<No.Of Adults>" and "<No.Of Childrens>"
    Then User should verify the success message after search hotel "Select Hotel"
    When User click the radio button on price high to low
    Then User should verify the hotels displayed high to low price after click the radio button

    Examples: 
      | username                | password       | Select State | Select City | Select Room Type | Check-In   | Check-Out  | No.OfRooms | No.Of Adults | No.Of Childrens |
      | pkssuryasd718@gmail.com | 14@Myselfsurya | Karnataka    | Mangalore   | Deluxe           | 2023-03-22 | 2023-03-24 | 1-One      | 2-Two        |               2 |

  Scenario Outline: Passing room type and verify filter is listed
    When User login "<username>","<password>"
    Then User should verify success message after login "Welcome Jeya"
    When User search the "<Select State>","<Select City>","<Select Room Type>","<Check-In>","<Check-Out>","<No.OfRooms>","<No.Of Adults>" and "<No.Of Childrens>"
    Then User should verify the success message after search hotel "Select Hotel"
    And User should verify room type filter ends with "<Select Room Type>"

    Examples: 
      | username                | password       | Select State | Select City | Select Room Type | Check-In   | Check-Out  | No.OfRooms | No.Of Adults | No.Of Childrens |
      | pkssuryasd718@gmail.com | 14@Myselfsurya | Karnataka    | Mangalore   | Deluxe           | 2023-03-22 | 2023-03-24 | 1-One      | 2-Two        |               2 |
