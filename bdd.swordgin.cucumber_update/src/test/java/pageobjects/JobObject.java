package pageobjects;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
	
	@FindBy(xpath = "(//a[normalize-space()='Add Job'])[1]")
	WebElement button_addJob;
	
	@FindBy(xpath = "//select[@name='position_id']")
	WebElement dropdown_PositionName;
	
	@FindBy(xpath = "//input[@id='project_search']")
	WebElement field_Project;
	
	@FindBy(xpath = "(//div[@id='ui-id-4'])[1]")
	WebElement fieldpicker_Project;
	
	@FindBy(xpath = "//select[@name='canditate_type']")
	WebElement dropdown_CandidateType;
	
	@FindBy(xpath = "//option[@value='Fresher']")
	WebElement dropdownPicker_CandidateType;
	
	@FindBy(xpath = "(//select[@name='location'])[1]")
	WebElement dropdown_Location;
	
	@FindBy(xpath = "//option[@value='WFO']")
	WebElement dropdownpicker_Location;
	
	@FindBy(xpath = "(//select[@name='job_type_id'])[1]")
	WebElement dropdown_JobType;
	
	@FindBy(xpath = "(//option[@value='1'])[1]")
	WebElement dropdownpicker_JobType;
	
	@FindBy(xpath = "(//button[@class='btn btn-primary btn-square bootstrap-touchspin-up'])[1]")
	WebElement button_Headcount;
	
	@FindBy(xpath = "(//input[@name='minimum_salary'])[1]")
	WebElement field_MinSalary;
	
	@FindBy(xpath = "(//input[@name='maximum_salary'])[1]")
	WebElement field_MaxSalary;
	
	@FindBy(xpath = "(//input[@id='currency'])[1]")
	WebElement field_Currency;
	
	@FindBy(xpath = "(//select[@name='billing_mode'])[1]")
	WebElement dropdown_billingMode;
	
	@FindBy(xpath = "(//option[@value='Daily'])[1]")
	WebElement dropdownpicker_billingMode;
	
	@FindBy(xpath = "(//select[@name='importance'])[1]")
	WebElement dropdown_importance;
	
	@FindBy(xpath = "(//option[@value='Immediate'])[1]")
	WebElement dropdownpicker_importance;
	
	@FindBy(xpath = "(//input[@name='experience_required'])[1]")
	WebElement field_Exprequired;
	
	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement date_Jobposted;
	
	@FindBy(xpath = "(//div[@class='datepicker--cell datepicker--cell-day'][normalize-space()='1'])[1]")
	WebElement datepicker_Jobposted;
	
	@FindBy(xpath = "(//select[@name='job_owner'])[1]")
	WebElement dropdown_JobOwner;
	
	@FindBy(xpath = "(//option[@value='118'])[1]")
	WebElement dropdownpicker_JobOwner;
	
	@FindBy(xpath = "(//textarea[@id='exampleFormControlTextarea1'])[1]")
	WebElement field_Descrption;
	
	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement button_Add;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement field_search;
	
	@FindBy(xpath = "(//*[name()='polygon'])[1]")
	WebElement button_update;
	
	
	public void clickJob () {
		Job.click();
	}
	public void clickJob_Summary () {
		Job_Summary.click();
	}
	public void clickJob_Create() {
		Job_Create.click();
	}
	public void clickAddJob() {
		button_addJob.click();
	}
	public void addJob(String s1, String s2,String s3,String s4,String longtxt) {
		dropdown_PositionName.click();
		dropdown_PositionName.sendKeys(s1);
		field_Project.click();
		field_Project.sendKeys("Sword");
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebDriverWait wait1 = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
		wait1.until(ExpectedConditions.visibilityOf(fieldpicker_Project)).click();
		dropdown_CandidateType.click();
		dropdownPicker_CandidateType.click();
		dropdown_Location.click();
		dropdownpicker_Location.click();
		dropdown_JobType.click();
		dropdownpicker_JobType.click();
		button_Headcount.click();
//		Actions action = new Actions(ldriver);
//		action.doubleClick(button_Headcount);
		field_MinSalary.sendKeys(s2);
		field_MaxSalary.sendKeys(s3);
		field_Currency.sendKeys("Rupees");
		dropdown_billingMode.click();
		dropdownpicker_billingMode.click();
		field_Exprequired.sendKeys("2");
		field_Descrption.sendKeys(s4);
		dropdown_importance.click();
		dropdownpicker_importance.click();
		date_Jobposted.click();
		datepicker_Jobposted.click();
		dropdown_JobOwner.click();
		dropdownpicker_JobOwner.click();
		field_Descrption.sendKeys(longtxt);
		WebDriverWait wait2 = new WebDriverWait(ldriver, Duration.ofSeconds(5));
		wait2.until(ExpectedConditions.visibilityOf(button_Add));
	}
	public void searchJob(String str) {
//		field_search.sendKeys(str);
	}
	
}
