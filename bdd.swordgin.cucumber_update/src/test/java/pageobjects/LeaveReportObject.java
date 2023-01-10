package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveReportObject {
	WebDriver ldriver;

	public LeaveReportObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[13]/a")
	WebElement LeaveReportMenu;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[13]/ul/li[1]/a")
	WebElement LeaveRecord;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[13]/ul/li[2]/a")
	WebElement LeaveDetails;
	

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
	
	public void clickLeaveReportMenu () {
		LeaveReportMenu.click();
	}
	
	public void clickLeaveRecord () {
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LeaveRecord.click();
	}
	
	public void clickLeaveDetails () {
		LeaveDetails.click();
	}
	public void leaveInput () {
//		date_fromDate.click();
//		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		datepicker_fromDate.click();
//		date_toDate.click();
//		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		datepicker_toDate.click();
		button_Search.click();
	}

	public Object leaveReportMessage() {
		return verify.getText();
	}
	
}
