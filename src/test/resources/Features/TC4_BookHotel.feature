@BookHotel
Feature: Verify Adactin Book Hotel details

  
  Scenario Outline: Verifying Adactin Book hotel by selecting all fields
    Given User is on adactin hotel page
    When User should perform Login "<username>","<password>"
    Then User should verify after Login "Hello balajibest16!"
    When User should perform by search hotel details "<location>","<hotels>","<roomtype>","<roomnos>","<datein>","<dateout>","<adultperroom>" and "<childperroom>"
    Then User should navigate to select hotel and verify success message "Select Hotel"
    And User should select hotel name and click continue
    Then User should navigate to book hotel page and verify message "Book A Hotel"
    And User should enter book hotel credentials "<firstname>","<lastname>" and "<address>"
      | cardNo           | cardType         | expMonth | expYear | cardCvv |
      | 1564956324857896 | American Express | February |    2022 |     456 |
      | 9534687516845632 | VISA             | June     |    2022 |     325 |
      | 6547824569536579 | Master Card      | October  |    2022 |     735 |
      | 6547824569698745 | Other            | October  |    2022 |     554 |
    Then User should navigate to booking confirmation page and verify message "Booking Confirmation"

    Examples: 
      | username     | password | location | hotels         | roomtype | roomnos  | datein     | dateout    | adultperroom | childperroom | firstname | lastname | address |
      | balajibest16 | 16161616 | Paris    | Hotel Sunshine | Deluxe   | 4 - Four | 23/09/2022 | 26/09/2022 | 2 - Two      | 2 - Two      | bala      | ji       | trichy  |

  
  Scenario Outline: Verifying Adactin Book hotel without selecting any fields
    Given User is on adactin hotel page
    When User should perform Login "<username>","<password>"
    Then User should verify after Login "Hello balajibest16!"
    When User should perform by search hotel details "<location>","<hotels>","<roomtype>","<roomnos>","<datein>","<dateout>","<adultperroom>" and "<childperroom>"
    Then User should navigate to select hotel and verify success message "Select Hotel"
    And User should select hotel name and click continue
    Then User should navigate to book hotel page and verify message "Book A Hotel"
    And User should click book now without entering any fields
    Then User should verify error messages of all fields "Please Enter your First Name", "Please Enter you Last Name", "Please Enter your Address", "Please Enter your 16 Digit Credit Card Number", "Please Select your Credit Card Type", "Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username     | password | location | hotels         | roomtype | roomnos  | datein     | dateout    | adultperroom | childperroom |
      | balajibest16 | 16161616 | Paris    | Hotel Sunshine | Deluxe   | 4 - Four | 23/09/2022 | 26/09/2022 | 2 - Two      | 2 - Two      |
