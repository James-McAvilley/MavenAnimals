Feature: Is cat hungry?
  The cat should be fed if it hungry

  Scenario: Cat needs food
    Given cat is hungry
    When i feed cat
    Then cat is not hungry