Feature: Login dummy json

  @Token @Login
  Scenario: Valid login dummy json
    Given Login with valid data "ValidLogin.json"
    When Send post login
    Then Status code should be 200 OK
    And Response body should display "JSONSchemaLoginSuccess.json"

  @Token @Login
  Scenario: Invalid login dummy json
    Given Login with invalid data "InvalidLogin.json"
    When Send post login
    Then Status code should be 400 Bad Request