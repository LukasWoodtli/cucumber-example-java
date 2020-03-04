Feature: Others

  Scenario: Regex to string array
    Given I am available on "Tuesday,Friday,Sunday"

  Scenario: Optional Capture Groups/Alternation
    #positive
    Then I see following dollars in my account
    #negative
    Then I do not see following dollars in my account

  Scenario: Optional Non capture Groups
    Given I have following dollars in my account
    Given He has following dollars in my account
    Given User has following dollars in my account

  Scenario: Table Diff
    Given user send a get request to "localhost:8080/e"
    Then user gets following response
      | username | age |
      | sham     | 25  |
      | ram      | 26  |

  Scenario: Big string
    Given a book named "cucumber cookbook" with following body
      """
      Title - Cucumber cookbook
      Author of this book is first time writer so please excuse
      the naive mistakes. But he will definitely improve
      with chapters he writes.
      """