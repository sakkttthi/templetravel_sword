package pageobjects;

import java.time.Duration;

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
	@FindBy(xpath = "//body/div[@id='pageWrapper']/div[@class='page-body-wrapper']/div[@class='sidebar-wrapper']/div/nav[@class='sidebar-main']/div[@id='sidebar-menu']/ul[@id='simple-bar']/div[@class='simplebar-wrapper']/div[@class='simplebar-mask']/div[@class='simplebar-offset']/div[@class='simplebar-content-wrapper']/div[@class='simplebar-content']/li[12]/a[1]")
	WebElement SelfReportMenu;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/div[1]/div[2]/div[1]/div[1]/div[1]/li[12]/ul[1]/li[1]/a[1]")
	WebElement LeaveSummary;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[12]/ul/li[2]/a")
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
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(LeaveSummary)).click();
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
