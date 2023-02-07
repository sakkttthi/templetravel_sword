package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class JobObject {
	WebDriver ldriver;

	public JobObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "(//a[@class='sidebar-link sidebar-title'])[12]")
	WebElement Job;
	
	@FindBy(xpath = "(//a[normalize-space()='Job Summary'])[1]")
	WebElement Job_Summary;
	
	@FindBy(xpath = "(//a[normalize-space()='Create Job'])[1]")
	WebElement Job_Create;
	
	
	public void clickJob () {
		Job.click();
	}
	public void clickJob_Summary () {
		Job_Summary.click();
	}
	public void clickJob_Create() {
		Job_Create.click();
	}
	
}
