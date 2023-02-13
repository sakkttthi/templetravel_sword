package stepdefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.AnnouncementObject;
import pageobjects.AttendanceObject;
import pageobjects.CandidatesObject;
import pageobjects.ConsultancyObject;
import pageobjects.EmployeeObject;
import pageobjects.EntitlementObjects;
import pageobjects.FeedbackObjects;
import pageobjects.HolidayMasterObject;
import pageobjects.JobObject;
import pageobjects.JobPositionObject;
import pageobjects.LeaveManagementObject;
import pageobjects.LeaveReportObject;
import pageobjects.LoginPageObjects;
import pageobjects.ProjectsObject;
import pageobjects.ReportObject;
import pageobjects.SelfReportObject;
import pageobjects.TeamAllocationObject;

public class Steps extends Base {

//	Scenario: Login to HRMS with valid credentials

	@Given("Launch chrome browser")
	public void launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lpo = new LoginPageObjects(driver);
	}

	@When("Open URl {string}")
	public void open_u_rl(String string) {
		driver.get(string);
		driver.manage().window().maximize();
	}

	@When("Enter Username as {string} and Password as {string}")
	public void enter_username_as_and_password_as(String uname, String passwrd) {
		lpo.setUserName(uname);
		lpo.setPassword(passwrd);
	}

	@When("Click Login button")
	public void click_login_button() {
		lpo.clickLogin();
	}

	@Then("The Page Tile should display {string}")
	public void the_page_tile_should_display_or(String Title) {
		AAO = new pageobjects.AddAttendanceObject(driver);
		if (driver.getTitle().equalsIgnoreCase("Add Attendance")) {
			AAO.date();
		} else {
			Assert.assertEquals(Title, driver.getTitle());
		}
	}

	@Then("Amend the Employee in field")
	public void amend_the_employee_in_field() {
		EO.editFirstNameTextField(ds1);

	}

	@When("Click Logout")
	public void click_logout() {
		lpo.logOut();
	}

	@When("Close browser")
	public void close_browser() {
		driver.close();
	}

	// Scenario: Login to HRMS, checking with each Menu/Submenu and Checking with
	// its Title

	@When("Click EmployeeMenu")
	public void click_employee_menu() {
		EO = new EmployeeObject(driver);
		EO.clickEmployeeMenu();
	}

	@When("Click Designation")
	public void click_designation() {
		EO.clickDesignation();
	}

	@Then("Click Add Employee")
	public void click_add_employee() {
		EO.clickAddEmployee();
	}

	@Then("Click Employee Master")
	public void click_employee_master() {
		EO.clickEmployeeMaster();
	}

	@When("Click Entitlement")
	public void click_entitlement() {
		EntO = new EntitlementObjects(driver);
		EntO.clickEntitlementMenu();
	}

	@When("Click Casul Leave")
	public void click_casul_leave() {
		EntO.clickCasualLeave();
	}

	@When("Click Privilege Leave")
	public void click_privilege_leave() {
		EntO.clickPrivilegeLeave();
	}

	@When("Click Sick Leave")
	public void click_sick_leave() {
		EntO.clickSickLeave();
	}

	@When("Click Project")
	public void click_project() {
		PrO = new ProjectsObject(driver);
		PrO.clickProjectMenu();
	}

	@When("Click Project Master")
	public void click_project_master() {
		PrO.clickProjectMaster();
	}

	@When("Click Create Project")
	public void click_create_project() {
		PrO.clickCreateProject();
	}

	@When("enter valid credentials in create project")
	public void enter_valid_credentials_in_create_project() {
		PrO.validCredentials(projectRText);
	}

	@When("Click Add in projects")
	public void click_add_in_projects() {
		PrO.clickAddinProjects();
	}

	@When("Click Team Allocation")
	public void click_team_allocation() {
		TAO = new TeamAllocationObject(driver);
		TAO.clickTeamAllocationMenu();
	}

	@When("Click Team Allocation Summary")
	public void click_team_allocation_summary() {
		TAO.clickTeamAllocationSummary();
	}

	@When("Click Create Team Allocation")
	public void click_create_team_allocation() {
		TAO.clickCreatTeamAllocation();
	}

	@When("Click Announcement")
	public void click_announcement() {
		AO = new AnnouncementObject(driver);
		AO.clickAnnouncement();
	}

	@When("Click Holiday Master")
	public void click_holiday_master() {
		HMO = new HolidayMasterObject(driver);
		HMO.clickHolidayMaster();
	}

	@When("Click Leave Management")
	public void click_leave_management() {
		LMO = new LeaveManagementObject(driver);
		LMO.clickLeaveManagementMenu();
	}

	@When("Click Apply Leave")
	public void click_apply_leave() {
		LMO.clickApplyLeave();
	}

	@When("Click Leave Summary")
	public void click_leave_summary() {
		LMO.clickLeaveSummary();
	}

	@When("Click Assign Leave")
	public void click_assign_leave() {
		LMO.clickAssignLeave();
	}

	@When("Click Approve Leave")
	public void click_approve_leave() {

		LMO.clickApproveLeave();
	}

	@When("Click Attendance")
	public void click_attendance() {
		ATO = new AttendanceObject(driver);
		ATO.clickAttendanceMenu();
	}

	@When("Click Add My Attendance")
	public void click_add_my_attendance() {
		ATO.AddMyAttendance();
	}

	@When("Click My Attendance Summary")
	public void click_my_attendance_summary() {
		ATO.MyAttendanceSummary();
	}

	@When("Click Standup Attendance")
	public void click_standup_attendance() {
		ATO.StandupAttendance();
	}

	@When("Click Assign Attendance")
	public void click_assign_attendance() {
		ATO.AssignAttendance();
	}

	@When("Click My Team Attendance Summary")
	public void click_my_team_attendance_summary() {
		ATO.TeamAttendaneSummary();
	}

	@When("Click Report")
	public void click_report() {
		RO = new ReportObject(driver);
		RO.clickreportMenu();
	}

	@When("Click Revenue Recognition")
	public void click_revenue_recognition() {
		RO.clickrevenueRecognition();
	}

	@When("Click Leave Summary in report")
	public void click_leave_summary_in_report() {
		RO.clickleaveSumary();
	}

	@When("Click Attendance Summary")
	public void click_attendance_summary() {
		RO.clickattendanceSummary();
	}

	@When("Click Active Employees")
	public void click_active_employees() {
		RO.clickactiveEmployees();
	}

	@When("Click Joiners")
	public void click_joiners() {
		RO.clickjoiners();
	}

	@When("Click Leavers")
	public void click_leavers() {
		RO.clickleavers();
	}

	@When("Click Attendance Register")
	public void click_attendance_register() {
		RO.clickattendanceRegister();
	}

	@When("Click Team Allocation in report")
	public void click_team_allocation_in_report() {
		RO.clickteamAllocation();
	}

	@When("Click Self Report")
	public void click_self_report() {
		SRO = new SelfReportObject(driver);
		SRO.clickSelfReportMenu();
	}

	@When("Click Leave Summary in Self Report")
	public void click_leave_summary_in_self_report() {
		SRO.clickLeaveSummary();
	}

	@When("Click Attendance Summary in Self Report")
	public void click_attendance_summary_in_self_report() {
		SRO.clickAttendanceSummary();
	}

	@When("Click Leave Report")
	public void click_leave_report() {
		LRO = new LeaveReportObject(driver);
		LRO.clickLeaveReportMenu();
	}

	@When("Click Leave Record")
	public void click_leave_record() {
		LRO.clickLeaveRecord();
	}

	@When("Click Leave Details")
	public void click_leave_details() {
		LRO.clickLeaveDetails();
	}

	@When("Click Feedback")
	public void click_feedback() {
		FBO = new FeedbackObjects(driver);
		FBO.clickFeedbackMenu();
	}

	@When("Click Feedback List")
	public void click_feedback_list() {
		FBO.clickFeedback();
	}

	@When("Click Submit Feedback")
	public void click_submit_feedback() {
		FBO.clickSubmitFeedback();
	}

