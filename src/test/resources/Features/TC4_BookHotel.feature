@Book
Feature: Verifying OMR Branch Bookhotel Automation

  Background: 
    Given User is on OMR Branch hotel page

  Scenario Outline: Book hotel including GST - card (debit card - VISA)-with special request
    When User login "<username>","<password>"
    Then User should verify success message after login "Welcome Jeya"
    When User search the "<Select State>","<Select City>","<Select Room Type>","<Check-In>","<Check-Out>","<No.OfRooms>","<No.Of Adults>" and "<No.Of Childrens>"
    Then User should verify the success message after search hotel "Select Hotel"
    When User select the hotel
    And User accept the alert
    Then User should verify the success message after accept the alert message "Book Hotel" and save the hotel name
    When User add guest details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No>" and "<Email>"
    And User add GST details "<Reg.No>","<Company Name>" and "<Company Address>"
    And User add the "<special request>"
    And User add payment details,proceed with card type "<Card type>"
      | Card       | Card number      | card holder name | Expiry month | Expiry year | cvv |
      | Visa       | 5555555555552222 | JeyaSurya        | November     |        2025 | 123 |
      | Amex       | 3333333333445566 | Vishnu           | April        |        2027 | 543 |
      | Mastercard | 7896543457654345 | Mohan            | March        |        2026 | 765 |
      | Discover   | 5656564747383829 | Dhinesh          | June         |        2028 | 345 |
    Then User should verify booking success message after book hotel "Booking is Confirmed" and save the orderId

    Examples: 
      | username                | password       | Select State | Select City | Select Room Type | Check-In   | Check-Out  | No.OfRooms | No.Of Adults | No.Of Childrens | Select Salutation | First Name | Last Name | Mobile No  | Email                   | Reg.No     | Company Name           | Company Address | special request | Card type  |
      | pkssuryasd718@gmail.com | 14@Myselfsurya | Karnataka    | Mangalore   | Deluxe           | 2023-03-22 | 2023-03-24 | 1-One      | 2-Two        |               2 | Mr.               | Jeya       | Surya     | 6383265056 | pkssuryasd718@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam    | Cold water      | Debit Card |

  Scenario Outline: Book hotel including GST - UPI with special request
    When User login "<username>","<password>"
    Then User should verify success message after login "Welcome Jeya"
    When User search the "<Select State>","<Select City>","<Select Room Type>","<Check-In>","<Check-Out>","<No.OfRooms>","<No.Of Adults>" and "<No.Of Childrens>"
    Then User should verify the success message after search hotel "Select Hotel"
    When User select the hotel
    And User accept the alert
    Then User should verify the success message after accept the alert message "Book Hotel" and save the hotel name
    When User add guest details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No>" and "<Email>"
    And User add GST details "<Reg.No>","<Company Name>" and "<Company Address>"
    And User add the "<special request>"
    And User add the UPI detail "<UPI ID>"
    Then User should verify booking success message after book hotel "Booking is Confirmed" and save the orderId

    Examples: 
      | username                | password       | Select State | Select City | Select Room Type | Check-In   | Check-Out  | No.OfRooms | No.Of Adults | No.Of Childrens | Select Salutation | First Name | Last Name | Mobile No  | Email                   | Reg.No     | Company Name           | Company Address | special request | UPI ID               |
      | pkssuryasd718@gmail.com | 14@Myselfsurya | Karnataka    | Mangalore   | Deluxe           | 2023-03-22 | 2023-03-24 | 1-One      | 2-Two        |               2 | Mr.               | Jeya       | Surya     | 6383265056 | pkssuryasd718@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam    | Cold water      | seleniumtraining@vbc |
