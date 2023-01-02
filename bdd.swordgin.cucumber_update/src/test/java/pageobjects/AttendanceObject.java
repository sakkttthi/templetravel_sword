package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AttendanceObject {
	WebDriver ldriver;

	public AttendanceObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[10]/a")
	WebElement AttendanceMenu;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[10]/ul/li[1]/a")
	WebElement AddMyAttendance;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[10]/ul/li[2]/a")
	WebElement MyAttendaceSummary;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[10]/ul/li[3]/a")
	WebElement StandupAttendance;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[10]/ul/li[4]/a")
	WebElement AssignAttendace;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[10]/ul/li[5]/a")
	WebElement TeamAttendanceSummary;
	
	public void clickAttendanceMenu () {
		AttendanceMenu.click();
	}
	
	public void AddMyAttendance () {
		AddMyAttendance.click();
	}
	
	public void MyAttendanceSummary () {
		MyAttendaceSummary.click();
	}
	
	public void StandupAttendance () {
		StandupAttendance.click();
	}
	
	public void AssignAttendance () {
		AssignAttendace.click();
	}
	
	public void TeamAttendaneSummary () {
		TeamAttendanceSummary.click();
	}
}
