package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddAttendanceObject {
	WebDriver ldriver;

	public AddAttendanceObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "attendance_picker")
	WebElement Date;
	
	@FindBy(how = How.XPATH,using = "//div[contains (@class,'-current-')]")
	WebElement currentDate;
	
	@FindBy(how = How.XPATH,using =  "//button[@type='submit']")
	WebElement Submitbutton;
	
	
	public void date () {
		Date.click();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		currentDate.click();
		Submitbutton.click();
	}
}
