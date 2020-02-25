Feature:  Browser

  @login
  Scenario: Browser
  Given User opens the seek site
  When User clicks on login
    And Inputs "deepti.marathe@gmail.com" and "Rohan007"
    Then User should be able to login successfully










