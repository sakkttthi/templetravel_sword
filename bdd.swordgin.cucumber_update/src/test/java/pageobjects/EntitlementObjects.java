package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntitlementObjects {
	WebDriver ldriver;

	public EntitlementObjects(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath ="//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/a")
	WebElement EntitlementMenu;
	
	@FindBy(xpath =  "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/ul/li[1]/a")
	WebElement CasualLeave;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/ul/li[2]/a")
	WebElement PrivilegeLeave;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/ul/li[3]/a")
	WebElement SickLeave;
	
	public void clickEntitlementMenu () {
		EntitlementMenu.click();
	}	
	
	
	public void clickCasualLeave () {
		CasualLeave.click();
	}
	
	public void clickPrivilegeLeave () {
		PrivilegeLeave.click();
	}

	public void clickSickLeave () {
		SickLeave.click();
	}

	
}
