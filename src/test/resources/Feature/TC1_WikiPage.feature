Feature: Verifying Wiki of the movie

  Scenario Outline: Getting the movie details
    Given User is on Pushpa: The Rise Wiki page
    Then User should verify the movie "Pushpa: The Rise"
    When User get the Country Detail
    Then User get the Release Date
    Then User should successfully get screenshot of Wiki page
