Feature: LinkedIn

  Scenario: Login Linkedin
    Given I open LinkedIn login page
    When I input email and password
    When I click button login
    Then I can see my news feed

  Scenario: Posting news
    When I click posting coloumn
    And I write some information for sharing
    And I click posting
    Then People who followed me can see it

  Scenario: Looking Job
    When I click job in taskbar
    Then I can see any job opportunity
    And I can choose a job according to my criteria

  Scenario: Searching
    When I click searching in taksbar
    And I write "Universitas Esa Unggul"
    And I click search button
    Then I can see about "Universitas Esa Unggul" and people who in circle

  Scenario: Notifikasi
    When I click icon notifikasi
    Then I can see activities about my circle and anymore

  Scenario: Profile
    When I click my avatar
    And I click view profile
    Then I can see edit and update my profile