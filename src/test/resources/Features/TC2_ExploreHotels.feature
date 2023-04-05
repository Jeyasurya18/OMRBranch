@Explore
Feature: Verifying OMR Branch hotel ExploreHotel Automation

  Background: 
    Given User is on OMR Branch hotel page

  Scenario Outline: Enter all fields and verify Select hotel
    When User login "<username>","<password>"
    Then User should verify success message after login "Welcome Jeya"
    When User search the "<Select State>","<Select City>","<Select Room Type>","<Check-In>","<Check-Out>","<No.OfRooms>","<No.Of Adults>" and "<No.Of Childrens>"
    Then User should verify the success message after search hotel "Select Hotel"

    Examples: 
      | username                | password       | Select State | Select City | Select Room Type | Check-In   | Check-Out  | No.OfRooms | No.Of Adults | No.Of Childrens |
      | pkssuryasd718@gmail.com | 14@Myselfsurya | Karnataka    | Mangalore   | Deluxe           | 2023-03-22 | 2023-03-24 | 1-One      | 2-Two        |               2 |

  Scenario Outline: Enter only mandatory fields and verify select hotel
    When User login "<username>","<password>"
    Then User should verify success message after login "Welcome Jeya"
    When User search the "<Select State>","<Select City>","<Check-In>","<Check-Out>","<No.OfRooms>" and "<No.Of Adults>"
    Then User should verify the success message after search hotel "Select Hotel"

    Examples: 
      | username                | password       | Select State | Select City | Check-In   | Check-Out  | No.OfRooms | No.Of Adults |
      | pkssuryasd718@gmail.com | 14@Myselfsurya | Karnataka    | Mangalore   | 2023-03-22 | 2023-03-24 | 1-One      | 2-Two        |

  Scenario Outline: Without enter any fields click search and verify all 6 error message
    When User login "<username>","<password>"
    Then User should verify success message after login "Welcome Jeya"
    And User click search button
    Then User should verify error messages after click search without enter any field "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | username                | password       |
      | pkssuryasd718@gmail.com | 14@Myselfsurya |

  Scenario Outline: Enter all fields and verify filter room type and select hotel
    When User login "<username>","<password>"
    Then User should verify success message after login "Welcome Jeya"
    When User search the "<Select State>","<Select City>","<Select Room Type>","<Check-In>","<Check-Out>","<No.OfRooms>","<No.Of Adults>" and "<No.Of Childrens>"
    Then User should verify the success message after search hotel "Select Hotel"
    And User should verify the filter room types message after search hotel "<Select Room Type>"

    Examples: 
      | username                | password       | Select State | Select City | Select Room Type    | Check-In   | Check-Out  | No.OfRooms | No.Of Adults | No.Of Childrens |
      | pkssuryasd718@gmail.com | 14@Myselfsurya | Karnataka    | Mangalore   | Deluxe/Suite/Luxury | 2023-03-22 | 2023-03-24 | 1-One      | 2-Two        |               2 |
