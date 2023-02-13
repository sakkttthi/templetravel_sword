package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConsultancyObject {
	WebDriver ldriver;

	public ConsultancyObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "(//a[@class='sidebar-link sidebar-title'])[11]")
	WebElement Consultancy;
	
	@FindBy(xpath = "(//a[normalize-space()='Consultancy Summary'])[1]")
	WebElement Consultancy_Summary;
	
	@FindBy(xpath = "(//a[normalize-space()='New Consultancy'])[1]")
	WebElement Consultancy_New;
	
	@FindBy(xpath = "(//a[normalize-space()='Add Consultancy'])[1]")
	WebElement button_addConcultancy;
	
	@FindBy(xpath = "(//input[@placeholder='Consultancy Name'])[1]")
	WebElement field_ConsultancyName;
	
	@FindBy(xpath = "(//input[@placeholder='Contact Person'])[1]")
	WebElement field_ContactPerson;
	
	@FindBy(xpath = "(//input[@name='contact_number'])[1]")
	WebElement field_ContactNumber;
	
	@FindBy(xpath = "(//input[@name='email'])[1]")
	WebElement field_EmailID;
	
	@FindBy(xpath = "(//input[@name='start_date'])[1]")
	WebElement date_Start;
	
	@FindBy(xpath = "(//div[@class='datepicker--cell datepicker--cell-day'][normalize-space()='1'])[1]")
	WebElement date_Startpicker;
	
	@FindBy(xpath = "(//input[@name='end_date'])[1]")
	WebElement date_End;
	
	@FindBy(xpath = "(//div[@class='datepicker--cell datepicker--cell-day'][normalize-space()='27'])[2]")
	WebElement date_Endpicker;
	
	@FindBy(xpath = "(//select[@name='status'])[1]")
	WebElement dropdown_status;
	
	@FindBy(xpath = "//option[@value='1']")
	WebElement dropdown_statuspicker;
	
	@FindBy(xpath = "(//input[@type='search'])[1]")
	WebElement search;
	
	@FindBy(xpath = "//tbody/tr[1]/td[9]/a[1]")
	WebElement button_edit;
	
	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement button_add;
	
	
	
	public void consultancy () {
		Consultancy.click();
	}
	
	public void consultancy_Summary () {
		Consultancy_Summary.click();
	}
	
	public void consultancy_New () {
		Consultancy_New.click();
	}
	public void click_addConcultancy () {
		button_addConcultancy.click();
	}
	public void createConsultancy (String cName, String cPerson, String cNumber, String email) {
		field_ConsultancyName.sendKeys(cName);
		field_ContactPerson.sendKeys(cPerson);
		field_ContactNumber.sendKeys(cNumber);
		field_EmailID.sendKeys(email);
		date_Start.click();
		date_Startpicker.click();
		date_End.click();
		date_Endpicker.click();
		dropdown_status.click();
//		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2000));
//		wait.until(ExpectedConditions.visibilityOf(dropdown_statuspicker));
		dropdown_statuspicker.click();
		button_add.click();
	}
	public void readSummary(String str) {
		search.click();
		search.sendKeys(str);
	}
	public void editConsultancy(String str) {
		button_edit.click();
		field_ConsultancyName.clear();
		field_ConsultancyName.sendKeys(str);
	}
}
