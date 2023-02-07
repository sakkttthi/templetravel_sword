package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CandidatesObject {
	WebDriver ldriver;

	public CandidatesObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "(//a[@href='https://templetravel.in/hrm-sword/candidate'])[1]")
	WebElement Candidates;
	
	
	public void candidates () {
		Candidates.click();
	}
}
