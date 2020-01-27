Feature: Application Login

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User logs into the application with "jin" and password "1234"
    Then Homepage is populated
    And Cards are displayed: "true"

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User logs into the application with "john" and password "4321"
    Then Homepage is populated
    And Cards are displayed: "false"