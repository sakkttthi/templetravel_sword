package pageobjects;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class ReportObject {
	WebDriver ldriver;

	public ReportObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[11]/a")
	WebElement ReportMenu;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[11]/ul/li[1]/a")
	WebElement RevenueRecognition;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/div[1]/div[2]/div[1]/div[1]/div[1]/li[11]/ul[1]/li[2]/a[1]")
	WebElement LeaveSummary;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[11]/ul/li[3]/a")
	WebElement AttendanceSummary;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[11]/ul/li[4]/a")
	WebElement ActiveEmployees;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[11]/ul/li[5]/a")
	WebElement Joiners;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[11]/ul/li[6]/a")
	WebElement Leavers;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[11]/ul/li[7]/a")
	WebElement AttendanceRegister;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[11]/ul/li[8]/a")
	WebElement TeamAllocation;
	
	@FindBy(xpath = "(//input[@id='currentmonth'])[1]")
	WebElement date_From;
	
	@FindBy(xpath = "(//input[@id='currentmonth2'])[1]")
	WebElement date_To;
	
	@FindBy(xpath = "(//div[@class='datepicker--cell datepicker--cell-day'][normalize-space()='1'])[1]")
	WebElement datepicker_From;
	
	@FindBy(xpath = "(//div[@class='datepicker--cell datepicker--cell-day'][normalize-space()='28'])[2]")
	WebElement datepicker_To;
	
	@FindBy(xpath = "(//input[@id='emp_date'])[1]")
	WebElement date_Emp;
	
	@FindBy(xpath = "//div[contains(@class,'current')]")
	WebElement datepicker_Emp;
	
	@FindBy(xpath = "(//input[@id='emp_from_date'])[1]")
	WebElement date_Empfrom;
	
	@FindBy(xpath = "(//div[@class='datepicker--cell datepicker--cell-day'][normalize-space()='1'])[1]")
	WebElement datepicker_Empfrom;
	
	@FindBy(xpath = "(//input[@id='emp_to_date'])[1]")
	WebElement date_EmpTo;
	
	@FindBy(xpath = "(//div[@class='datepicker--cell datepicker--cell-day'][normalize-space()='30'])[2]")
	WebElement datepicker_EmpTo;
	
	@FindBy(xpath = "(//input[@name='from_date'])[1]")
	WebElement date_attregfrom;
	
	@FindBy(xpath = "(//div[@class='datepicker--cell datepicker--cell-day'][normalize-space()='1'])[1]")
	WebElement datepicker_attregfrom;
	
	@FindBy(xpath = "(//input[@name='to_date'])[1]")
	WebElement date_attregTo;
	
	@FindBy(xpath = "(//div[@class='datepicker--cell datepicker--cell-day'][normalize-space()='30'])[2]")
	WebElement datepicker_attregTo;
	
	@FindBy(xpath = "(//input[@id='team_from_date'])[1]")
	WebElement date_teamfrom;
	
	@FindBy(xpath = "(//div[@class='datepicker--cell datepicker--cell-day'][normalize-space()='1'])[1]")
	WebElement datepicker_teamfrom;
	
	@FindBy(xpath = "(//input[@id='team_to_date'])[1]")
	WebElement date_teamTo;
	
	@FindBy(xpath = "(//div[@class='datepicker--cell datepicker--cell-day'][normalize-space()='30'])[2]")
	WebElement datepicker_teamTo;
	
	@FindBy(xpath = "(//select[@name='projectid'])[1]")
	WebElement dropdown_Project;
	
	@FindBy(xpath = "(//option[@value='19'])[1]")
	WebElement dropdownpicker_Project;
	
	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
	WebElement button_Search;
	
	@FindBy(xpath = "(//div[@class='card'])[2]")
	WebElement card_1;
	
	@FindBy(xpath = "(//div[@class='card'])[2])[1]")
	WebElement card_2;
	

	
	public void clickreportMenu () {
		ReportMenu.click();
	}
	
	public void clickrevenueRecognition () {
		RevenueRecognition.click();
	}
	
	public void clickleaveSumary () {
		LeaveSummary.click();
	}
	
	public void clickattendanceSummary () {
		AttendanceSummary.click();
	}
	
	public void clickactiveEmployees () {
		ActiveEmployees.click();
	}
	
	public void clickjoiners () {
		Joiners.click();
	}
	
	public void clickleavers () {
		Leavers.click();
	}
	
	public void clickattendanceRegister () {
		AttendanceRegister.click();
	}
	
	public void clickteamAllocation () {
		TeamAllocation.click();
	}
	
	public void revenueRecognitionInputs () {
		date_From.click();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		datepicker_From.click();
		date_To.click();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		datepicker_To.click();
		dropdown_Project.click();
		dropdownpicker_Project.click();
		button_Search.click();
	}
	
	public void cardVisible1 () {
		card_1.isDisplayed();
	}
	
	public void cardVisible2 () {
		card_2.isDisplayed();
	}
	public void attendanceSummaryInput () {
		button_Search.click();
	}
	public void leaveSummaryInput () {
		button_Search.click();
	}
	public void activeEmployeeInput () {
		date_Emp.click();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		datepicker_Emp.click();
		button_Search.click();
	}
	public void joinersAndLeaversInput () {
//		date_Empfrom.click();
//		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		datepicker_Empfrom.click();
//		date_EmpTo.click();
//		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		datepicker_EmpTo.click();
		button_Search.click();
	}
	public void attendanceRegisterInput () {
//		date_attregfrom.click();
//		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		datepicker_attregfrom.click();
//		date_attregTo.click();
//		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		datepicker_attregfrom.click();
		button_Search.click();
	}
	public void teamAllocationInput () {
//		date_teamfrom.click();
//		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		datepicker_teamfrom.click();
//		date_teamTo.click();
//		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		datepicker_teamfrom.click();
		button_Search.click();
	}
	
	
}
