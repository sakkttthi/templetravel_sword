package pageobjects;


import java.time.Duration;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy(xpath = "(//div[@role='alert'])[1]")
	WebElement alert;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement field_Search;
	
	@FindBy(xpath = "//*[@id=\"datatable\"]/tbody/tr[1]/td[2]")
	WebElement table_first;
	
	@FindBy(how = How.XPATH, using ="//body[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")
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
	
	@SuppressWarnings("deprecation")
	public void read(String str1) {
		field_Search.sendKeys(str1);
//		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebDriverWait waits = new WebDriverWait(ldriver, Duration.ofSeconds(10000));
		String actual = waits.until(ExpectedConditions.visibilityOf(table_first)).getText();
		System.out.println(actual);
		Assert.assertEquals(str1, actual);
	}
	
	public void update(String str) {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.visibilityOf(button_edit)).click();
//		button_edit.click();
		field_JobPosition.sendKeys(str);
		wait.until(ExpectedConditions.visibilityOf(button_update)).click();
//		button_update.click();
	}
		

}
