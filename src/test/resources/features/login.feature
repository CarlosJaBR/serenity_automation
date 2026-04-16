Feature: Login

  As a registered user
  The user wants to log in to the application
  In order to securely access their account

  Background:
    Given user open the browser

  @enter
  Scenario Outline: login with case "<case>"
    When the user send the credentials
      | <username> |
      | <password> |
    Then the user can see the message "<message>"
    Examples:
      | case         | username | password | message   |
      | success      | admin    | serenity | Dashboard |
      | bad user     | john     | serenity | Alert     |
      | bad password | admin    | password | Alert     |

