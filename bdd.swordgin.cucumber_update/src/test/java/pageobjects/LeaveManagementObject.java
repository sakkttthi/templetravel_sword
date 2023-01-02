package pageobjects;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class LeaveManagementObject {
	WebDriver ldriver;

	public LeaveManagementObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[9]/a/span")
	WebElement LeaveManagementMenu;

	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[9]/ul/li[1]/a")
	WebElement ApplyLeave;

	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[9]/ul/li[2]/a")
	WebElement LeaveSummary;
	
	@FindBy (xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[9]/ul/li[3]/a")
	WebElement AssignLeave;
	
	@FindBy (xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[9]/ul/li[4]/a")
	WebElement ApproveLeave;
	
	@FindBy (xpath = "//*[@id=\"leave\"]/div/div[2]/div[1]/select/option[3]")
	WebElement dropdown_LeaveType;
	
	@FindBy (xpath = "//input[@id='startDate']")
	WebElement date_FromDate;
	
	@FindBy (xpath = "//body/div[@id='datepickers-container']/div[1]/div[1]/div[1]/div[2]/div[20]")
	WebElement date_DatePicker;
	
	@FindBy (xpath = "//div[@class='mb-3 col-md-12']//input[@id='name']")
	WebElement field_LeaveReason;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement button_Save;
	
	@FindBy (xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement button_SaveAssignLeave;
	
	@FindBy (xpath = "//input[@aria-controls='datatable']")
	WebElement field_Search;
	
	@FindBy(xpath = "//*[@id=\"datatable\"]/tbody/tr[1]/td[6]")
	WebElement sort_table;
	
	@FindBy(xpath = "//*[@id=\"datatable\"]/tbody/tr[2]/td[10]/a")
	WebElement button_Action;
	
	@FindBy(xpath = "//div[@role='alert']")
	WebElement Alert;
	
//	Assign Leave
	@FindBy(xpath = "//input[@id='employee_search']")
	WebElement field_EmployeeName;
	
	@FindBy(xpath = "//div[@id='ui-id-3']")
	WebElement fieldPicker_EmployeeName;
	
	@FindBy(xpath = "//option[@value='2']")
	WebElement dropDown_LeaveTypeAssignLeave;
	
	@FindBy(xpath = "//body/div[@id='datepickers-container']/div[1]/div[1]/div[1]/div[2]/div[19]")
	WebElement datePicker;
	
	@FindBy(xpath = "//input[@id='startDate']")
	WebElement date;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement field_LeaveReasonAssignLeave;
	
	@FindBy(xpath = "//tbody/tr[1]/td[10]/a[1]")
	WebElement button_Approve;
	
	@FindBy(xpath = "//tbody/tr[1]/td[10]/a[1]")
	WebElement button_Reject;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement button_Submit;
	
	
	public void clickLeaveManagementMenu() {
		LeaveManagementMenu.click();
	}
	
	public void clickApplyLeave() {
		ApplyLeave.click();
	}
	
	public void clickLeaveSummary() {
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LeaveSummary.click();
	}
	
	public void clickAssignLeave() {
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		AssignLeave.click();
	}
	
	public void clickApproveLeave() {
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ApproveLeave.click();
	}
	public void leaveCredentials(String str) {
		dropdown_LeaveType.click();
		date_FromDate.click();
		date_DatePicker.click();
		field_LeaveReason.sendKeys(str);
		button_Save.click();
	}
	public void Search (String str) {
		field_Search.click();
		field_Search.sendKeys(str);
	}
	public void sortTable (String string) {
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String tableText = sort_table.getText();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expectedText = string;
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertEquals(expectedText, tableText);
	}
	public void updateLeave (String str) {
		button_Action.click();
		field_LeaveReason.sendKeys(str);
		button_Save.click();
	}
	public Object leaveManagementAlertMessage() {
		return Alert.getText();
	}
	
	public void assignLeaveInputs (String str) {
		field_EmployeeName.sendKeys(str);
		fieldPicker_EmployeeName.click();
		dropDown_LeaveTypeAssignLeave.click();
		date.click();
		datePicker.click();
		field_LeaveReasonAssignLeave.sendKeys("Test");
		button_Save.click();
	}
	
	public void clickApprove () {
		button_Approve.click();
		button_Submit.click();
	}
	
	public void clickReject () {
		button_Reject.click();
		button_Submit.click();	}
}
