@SelectHotel
Feature: Verify Adactin Select Hotel details

  Scenario Outline: Verifying Adactin select hotel by selecting hotel name
    Given User is on adactin hotel page
    When User should perform Login "<username>","<password>"
    Then User should verify after Login "Hello balajibest16!"
    When User should perform by search hotel details "<location>","<hotels>","<roomtype>","<roomnos>","<datein>","<dateout>","<adultperroom>" and "<childperroom>"
    Then User should navigate to select hotel and verify success message "Select Hotel"
    And User should select hotel name and click continue
    Then User should navigate to book hotel page and verify message "Book A Hotel"

    Examples: 
      | username     | password | location | hotels         | roomtype | roomnos  | datein     | dateout    | adultperroom | childperroom |
      | balajibest16 | 16161616 | Paris    | Hotel Sunshine | Deluxe   | 4 - Four | 23/09/2022 | 26/09/2022 | 2 - Two      | 2 - Two      |

  Scenario Outline: Verifying Adactin select hotel without selecting hotel name
    Given User is on adactin hotel page
    When User should perform Login "<username>","<password>"
    Then User should verify after Login "Hello balajibest16!"
    When User should perform by search hotel details "<location>","<hotels>","<roomtype>","<roomnos>","<datein>","<dateout>","<adultperroom>" and "<childperroom>"
    Then User should navigate to select hotel and verify success message "Select Hotel"
    And User should click continue without selecting hotel name
    Then User should verify error message without selecting hotel name "Please Select a Hotel"

    Examples: 
      | username     | password | location | hotels         | roomtype | roomnos  | datein     | dateout    | adultperroom | childperroom |
      | balajibest16 | 16161616 | Paris    | Hotel Sunshine | Deluxe   | 4 - Four | 23/09/2022 | 26/09/2022 | 2 - Two      | 2 - Two      |
