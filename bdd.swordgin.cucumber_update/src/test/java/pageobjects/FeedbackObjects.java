package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeedbackObjects {
	WebDriver ldriver;

	public FeedbackObjects(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[14]/a/span")
	WebElement FeedbackMenu;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[14]/ul/li[1]/a")
	WebElement Feedback;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[14]/ul/li[2]/a")
	WebElement SubmitFeedback;
	
	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement date;
	
	@FindBy(xpath = "//div[contains(@class,'current')]")
	WebElement datePicker;
	
	@FindBy(xpath = "(//select[@name='hereismy'])[1]")
	WebElement dropDown_hereismy;
	
	@FindBy(xpath = "(//option[@value='Feedback'])[1]")
	WebElement dropDownpicker_hereismy;
	
	@FindBy(xpath = "(//select[@name='regarding'])[1]")
	WebElement dropDown_regarding;
	
	@FindBy(xpath = "(//option[@value='General'])[1]")
	WebElement dropDownpicker_regarding;
	
	@FindBy(xpath = "(//textarea[@id='exampleFormControlTextarea1'])[1]")
	WebElement field_description;
	
	@FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")
	WebElement button_Submit;
	
	@FindBy(xpath = "//div[@role='alert']")
	WebElement Alert;
	
	public void clickFeedbackMenu () {
		FeedbackMenu.click();
	}
	
	public void clickFeedback () {
		Feedback.click();
	}
	
	public void clickSubmitFeedback () {
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		SubmitFeedback.click();
	}
	
	public void createFeedback (String str) {
		date.click();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		datePicker.click();
		dropDown_hereismy.click();
		dropDownpicker_hereismy.click();
		dropDown_regarding.click();
		dropDownpicker_regarding.click();
		field_description.sendKeys(str);
		button_Submit.click();
	}
	public Object feedbackAlertMessage() {
		return Alert.getText();
	}
	
}
