Feature: Users

  Scenario: Post a new users
    Given Set request to post new users with valid data "ReqBodyValidPostUsers.json"
    When Send request post users
    Then Status code should be 200 OK