package pageobjects;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	WebDriver ldriver;

	public LoginPageObjects(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "email")
	WebElement Email;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(how = How.XPATH,using = "//button[@type='submit']")
	WebElement LoginButton;
	
	@FindBy (xpath = "//*[@id=\"pageWrapper\"]/div[1]/div/div[3]/ul/li[3]/div")
	WebElement LogoutHover;
	
	@FindBy (xpath = "//*[@id=\"pageWrapper\"]/div[1]/div/div[3]/ul/li[3]/ul/li[2]/a/span")
	WebElement LogoutButton;
	
	

	public void setUserName(String username) {
		Email.sendKeys(username);
	}

	public void setPassword(String password) {
		Password.sendKeys(password);
	}

	public void clickLogin() {
		LoginButton.click();
	}
	
	public void logOut() {
		Actions action = new Actions(ldriver);
		action.moveToElement(LogoutHover).perform();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LogoutButton.click();
	}
}
