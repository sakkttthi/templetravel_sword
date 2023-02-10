package pageobjects;


import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;


public class JobPositionObject {
	WebDriver ldriver;

	public JobPositionObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//a[@href='https://templetravel.in/hrm-sword/job-position']")
	WebElement Job_Position;
	
	@FindBy(xpath = "(//input[@id='position'])[1]")
	WebElement field_JobPosition;
	
	@FindBy(xpath = "(//select[@id='status'])[1]")
	WebElement dropdown_Status;
	
	@FindBy(xpath = "(//option[@value='1'])[1]")
	WebElement dropdown_option_Status;
	
	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement button_add;
	
	@FindBy(xpath = "//div[@role='alert']")
	WebElement alert;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement field_Search;
	
	@FindBy(xpath = "//*[@id=\"datatable\"]/tbody/tr[1]/td[2]")
	WebElement table_first;
	
	@FindBy(xpath = "(//a)[63]")
	WebElement button_edit;
	
	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement button_update;
	
	
	
	public void clickJob_Position ()  {
		Job_Position.click();
	}
	
	public void addJob(String str) {
		field_JobPosition.sendKeys(str);
		dropdown_Status.click();
		dropdown_option_Status.click();
		button_add.click();
	}
	
	public Object alert() {
		return alert.getText();
	}
	
	public void read(String str1) throws Exception {
		field_Search.sendKeys(str1);
		ldriver.wait(5000);
		Assert.assertEquals(str1,table_first.getText());
	}
	
	public void update(String str) {
		button_edit.click();
		field_JobPosition.sendKeys(str);
		button_update.click();
	}
		

}
