package pageobjects;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;


public class TeamAllocationObject {
	WebDriver ldriver;

	public TeamAllocationObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[6]/a")
	WebElement TeamAllocationMenu;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[6]/ul/li[1]/a")
	WebElement TeamAllocationSummary;
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[6]/ul/li[2]/a")
	WebElement CreateTeamAllocation;
	
	@FindBy(xpath = "//div[@role='alert']")
	WebElement Alert;
	
	@FindBy(xpath = "//input[@id='employee_search']")
	WebElement field_EmployeeName;
	
	@FindBy(xpath = "(//div[@id='ui-id-3'])[1]")
	WebElement fieldpicker_EmployeeName;
	
	@FindBy(xpath = "//input[@id='project_search']")
	WebElement field_Project;
	
	@FindBy(xpath = "(//div[@id='ui-id-8'])[1]")
	WebElement fieldpicker_Project;
	
	@FindBy(xpath = "//input[@name='unit_rate']")
	WebElement field_UnitRate;
	
	@FindBy(xpath = "//select[@name='worktype']")
	WebElement dropDown_WorkType;
	
	@FindBy(xpath = "//option[@value='FullTime']")
	WebElement dropDownpPicker_WorkType;
	
	@FindBy(xpath = "//select[@name='billable']")
	WebElement dropDown_Billable;
	
	@FindBy(xpath = "//option[@value='Yes']")
	WebElement dropDownpPicker_BillableYes;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/form/div[5]/div[1]/div/select/option[3]")
	WebElement dropDownpPicker_BillableNo;
	
	@FindBy(xpath = "//select[@name='shadow']")
	WebElement dropDown_Shadow;
	
	@FindBy(xpath = "//select[@name='shadow']//option[@value='yes'][normalize-space()='Yes']")
	WebElement dropDownpPicker_Shadow;
	
	@FindBy(xpath = "//select[@name='is_primary_project']")
	WebElement dropDown_PrimaryProject;
	
	@FindBy(xpath = "//select[@name='is_primary_project']//option[@value='yes'][normalize-space()='Yes']")
	WebElement dropDownpPicker_PrimaryProject;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/form/div[4]/div[1]/div/input")
	WebElement date_EmployeeStartDate;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/div/div[2]/div[3]")
	WebElement datepicker_EmployeeStartDate;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/form/div[4]/div[2]/div/input")
	WebElement date_EmployeeEndDate;
	
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div[2]/div[32]")
	WebElement datepicker_EmployeeEndDate;
	
	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement button_Add;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement field_Search;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]")
	WebElement table_project;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[12]/a")
	WebElement button_Action;
	
	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement button_Update;
	
	public void clickTeamAllocationMenu () {
		TeamAllocationMenu.click();
	}
	public void clickTeamAllocationSummary () {
		TeamAllocationSummary.click();
	}
	public void clickCreatTeamAllocation () {
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		CreateTeamAllocation.click();
	}
	public Object teamAllocationAlertMessage() {
		return Alert.getText();
	}
	String Employeename;
	public void creatTeamAllocation (String str,String str1) {
		field_EmployeeName.sendKeys(str);
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Employeename = fieldpicker_EmployeeName.getText();
		fieldpicker_EmployeeName.click();
		field_Project.sendKeys(str);
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		fieldpicker_Project.click();
		dropDownpPicker_WorkType.click();
		dropDownpPicker_WorkType.click();
		date_EmployeeStartDate.click();
		datepicker_EmployeeStartDate.click();
		date_EmployeeEndDate.click();
		JavascriptExecutor executor = (JavascriptExecutor)ldriver;
		executor.executeScript("arguments[0].click();", datepicker_EmployeeEndDate);
		dropDown_Billable.click();
		dropDownpPicker_BillableYes.click();
		dropDown_PrimaryProject.click();
		dropDownpPicker_PrimaryProject.click();
		dropDown_Shadow.click();
		dropDownpPicker_Shadow.click();
		field_UnitRate.sendKeys(str1);
		button_Add.click();
	}
	public void Search() {
		field_Search.sendKeys(Employeename);;
	}
	
	@SuppressWarnings("deprecation")
	public void sortTable() {
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String tableText = table_project.getText();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expectedText = Employeename;
		Assert.assertEquals(expectedText, tableText);
	}
	
	public void updateTeamAllocation() {
		button_Action.click();
		dropDown_Billable.click();
		dropDownpPicker_BillableNo.click();
		button_Update.click();
	}
	
}
