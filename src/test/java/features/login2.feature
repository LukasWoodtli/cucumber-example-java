Feature: login Page
  In order to test login page
  As a Registered user
  I want to specify the login conditions

  Scenario: New User Registration
    Given user is on Application landing page
    When user enters "ShankarGarg" in username field
    And user enters "sgarg@gmail.com" in password field
    And user enters "123456" in password field
    And user clicks on Signup for GitHub button
    Then user is successfully registered

  Scenario: login
    Given user is on Application landing page
    And Sign in button is present on screen
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "ShankarGarg" in username field
    And user enters "123456" in password field
    And user clicks Sign in button
    Then user is on home page
    And title of home page is "GitHub"


  Scenario: Existing user Verification
    Given user is on Application landing page
    Then we verify following user exists
      | name | email | phone |
      | Shankar | sgarg@email.com | 999 |
      | Ram | ram@email.com | 888 |
      | Sham | sham@email.org | 666 |

  Scenario: login fail - wrong username
    Given user is on Application landing page
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "wrongusername" in username field
    And user enters "123456" in password field
    And user clicks Sign in button
    Then user gets login failed error message

  Scenario: login fail - wrong password
    Given user is on Application landing page
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "ShankarGarg" in username field
    And user enters "wrongpassword" in password field
    And user clicks Sign in button
    Then user gets login failed error message


  Scenario Outline: Login fail - possible combinations
    Given user is on Application landing page
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "<UserName>" in username field
    And user enters "<Password>" in password field
    And user clicks Sign in button
    Then user gets login failed error message
    Examples:
      | UserName | Password |
      | wrongusername | 123456 |
      | ShankarGarg | wrongpassword |
      | wrongusername | wrongpassword |

  Scenario: Existing user Verification
    Given user is on Application landing page
    Then we verify following user exists
      | Name | Email | Phone |
      | Shankar | sgarg@email.com | 999 |
      | Ram | ram@email.com | 888 |
      | Sham | sham@email.org | 666 |

  Scenario: New User Registration
    Given user is on Application landing page
    When user enters "ShankarGarg" in username field
    And user enters "sgarg@gmail.com" in password field
    And user enters "123456" in password field
    And user clicks on Signup for GitHub button
    Then user is successfully registered