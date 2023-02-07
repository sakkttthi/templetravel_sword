
Feature: HR Module

  @ASmoke
  Scenario: Smoke test on HR Module
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$" 
    And Click Login button
    Then The Page Tile should display "Dashboard" 
    When click job position
    Then The Page Tile should display "Job Position" 
    When click consultancy
    And click consultancy summary
    Then The Page Tile should display "Consultancy" 
    When click new consultancy
    Then The Page Tile should display "Add Consultancy" 
    When click job
    And click  job summary
    Then The Page Tile should display "Jobs" 
    When click create job
    Then The Page Tile should display "Add Job" 
    When click candidates
   	Then The Page Tile should display "Candidates" 

  