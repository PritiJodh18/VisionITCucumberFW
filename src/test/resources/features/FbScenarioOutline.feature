Feature: Title of your feature
  @TC005
  Scenario Outline: Title of your scenario outline
    Given User open browser "https://www.facebook.com/"
    When User enter id <name> and pass<pass> in step
    Then User verify Login Page

    Examples: 
      | name    | pass    | 
      | "name1" | "00pp5"  |
      | "name2" | "sfs007" | 
      | "name3" | "6778p"  |
