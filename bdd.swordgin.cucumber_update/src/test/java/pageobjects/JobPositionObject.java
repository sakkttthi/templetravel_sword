package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class JobPositionObject {
	WebDriver ldriver;

	public JobPositionObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//a[@href='https://templetravel.in/hrm-sword/job-position']")
	WebElement Job_Position;
	
	
	
	public void clickJob_Position ()  {
		
		Job_Position.click();
	}

}
