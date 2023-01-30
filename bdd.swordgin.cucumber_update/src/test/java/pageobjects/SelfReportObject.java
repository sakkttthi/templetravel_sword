package pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelfReportObject {
	WebDriver ldriver;

	public SelfReportObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "(//a[@href='#'])[8]")
	WebElement SelfReportMenu;
	
	@FindBy(xpath = "(//a[@href='https://templetravel.in/hrm-sword/leave-report-employee'])[1]")
	WebElement LeaveSummary;
	
	@FindBy(xpath = "(//a[@href='https://templetravel.in/hrm-sword/atten-report-emp'])[1]")
	WebElement AttendanceSummary;
	
	@FindBy(xpath = "(//input[@name='from_date'])[1]")
	WebElement date_fromDate;
	
	@FindBy(xpath = "(//input[@name='to_date'])[1]")
	WebElement date_toDate;
	
	@FindBy(xpath = "(//div[@class='datepicker--cell datepicker--cell-day'][normalize-space()='1'])[1]")
	WebElement datepicker_fromDate;
	
	@FindBy(xpath = "(//div[@class='datepicker--cell datepicker--cell-day'][normalize-space()='30'])[2]")
	WebElement datepicker_toDate;
	
	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
	WebElement button_Search;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/h2")
	WebElement verify;
	
	@FindBy(xpath = "(//div[@class='col-sm-12'])[1]")
	WebElement table;
	
	
	public void clickSelfReportMenu () {
		SelfReportMenu.click();
	}
	
	public void clickLeaveSummary () {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", LeaveSummary); 
		LeaveSummary.click();
//		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		LeaveSummary.click();
	}
	
	public void clickAttendanceSummary () {
		AttendanceSummary.click();
	}
	public void leaveInput () {
		button_Search.click();
	}

	public Object leaveReportMessage() {
		return verify.getText();
	}
	
	public void visiblityOfTable () {
		table.isDisplayed();
	}
}
