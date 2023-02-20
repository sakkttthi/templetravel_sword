Feature: Regression Test

  @Designation
  Scenario: Employee Menu --> Designation
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$"
    And Click Login button
    Then The Page Tile should display "Dashboard"
    When Click EmployeeMenu
    And Click Designation
    And Click Add Designation
    Then The Page Tile should display "Add Designation"
    When Click Designation field
    And Enter Designation in field
    And Click Add
    Then check the confirmation message appear as "Designation Created Successfully."
    When Click Search field
    And Enter Designation in Search field
    #Search the newly created designation
    Then Search Designation should be sorted in table
    #Designation must be retrived
    When Click ActionButton
    #Update the designation
    Then The Page Tile should display "Edit Designation"
    #not neccessary
    When Click EditDesignation field
    And Clear field
    And Enter Edit Designation in field
    #Amend the designation
    And Click update
    When Click Search field
    And Enter Edit Designation in Search field
    Then Search Edit Designation should be sorted in table
    And Close browser

  @AddEmployee
  Scenario: Employee Menu --> Add Employee
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$"
    And Click Login button
    Then The Page Tile should display "Dashboard"
    When Click EmployeeMenu
    And click add employee in employee menu
    And entering valid input in all fields
    And click add in add employee submenu
    Then check the confirmation message appear as "Employee Created Successfully"
    When Click Search field
    And Enter Employee in Search field
    #Search the newly created designation
    Then Search Employee should be sorted in table
    #Designation must be retrived
    When Click ActionButton in EmployeeMaster
    #Update the designation
    And Amend the Employee in field
    #Amend the designation
    When Click Search field
    And Enter Edit Employee in Search field
    Then Search Edit Employee should be sorted in table
    And Close browser

  @CreateProject
  Scenario: Project Menu --> Create Project
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$"
    And Click Login button
    Then The Page Tile should display "Dashboard"
    When Click Project
    And Click Create Project
    When enter valid credentials in create project
    And Click Add in projects
    Then check the confirmation message in projects appear as "Project Created Successfully."
    When Click Search field in project
    And Enter project in Search field
    #Search the newly created designation
    Then Search project should be sorted in project table
    #Designation must be retrived
    #When Click ActionButton in projects
    #Update the designation
    #And Amend the Project in field
    #Amend the designation
    #When Click Search field in project
    #And Enter Edit project in Search field
    #Then Search Edit project should be sorted in table
    And Close browser

  @TeamAllocation
  Scenario: Team Allocation
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$"
    And Click Login button
    Then The Page Tile should display "Dashboard"
    When Click Team Allocation
    And Click Create Team Allocation
    And create team allocation
    Then check the confirmation message in team allocation appear as "Team Allocation Created Successfully"
    When search team allocation
    Then Search team allocation should be sorted in table
    When update team allocation
    Then check the confirmation message in team allocation appear as "Team Allocation Updated Successfully."
    And Close browser

  @Announcement
  Scenario: Announcement menu
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$"
    And Click Login button
    Then The Page Tile should display "Dashboard"
    When Click Announcement
    And click add announcement
    And create announcement
    Then check the confirmation message in announcement appear as "Announcement Created Successfully."
    When search announcement
    Then Search announcement should be sorted in table
    When update announcement
    Then check the confirmation message in announcement appear as "Announcement Updated Successfully."
    And Close browser

  @HolidayMaster
  Scenario: Holiday master menu
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$"
    And Click Login button
    Then The Page Tile should display "Dashboard"
    When Click Holiday Master
    And click add holiday
    And create holiday
    Then check the confirmation message in holiday master appear as "Holiday Created Successfully"
    When search holiday
    Then Search holiday should be sorted in table
    When update holiday
    Then check the confirmation message in holiday master appear as "Holiday Updated Successfully."
    And Close browser

  @LeaveManagement_ApplyLeave
  Scenario: Leave management	--> Apply leave
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$"
    And Click Login button
    Then The Page Tile should display "Dashboard"
    When Click Leave Management
    And Click Apply Leave
    And create leave
    Then check the confirmation message in leave management as "Leave Applied"
    When search leave
    Then Search leave should be sorted in table
    When update leave
    Then check the confirmation message in leave management as "Leave Updated"
    And Close browser

  @LeaveManagement_AssignLeave
  Scenario: Leave management	--> Assign leave
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$"
    And Click Login button
    Then The Page Tile should display "Dashboard"
    When Click Leave Management
    And Click Assign Leave
    And assign leave
    Then check the confirmation message in leave management as "Leave Assigned"
    And Close browser

  @LeaveManagement_ApproveLeave
  Scenario: Leave management	--> Approve leave
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$"
    And Click Login button
    Then The Page Tile should display "Dashboard"
    When Click Leave Management
    And Click Approve Leave
    And click approve
    Then check the confirmation message in leave management as "Leave has been approved"
    And click reject
    Then check the confirmation message in leave management as "Leave has been Rejected"
    And Close browser

  @Feedback
  Scenario: Feedback
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$"
    And Click Login button
    Then The Page Tile should display "Dashboard"
    When Click Feedback
    And Click Submit Feedback
    And create feedback
    Then check the confirmation message in feedback as "Thank you for submitting Feedback"
    And Close browser

  @LeaveReport
  Scenario: Leave Report
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$"
    And Click Login button
    Then The Page Tile should display "Dashboard"
    When Click Leave Report
    And Click Leave Record
    And read leave record
    Then check the confirmation message in leave report as "LEAVE DETAIL RECORD"
    And Click Leave Details
    And read leave Details
    Then check the confirmation message in leave report as "YEAR LEAVE DETAIL REPORT"
    And Close browser

  @SelfReport
  Scenario: Self Report
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$"
    And Click Login button
    Then The Page Tile should display "Dashboard"
    When Click Self Report
    And Click Leave Summary in Self Report
    And read leave summary
    Then check table is visible
    And Click Attendance Summary in Self Report
    And read attendance summary
    Then check table is visible
    And Close browser

  @Report
  Scenario: Report
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$"
    And Click Login button
    Then The Page Tile should display "Dashboard"
    When Click Report
    And Click Revenue Recognition
    And read revenuse recognition
    Then check table is visible in revenue recognition
    And Click Leave Summary in report
    And read leave summary in report
    Then check table is visible in leave summary
    And Click Attendance Summary
    And read attendance summary in report
    Then check table is visible in attendance summary
    And Click Active Employees
    And read active employees
    Then check table is visible in active employees
    And Click Joiners
    And read joiners
    Then check table is visible in joiners
    And Click Leavers
    And read leavers
    Then check table is visible in leavers
    And Click Attendance Register
    And read attendance register
    Then check table is visible in attendance register
    And Click Team Allocation in report
    And read team allocation
    Then check table is visible in team allocation
    And Close browser

  @HRJobPosition
  Scenario: Job position
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$"
    And Click Login button
    Then The Page Tile should display "Dashboard"
    When click job position
    And add job position
    #Then check the confirmation message in add job position as "Job Position saved successfully. "
    When read job position
    And update job position
    #Then check the confirmation message in update job position as "Job Position Updated Successfully."
    When click consultancy
    And click consultancy summary
    Then The Page Tile should display "Consultancy"
    And click add consultancy button
    And add details in create consultancy
    #Then check the confirmation message in add create consultancy as "Consultancy Created Successfully"
    When read consultancy
    And edit consultancy
    Then check the confirmation message in edit consultancy as "Consultancy Updated Successfully"
    When click job
    And click  job summary
    Then The Page Tile should display "Jobs"
    When click add job button
    And add job
    Then check the confirmation message in add job as "Job Created Successfully"
    When search job
    And edit job
    Then check the confirmation message in edit job as "Job Updated Successfully"
    When add candidate
    Then check the confirmation message in edit job as "Candidate Created Successfully"
    When read candidate
    And edit candidate
    Then check the confirmation message in edit job as "Candidate Updated Successfully"
    And Close browser
