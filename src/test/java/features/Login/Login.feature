Feature: Login

  Scenario: Login with valid email and password
    Given iam in talentek homepage
    And i input valid email
    And i input valid password
    When i click on login button
    Then i will verify that i successfully logged into existing home page