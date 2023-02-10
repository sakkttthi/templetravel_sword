
Feature: Smoke Test

	@1Login
  Scenario: Login to HRMS with valid credentials
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$" 
    And Click Login button
    Then The Page Tile should display "Dashboard" 
    When Click Logout
    And Close browser
    
   @2smoke 
  Scenario: Login to HRMS, cheking with each Menu/Submenu and Checking with its Title
    Given Launch chrome browser
    When Open URl "https://templetravel.in/hrm-sword/"
    And Enter Username as "raviramu@swordgroup.in" and Password as "Asdf123$" 
    And Click Login button
    Then The Page Tile should display "Dashboard" 
    When Click EmployeeMenu
    And Click Designation
    Then The Page Tile should display "Designation"
    And Click Add Employee
    Then The Page Tile should display "Add Employee" 
    And Click Employee Master
    Then The Page Tile should display "Employees" 
   	When Click Entitlement
   	And Click Casul Leave
   	Then The Page Tile should display "Casual Leave Entitlement" 
   	When Click Privilege Leave
   	Then The Page Tile should display "Privilege Leave Entitlement" 
   	When Click Sick Leave
   	Then The Page Tile should display "Sick Leave Entitlement" 
   	When Click Project
   	And Click Project Master
   	Then The Page Tile should display "Projects" 
   	When Click Create Project
   	Then The Page Tile should display "Create Project" 
   	When Click Team Allocation
   	And Click Team Allocation Summary
   	Then The Page Tile should display "Team Allocation Summary" 
   	When Click Create Team Allocation
   	Then The Page Tile should display "Create Team Allocation" 
   	When Click Announcement
   	Then The Page Tile should display "Announcement" 
   	When Click Holiday Master
   	Then The Page Tile should display "Holidays" 
   	When Click Leave Management
   	And Click Apply Leave
   	Then The Page Tile should display "Apply Leave" 
   	When Click Leave Summary
   	Then The Page Tile should display "Leave Summary" 
   	When Click Assign Leave
   	Then The Page Tile should display "Assign Leave" 
   	When Click Approve Leave
   	Then The Page Tile should display "Manage Leave" 
   	When Click Attendance
   	And Click Add My Attendance
   	Then The Page Tile should display "Add Attendance"
   	When Click My Attendance Summary
   Then The Page Tile should display "Attendance"
   When Click Standup Attendance 
   Then The Page Tile should display "Team Attendance"
   When Click Assign Attendance
   Then The Page Tile should display "Assign Attendance"
   When Click My Team Attendance Summary
   Then The Page Tile should display "Attendance"
   When Click Report
   And Click Revenue Recognition
   Then The Page Tile should display "RR Report"
   When Click Leave Summary in report
   Then The Page Tile should display "Employees Leave Summary Report"
   When Click Attendance Summary
   Then The Page Tile should display "Employees Attendance Summary Report"
    When Click Active Employees
   Then The Page Tile should display "Active Employees List Report"
   When Click Joiners
   Then The Page Tile should display "Employee Joining Report"
   When Click Leavers
   Then The Page Tile should display "Employee Leaving Report"
   When Click Attendance Register
   Then The Page Tile should display "Attendance Register"
    When Click Team Allocation in report
   Then The Page Tile should display "Employees Team Allocation Report"
   When Click Self Report
   And Click Leave Summary in Self Report
   Then The Page Tile should display "Employees Leave Summary Report"
   When Click Attendance Summary in Self Report
    Then The Page Tile should display "Employees Attendance Summary Report"
    When Click Leave Report
    And Click Leave Record
    Then The Page Tile should display "Leave Record Report"   
    When Click Leave Details
      Then The Page Tile should display "Year Leave Detail Report" 
     When Click Feedback
     And Click Feedback List
     Then The Page Tile should display "Feedback" 
     When Click Submit Feedback
     Then The Page Tile should display "Give Your Feedback" 
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
        And Close browser
     
     
     
    
      
     
     
   
   
   
   
   
   
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   
    
  