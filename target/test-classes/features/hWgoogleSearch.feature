Feature:Various google searches

  Scenario:'When I go to the Google search page, and search for an item,
  I expect to see at browser title to that item in the result.'
    Given I have gone to the Google page
    When I add "cucumber" to the search box
    And click the Search Button
    Then The title confirms that cucumber is written