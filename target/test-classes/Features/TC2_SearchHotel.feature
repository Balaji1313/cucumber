@SearchHotel
Feature: Verify Adactin search hotel details

  Scenario Outline: Verifying Adactin search hotel by selecting all fields
    Given User is on adactin hotel page
    When User should perform Login "<username>","<password>"
    Then User should verify after Login "Hello balajibest16!"
    When User should perform by search hotel details "<location>","<hotels>","<roomtype>","<roomnos>","<datein>","<dateout>","<adultperroom>" and "<childperroom>"
    Then User should navigate to select hotel and verify success message "Select Hotel"

    Examples: 
      | username     | password | location | hotels         | roomtype | roomnos  | datein     | dateout    | adultperroom | childperroom | firstname | lastname | address | cardno           | cardtype | expmonth | expyear | cardcvv |
      | balajibest16 | 16161616 | Paris    | Hotel Sunshine | Deluxe   | 4 - Four | 23/09/2022 | 26/09/2022 | 2 - Two      | 2 - Two      | bala      | ji       | trichy  | 5698274136524569 | VISA     | DECEMBER |    2023 |     666 |

  Scenario Outline: Verifying Adactin search hotel by selecting mandatory fields
    Given User is on adactin hotel page
    When User should perform Login "<username>","<password>"
    Then User should verify after Login "Hello balajibest16!"
    When User should enter only mandatory fields "<location>","<roomnos>","<datein>","<dateout>" and "<adultperroom>"
    Then User should navigate to select hotel and verify success message "Select Hotel"

    Examples: 
      | username     | password | location | roomnos  | datein     | dateout    | adultperroom |
      | balajibest16 | 16161616 | Paris    | 4 - Four | 23/09/2022 | 26/09/2022 | 2 - Two      |

  Scenario Outline: Verifying Adactin search hotel by date checking
    Given User is on adactin hotel page
    When User should perform Login "<username>","<password>"
    Then User should verify after Login "Hello balajibest16!"
    When User should perform by search hotel details "<location>","<hotels>","<roomtype>","<roomnos>","<datein>","<dateout>","<adultperroom>" and "<childperroom>"
    Then User should verify error message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username     | password | location | hotels         | roomtype | roomnos  | datein     | dateout    | adultperroom | childperroom |
      | balajibest16 | 16161616 | Paris    | Hotel Sunshine | Deluxe   | 4 - Four | 30/11/2022 | 26/09/2022 | 2 - Two      | 2 - Two      |

  Scenario Outline: Verifying Adactin search hotel without entering any fields
    Given User is on adactin hotel page
    When User should perform Login "<username>","<password>"
    Then User should verify after Login "Hello balajibest16!"
    When User should click search button without selecting any fields
    Then User should verify wihout entering any fields error message "Please Select a Location"

    Examples: 
      | username     | password |
      | balajibest16 | 16161616 |