//	 Scenario - 3: Employee Menu
	@When("Click Add Designation")
	public void click_add_designation() {
		EO.clickAddDesignationButton();
	}

	@When("Click Designation field")
	public void click_designation_field() {
		EO.clickDesignationField();
	}

	@When("Enter Designation in field")
	public void enter_designation_in_field() {
		EO.enterValueinDesignationField(ds1);
	}

	@When("Click Add")
	public void click_add() {
		EO.clickAddButton();
	}

	@Then("check the confirmation message appear as {string}")
	public void check_the_confirmation_message_appear_as(String string) {
		Assert.assertEquals(string, EO.designationAlertMessage());
	}

	@Then("check the confirmation message in projects appear as {string}")
	public void check_the_confirmation_message_in_projects_appear_as(String string) {
		Assert.assertEquals(string, PrO.projetcsAlertMessage());
	}

	@Then("check the confirmation message in announcement appear as {string}")
	public void check_the_confirmation_message_in_announcement_appear_as(String string) {
		Assert.assertEquals(string, AO.announcementAlertMessage());
	}

	@Then("check the confirmation message in team allocation appear as {string}")
	public void check_the_confirmation_message_in_team_allocation_appear_as(String string) {
		Assert.assertEquals(string, TAO.teamAllocationAlertMessage());
	}

	@Then("check the confirmation message in holiday master appear as {string}")
	public void check_the_confirmation_message_in_holiday_master_appear_as(String string) {
		Assert.assertEquals(string, HMO.holidayAlertMessage());
	}

	@Then("check the confirmation message in leave management as {string}")
	public void check_the_confirmation_message_in_leave_management_as(String string) {
		Assert.assertEquals(string, LMO.leaveManagementAlertMessage());
	}

	@Then("check the confirmation message in feedback as {string}")
	public void check_the_confirmation_message_in_feedback_as(String string) {
		Assert.assertEquals(string, FBO.feedbackAlertMessage());
	}

	@Then("check the confirmation message in leave report as {string}")
	public void check_the_confirmation_message_in_leave_report_as(String string) {
		Assert.assertEquals(string, LRO.leaveReportMessage());
	}

	@When("Click Search field in project")
	public void click_search_field_in_project() {
		PrO.clickSearch();
	}

	@When("Enter project in Search field")
	public void enter_project_in_search_field() {
		PrO.enterSearch(projectRText);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Search project should be sorted in project table")
	public void search_project_should_be_sorted_in_project_table() {
		PrO.sortTable(projectRText);
	}

	@When("Click ActionButton in projects")
	public void click_action_button_in_projects() {
		PrO.clickAction();
	}

	@Then("Amend the Project in field")
	public void amend_the_project_in_field() {
		PrO.editProjectManager();
		PrO.clickUpdate();
	}

	@When("Enter Edit project in Search field")
	public void enter_edit_project_in_search_field() {
		PrO.enterSearch(projectRText);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Search Edit project should be sorted in table")
	public void search_edit_project_should_be_sorted_in_table() {
		PrO.sortTable(projectRText);
	}

	@When("Click Search field")
	public void click_search_field() {
		EO.clickinSeach();
	}

//	Designation
	@When("Enter Designation in Search field")
	public void enter_designation_in_search_field() {
		EO.enterinSeach(ds1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Enter Employee in Search field")
	public void enter_employee_in_search_field() {
		EO.enterinSeach(randomEmployee);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Search Designation should be sorted in table")
	public void search_designation_should_be_sorted_in_table() {
		EO.sortTable1(ds1);
	}

	@Then("Search Employee should be sorted in table")
	public void search_employee_should_be_sorted_in_table() {
		EO.sortTable2(randomEmployee);
	}

	@Then("Search Edit Employee should be sorted in table")
	public void search_edit_employee_should_be_sorted_in_table() {
		EO.sortTable2(ds1);
	}

	@When("Click ActionButton in EmployeeMaster")
	public void click_action_button_in_employee_master() {
		EO.clickActionButton2();
	}

//Edit Designation
	@When("Enter Edit Designation in Search field")
	public void enter_edit_designation_in_search_field() {
		EO.enterinSeach(ds2);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Enter Edit Employee in Search field")
	public void enter_edit_employee_in_search_field() {
		EO.enterinSeach(ds1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Search Edit Designation should be sorted in table")
	public void search_edit_designation_should_be_sorted_in_table() {
		EO.sortTable1(ds2);
	}

	@When("Click ActionButton")
	public void click_action_button() {
		EO.clickActionButton1();
	}

	@When("Click EditDesignation field")
	public void click_edit_designation_field() {
		EO.clickEditDesignation();
	}

	@When("Clear field")
	public void clear_field() {
		EO.clearField();
	}

	@When("Enter Edit Designation in field")
	public void enter_edit_designation_in_field() {
		EO.enterEditDesignation(ds2);
	}

	@When("Click update")
	public void click_update() {
		EO.clickUpdateButton();
	}

//	Scenario - 4: Add Employee

	@When("entering valid input in all fields")
	public void entering_valid_input_in_all_fields() {
		EO.randomStringField(randomEmployeeMail, randomEmployee, randomtxt1, randomNumber, randomlongtext);
		EO.dropDown();
		EO.checkBox();
		EO.radioButton();
		EO.dateOfJoining();
		EO.dateOfBirth();
		EO.phoneNumber(phoneNumber1);
		EO.uploadImage();
	}

	@When("click add employee in employee menu")
	public void click_add_employee_in_employee_menu() {
		EO.clickAddEmployee();
	}

	@When("click add in add employee submenu")
	public void click_add_in_add_employee_submenu() {
		EO.createEmployee();
	}

//	Senario7 : Announcement
	@When("click add announcement")
	public void click_add_announcement() {
		AO.clickAddAnnouncement();
	}

	@When("create announcement")
	public void create_announcement() {
		AO.enterTitle(randomtxt1);
		AO.enterDescription(randomlongtext);
		AO.selectStatusDropdown();
		AO.clickAdd();
	}

	@When("search announcement")
	public void search_announcement() {
		AO.Search(randomtxt1);
	}

	@Then("Search announcement should be sorted in table")
	public void search_announcement_should_be_sorted_in_table() {
		AO.sortTable(randomtxt1);
	}

	@When("update announcement")
	public void update_announcement() {
		AO.update(randomtxt2);
	}

//	Senario8 : Holiday Master

	@When("click add holiday")
	public void click_add_holiday() {
		HMO.clickAddHoliday();
	}

	@When("create holiday")
	public void create_holiday() {
		HMO.addHolidayIputs(projectRText);
	}

	@When("search holiday")
	public void search_holiday() {
		HMO.searchHoliday(projectRText);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Search holiday should be sorted in table")
	public void search_holiday_should_be_sorted_in_table() {
		HMO.sortTable(projectRText);
	}

	@When("update holiday")
	public void update_holiday() {
		HMO.updateHoliday(projectRtext1);
	}

//	Senario9 : Leave management menu --> Apply leave

	@When("create leave")
	public void create_leave() {
		LMO.leaveCredentials("Leave for " + randomtxt1);
	}

	@When("search leave")
	public void search_leave() {
		LMO.Search("Leave for " + randomtxt1);
	}

	@Then("Search leave should be sorted in table")
	public void search_leave_should_be_sorted_in_table() {
		LMO.sortTable("Leave for " + randomtxt1);
	}

	@When("update leave")
	public void update_leave() {
		LMO.updateLeave("Leave for " + randomtxt2);
	}

//	Senario10 : Leave management menu --> Assign leave

	@When("assign leave")
	public void assign_leave() {
		LMO.assignLeaveInputs("s");
	}

//	Scenario11 : Leave management	--> Approve leave

	@When("click approve")
	public void click_approve() {
		LMO.clickApprove();
	}

	@Then("click reject")
	public void click_reject() {
		LMO.clickReject();
	}

//	Scenario6: Team Allocation

	@When("create team allocation")
	public void create_team_allocation() {
		TAO.creatTeamAllocation("t", randomNumber);
	}

	@When("search team allocation")
	public void search_team_allocation() {
		TAO.Search();
	}

	@Then("Search team allocation should be sorted in table")
	public void search_team_allocation_should_be_sorted_in_table() {
		TAO.sortTable();
	}

	@When("update team allocation")
	public void update_team_allocation() {
		TAO.updateTeamAllocation();
	}

//	Scenario: Feedback

	@When("create feedback")
	public void create_feedback() {
		FBO.createFeedback(randomlongtext);
	}

//	Scenario: Leave Report

	@When("read leave record")
	public void read_leave_record() {
		LRO.leaveInput();
	}

	@Then("read leave Details")
	public void read_leave_details() {
		LRO.leaveInput();
	}

//	 Scenario: Self Report
	@When("read leave summary")
	public void read_leave_summary() {
		SRO.leaveInput();
	}

	@Then("check the confirmation message in self report as {string}")
	public void check_the_confirmation_message_in_self_report_as(String string) {
		SRO.leaveReportMessage();
	}

	@Then("read attendance summary")
	public void read_attendance_summary() {
		SRO.leaveInput();
	}

	@Then("check table is visible")
	public void check_table_is_visible() {
		SRO.visiblityOfTable();
	}

//	Scenario: Report

	@When("read revenuse recognition")
	public void read_revenuse_recognition() {
		RO.revenueRecognitionInputs();
	}

	@Then("check table is visible in revenue recognition")
	public void check_table_is_visible_in_revenue_recognition() {
		RO.cardVisible1();
	}

	@Then("check table is visible in leave summary")
	public void check_table_is_visible_in_leave_summary() {
		RO.cardVisible1();
	}

	@Then("read attendance summary in report")
	public void read_attendance_summary_in_report() {
		RO.attendanceSummaryInput();
	}

	@Then("check table is visible in attendance summary")
	public void check_table_is_visible_in_attendance_summary() {
		RO.cardVisible1();
	}

	@Then("read leave summary in report")
	public void read_leave_summary_in_report() {
		RO.leaveSummaryInput();
	}

	@Then("read active employees")
	public void read_active_employees() {
		RO.activeEmployeeInput();
	}

	@Then("check table is visible in active employees")
	public void check_table_is_visible_in_active_employees() {
		RO.cardVisible1();
	}

	@Then("read joiners")
	public void read_joiners() {
		RO.joinersAndLeaversInput();
	}

	@Then("check table is visible in joiners")
	public void check_table_is_visible_in_joiners() {
		RO.cardVisible1();
	}

	@Then("read leavers")
	public void read_leavers() {
		RO.joinersAndLeaversInput();
	}

	@Then("check table is visible in leavers")
	public void check_table_is_visible_in_leavers() {
		RO.cardVisible1();
	}

	@Then("read attendance register")
	public void read_attendance_register() {
		RO.attendanceRegisterInput();
	}

	@Then("check table is visible in attendance register")
	public void check_table_is_visible_in_attendance_register() {
		RO.cardVisible1();
	}

	@Then("read team allocation")
	public void read_team_allocation() {
		RO.teamAllocationInput();
	}

	@Then("check table is visible in team allocation")
	public void check_table_is_visible_in_team_allocation() {
		RO.cardVisible1();
	}
	@When("click job position")
	public void click_job_position() {
		JPO = new JobPositionObject(driver);
//		driver.findElement(By.xpath("(//a[@href='https://templetravel.in/hrm-sword/job-position'])[1]")).click();
		JPO.clickJob_Position();
	}

	@When("click consultancy")
	public void click_consultancy() {
		CO = new ConsultancyObject(driver);
//		driver.findElement(By.xpath("//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[16]/a")).click();
		CO.consultancy();
	}

	@When("click consultancy summary")
	public void click_consultancy_summary() {
//		driver.findElement(By.xpath("//a[normalize-space()='Consultancy Summary']")).click();
		CO.consultancy_Summary();
	}

	@When("click new consultancy")
	public void click_new_consultancy() {
//		driver.findElement(By.xpath("(//a[normalize-space()='New Consultancy'])[1]")).click();
		CO.consultancy_New();
	}

	@When("click job")
	public void click_job() {
		JO = new JobObject(driver);
//		driver.findElement(By.xpath("(//a[@class='sidebar-link sidebar-title'])[12]")).click();
		JO.clickJob();
	}

	@When("click  job summary")
	public void click_job_summary() {
//		driver.findElement(By.xpath("(//a[normalize-space()='Job Summary'])[1]")).click();
		JO.clickJob_Summary();
	}

	@When("click create job")
	public void click_create_job() {
//		driver.findElement(By.xpath("(//a[normalize-space()='Create Job'])[1]")).click();
		JO.clickJob_Create();
	}

	@When("click candidates")
	public void click_candidates() {
		CDO = new CandidatesObject(driver);
//		driver.findElement(By.xpath("(//a[@href='https://templetravel.in/hrm-sword/candidate'])[1]")).click();
		CDO.candidates();
	}
	
//	HR Module
	
	@When("add job position")
	public void add_job_position() {
		JPO.addJob(ds1);
	}
	@Then("check the confirmation message in add job position as {string}")
	public void check_the_confirmation_message_in_add_job_position_as(String string) {
		
		WebElement alt = driver.findElement(By.xpath("//div[@class='container-fluid return']"));
		System.out.println(alt.getText());
		Assert.assertEquals(string,alt.getText());
	}
	@When("read job position")
	public void read_job_position() {
			JPO.read(ds1);
	}
	@When("update job position")
	public void update_job_position() {
	   JPO.update(ds2);
	}
	@Then("check the confirmation message in update job position as {string}")
	public void check_the_confirmation_message_in_update_job_position_as(String string) {
		Assert.assertEquals(string, JPO.alert());
	}
	@Then("click add consultancy button")
	public void click_add_consultancy_button() {
	   CO.click_addConcultancy();
	}
	@Then("add details in create consultancy")
	public void add_details_in_create_consultancy() {
		CO.createConsultancy(ds2, ds1, phoneNumber1, randomEmployeeMail);
	}
	@Then("check the confirmation message in add create consultancy as {string}")
	public void check_the_confirmation_message_in_add_create_consultancy_as(String string) {

	}
	@When("read consultancy")
	public void read_consultancy() {
		CO.readSummary(ds1);
	}
	@When("edit consultancy")
	public void edit_consultancy() {
		CO.editConsultancy(randomtxt1);
	}
	@Then("check the confirmation message in edit consultancy as {string}")
	public void check_the_confirmation_message_in_edit_consultancy_as(String string) {

	}
	@When("click add job button")
	public void click_add_job_button() {
		JO.clickAddJob();
	}
	@When("add job")
	public void add_job() {
		JO.addJob(ds1,randomNumber, randomNumber, randomlongtext, randomlongtext);
	}
	@Then("check the confirmation message in add job as {string}")
	public void check_the_confirmation_message_in_add_job_as(String string) {

	}
	@When("search job")
	public void search_job() {
		JO.searchJob(ds1);
	}
	@When("edit job")
	public void edit_job() {

	}
	@Then("check the confirmation message in edit job as {string}")
	public void check_the_confirmation_message_in_edit_job_as(String string) {

	}
	@When("add candidate")
	public void add_candidate() {
		CDO.click_button_addCandidates();
		CDO.candidate_input(ds1, randomEmployeeMail, phoneNumber1, randomlongtext);
	}
	@When("read candidate")
	public void read_candidate() {

	}
	@When("edit candidate")
	public void edit_candidate() {

	}


}


