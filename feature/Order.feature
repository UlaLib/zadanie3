Feature: As a user I want to be able to place an order

  @test1
  Scenario Outline: Authenticate to the application
    Given I am on login page
    When I enter login <login>
    And I enter password <password>
    Then I am on account page
    And I can go to My Personal Information Section
    And I can see can see the details view of the account: <firstname>, <lastname>, <login>, <day of birth>, <month of birth>, <year of birth>

    Examples:
      |login          | password |firstname|lastname|day of birth|month of birth|year of birth|
      |qwerty@test.pl | Qverty   |Ala      |Makota  |1           |1             |2000         |

   @test2
    Scenario Outline: Display the error messege
     Given I am on login page
     When I enter incorrect login <incorrect-login>
     And I enter incorrect password <incorrect-password>
     Then I see the error message <message>

    Examples:
      | incorrect-login | incorrect-password |message               |
      | login@test.pl   | ABC                |Invalid password.     |
      | login1          |                    |Invalid email address.|
      | qwerty@test.pl  | ABC                |Invalid password.     |

   @test3
   Scenario Outline: Shopping
     Given I am authenticate user with <login>, <password>
     When I choose a product
     And I go through all the steps
     Then I can verify the order
     Examples:
       |login          | password |
       |qwerty@test.pl | Qverty   |