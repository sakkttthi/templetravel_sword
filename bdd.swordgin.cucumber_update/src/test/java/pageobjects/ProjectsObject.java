package pageobjects;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;


public class ProjectsObject {
	WebDriver ldriver;

	public ProjectsObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[5]/a")
	WebElement ProjectsMenu;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[5]/ul/li[1]/a")
	WebElement ProjectMaster;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[5]/ul/li[2]/a")
	WebElement CreateProject;
	
	@FindBy(name = "project_id")
	WebElement field_projectCode;
	
	@FindBy(name = "project_name")
	WebElement field_projectTitle;
	
	@FindBy(name = "project_location")
	WebElement field_Location;
	
	@FindBy(name = "currency")
	WebElement field_Currency;
	
	@FindBy(xpath = "//div[@role='alert']")
	WebElement Alert;
	
	@FindBy(xpath = "//*[@id=\"datatable_filter\"]/label/input")
	WebElement Search;
	
	@FindBy(xpath = "//*[@id=\"datatable\"]/tbody/tr[1]/td[8]/a")
	WebElement button_Action;
	
	
	
	
//	Button
	
	@FindBy(xpath = "//*[@id=\"pro\"]/div[5]/div/div/button")
	WebElement button_Add;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/div/form/div[5]/div/div/button")
	WebElement button_Update;
	
//	Dropdown
	
	@FindBy(xpath = "//select[@name='project_manager']//child::option[5]")
	WebElement dropDown_projectManager;
	
	@FindBy(xpath = "//select[@name='billing_mode']//child::option[2]")
	WebElement dropDown_billingMode;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/div/form/div[2]/div[1]/div/select/option[4]")
	WebElement dropDown_projectmanager1;
	
//	Date
	
	@FindBy(xpath = "//input[@name='start_date']")
	WebElement date_StartDate;
	
	@FindBy(xpath = "//*[@id=\"datepickers-container\"]/div[1]/div/div/div[2]/div[3]")
	WebElement datepick_StartDate;	
	
	@FindBy(xpath = "//input[@name='end_date']")
	WebElement date_EndDate;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[33]")
	WebElement datepick_EndDate;
	
//	Table
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[2]")
	WebElement table_project;
	
	
	public void clickProjectMenu () {
		ProjectsMenu.click();
	}
	public void clickProjectMaster () {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ProjectMaster)).click();
	}
	public void clickCreateProject () {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(CreateProject)).click();
//		CreateProject.click();
	}
	public void validCredentials (String str) {
		field_projectCode.sendKeys(str);
		field_projectTitle.sendKeys(str);
		field_Location.sendKeys(str);
		field_Currency.sendKeys(str);
		dropDown_projectManager.click();
		dropDown_billingMode.click();
		date_StartDate.click();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		datepick_StartDate.click();
		date_EndDate.click();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		datepick_EndDate.click();
	}
	
	public void clickAddinProjects() {
		button_Add.click();
	}
	
	public Object projetcsAlertMessage() {
		return Alert.getText();
	}
	
	public void clickSearch() {
		Search.click();
	}
	
	public void enterSearch(String str) {
		Search.sendKeys(str);
	}
	
	@SuppressWarnings("deprecation")
	public void sortTable(String string) {
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String tableText = table_project.getText();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expectedText = string;
		Assert.assertEquals(expectedText, tableText);
	}
	
	public void clickAction() {
		button_Action.click();
	}
	
	public void clickUpdate() {
		button_Update.click();
	}
	
	public void editProjectManager() {
		dropDown_projectmanager1.click();
	}
	
	
}
