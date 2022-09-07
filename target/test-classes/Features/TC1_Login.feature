@Login
Feature: Verify Adactin Login hotel details

  Scenario Outline: Verify Adactin Login hotel with valid crendentials
    Given User is on adactin hotel page
    When User should perform Login "<username>","<password>"
    Then User should verify after Login "Hello balajibest16!"

    Examples: 
      | username     | password |
      | balajibest16 | 16161616 |

  Scenario Outline: Verify Adactin hotel Login with valid crendentials with enter
    Given User is on adactin hotel page
    When User should perform Login "<username>","<password>" with enter key
    Then User should verify after Login "Hello balajibest16!"

    Examples: 
      | username     | password |
      | balajibest16 | 16161616 |

  
  Scenario Outline: Verify Adactin hotel Login with invalid crendentials
    Given User is on adactin hotel page
    When User should perform Login "<username>","<password>"
    Then User should verify after Login error contain "Invalid Login details or Your Password might have expired"

    Examples: 
      | username     | password |
      | balajibest16 |    16161 |
