Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When Eat 10 cukes
    Then Have 52 cukes
