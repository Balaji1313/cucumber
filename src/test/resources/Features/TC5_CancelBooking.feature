@CancelBooking
Feature: Verify Adactin Cancel Booking details

  
  Scenario Outline: Verifying Adactin cancel booking by generating order id
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
    And User should navigate to Booked Itinerary page and cancel booking using order id
    Then User should verify the cancel booking success message "The booking has been cancelled."

    Examples: 
      | username     | password | location | hotels         | roomtype | roomnos  | datein     | dateout    | adultperroom | childperroom | firstname | lastname | address |
      | balajibest16 | 16161616 | Paris    | Hotel Sunshine | Deluxe   | 4 - Four | 23/09/2022 | 26/09/2022 | 2 - Two      | 2 - Two      | bala      | ji       | trichy  |

  
  Scenario Outline: Verifying Adactin cancel booking by using existing order id
    Given User is on adactin hotel page
    When User should perform Login "<username>","<password>"
    Then User should verify after Login "Hello balajibest16!"
    And User should navigate to Booked itenerary page and cancel booking using existing order id "<orderId>"
    Then User should verify the cancel booking success message "The booking has been cancelled."

    Examples: 
      | username     | password | orderId    |
      | balajibest16 | 16161616 | MOAKQI524N |
