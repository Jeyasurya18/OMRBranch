@Login
Feature: Verifying OMR Branch hotel login Automation

  Background: 
    Given User is on OMR Branch hotel page

  Scenario Outline: Verifying login with valid credentials
    When User login "<username>","<password>"
    Then User should verify success message after login "Welcome Jeya"

    Examples: 
      | username                | password       |
      | pkssuryasd718@gmail.com | 14@Myselfsurya |

  Scenario Outline: Verifying login with valid credentials using ENTER key
    When User login "<username>","<password>" with ENTER key
    Then User should verify success message after login "Welcome Jeya"

    Examples: 
      | username                | password       |
      | pkssuryasd718@gmail.com | 14@Myselfsurya |

  Scenario Outline: Verifying login with invalid credentials
    When User login "<username>","<password>"
    Then User should verify error message after login "Invalid Login details or Your Password might have expired. "

    Examples: 
      | username                | password      |
      | pkssuryasd718@gmail.com | 14@Myselfsury |
