package pageobjects;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class EmployeeObject {
	public WebDriver ldriver;

	public EmployeeObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[3]/a")
	WebElement EmployeeMenu;

	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[3]/ul/li[1]/a")
	WebElement Designation_EmployeeMenu;

	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[3]/ul/li[2]/a")
	WebElement AddEmployee_EmployeeMenu;

	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[3]/ul/li[3]/a")
	WebElement EmployeeMaster_EmployeeMenu;

	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[1]/div/div/div[2]/span/a")
	WebElement AddDesignationButton;

	@FindBy(className = "form-control")
	WebElement DesignationFiled;

	@FindBy(xpath = "//*[@id=\"desig\"]/div[2]/div/div/button")
	WebElement AddButton;

	@FindBy(xpath = "//*[@id=\"datatable_filter\"]/label/input")
	WebElement SearchInput;

	@FindBy(xpath = "//*[@id=\"datatable\"]/tbody/tr/td[3]/a")
	WebElement ActionButton1;
	
	@FindBy(xpath = "//*[@id=\"datatable\"]/tbody/tr/td[12]/a[1]")
	WebElement ActionButton2;

	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/div/form/div/div[2]/div/div/input")
	WebElement UpdateButton;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement UpdateButton1;
	
	@FindBy(xpath = "//table[@id=\"datatable\"]/tbody/tr[1]/td[2]")
	WebElement SortTable1;
	
	@FindBy(xpath = "//table[@id=\"datatable\"]/tbody/tr[1]/td[4]")
	WebElement SortTable2;

	@FindBy(xpath = " //input[@name='designation']")
	WebElement EditInputStream;

	@FindBy(xpath = "//div[@role='alert']")
	WebElement Alert;

	@FindBy(name = "email")
	WebElement field_email;

	@FindBy(name = "password")
	WebElement field_password;

	@FindBy(name = "employee_code")
	WebElement field_employeeCode;

	@FindBy(name = "name")
	WebElement field_firstname;

	@FindBy(name = "middle_name")
	WebElement field_middlename;

	@FindBy(name = "last_name")
	WebElement field_lastname;

	@FindBy(name = "phone_number")
	WebElement field_phonenumber;

	@FindBy(name = "emergency_contact")
	WebElement field_emergencycontactnumber;

	@FindBy(id = "curAddressLine1")
	WebElement field_residentialaddress;

	@FindBy(id = "curCity")
	WebElement field_city;

	@FindBy(id = "curState")
	WebElement field_state;

	@FindBy(id = "curZipcode")
	WebElement field_postalcode;

	@FindBy(xpath = "//label[@for='radio11']")
	WebElement radiobutton_male;

	@FindBy(xpath = "//label[@for='radio22']")
	WebElement radiobutton_female;

	@FindBy(xpath = "//label[@for='radio33']")
	WebElement radiobutton_married;

	@FindBy(xpath = "//label[@for='radio44']")
	WebElement radiobutton_single;

	@FindBy(xpath = "//label[@for='sameas']")
	WebElement checkbox_sameasResidentialAddress;

	@FindBy(id = "country")
	WebElement field_nationality;

	@FindBy(name = "dependency_name")
	WebElement field_dependencyname;

	@FindBy(name = "higest_qualification")
	WebElement field_highestqualification;

	@FindBy(name = "aadhar_number")
	WebElement field_aadhaarnumber;

	@FindBy(name = "experience")
	WebElement field_workexperience;

	@FindBy(id = "exampleFormControlTextarea1")
	WebElement field_skillsets;

	@FindBy(name = "pan_number")
	WebElement field_pannumber;

	@FindBy(xpath = "//select[@name='role']//child::option[4]")
	WebElement dropdown_role;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/form/div[4]/div[2]/div/select/option[2]")
	WebElement dropdown_Designation;

	@FindBy(xpath = "//select[@name='dependency']//child::option[4]")
	WebElement dropdown_Dependency;

	@FindBy(xpath = "//select[@name='employee_status']//child::option[2]")
	WebElement dropdown_EmployeeStatus;
	
	@FindBy(xpath = "//input[@name='profile_image']")
	WebElement upload_profilePhoto;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/footer")
	WebElement page_end;
	

//	Date of joining
	@FindBy(name = "joining_date")
	WebElement date_joining;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[27]")
	WebElement JoiningcurrentDate;

//	Date of birth
	@FindBy(name = "birth_date")
	WebElement date_birth;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/nav[1]/div[1]/*[name()='svg'][1]")
	WebElement BirthpreviousMonth;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[27]")
	WebElement BirthcurrentDate;
	
//	Add Button
	@FindBy(xpath = "//*[@id=\"emp\"]/div[18]/div[2]/div/div/button")
	WebElement button_AddEmployee;
		

	public void clickEmployeeMenu() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(EmployeeMenu)).click();
//		EmployeeMenu.click();
	}

	public void clickDesignation() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Designation_EmployeeMenu)).click();
//		Designation_EmployeeMenu.click();
	}

	public void clickAddEmployee() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(AddEmployee_EmployeeMenu)).click();
//		AddEmployee_EmployeeMenu.click();
	}

	public void clickEmployeeMaster() {
		EmployeeMaster_EmployeeMenu.click();
	}

//	Create
	public void clickAddDesignationButton() {
		AddDesignationButton.click();
	}

	public void clickDesignationField() {
		DesignationFiled.click();
	}

	public void enterValueinDesignationField(String string) {
		DesignationFiled.sendKeys(string);
	}

	public void clickAddButton() {
		AddButton.click();
	}

	public Object designationAlertMessage() {
		return Alert.getText();
	}
//	Read

	public void clickinSeach() {
		SearchInput.click();
	}

	public void enterinSeach(String string) {
		SearchInput.sendKeys(string);
	}

	public void sortTable1(String string) {
		String tableText = SortTable1.getText();
		String expectedText = string;
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertEquals(expectedText, tableText);
	}
	
	public void sortTable2(String string) {
		String tableText = SortTable2.getText();
		String expectedText = string;
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertEquals(expectedText, tableText);
	}

//	Update
	public void clickActionButton1() {
		ActionButton1.click();
	}
	
	public void clickActionButton2() {
		ActionButton2.click();
	}

	public void clickEditDesignation() {
		EditInputStream.click();
		;
	}

	public void enterEditDesignation(String string) {
		EditInputStream.sendKeys(string);
	}

	public void clickUpdateButton() {
		UpdateButton.click();
	}

	public void clearField() {
		EditInputStream.clear();
	}

//	Add employee page objects

	public void randomStringField(String mail, String Name,String rtext, String num,String longPara) {
		field_email.sendKeys(mail);
		field_password.clear();
		field_password.sendKeys(Name);
		field_employeeCode.sendKeys(num);
		field_firstname.sendKeys(Name);
		field_lastname.sendKeys(Name);
		field_residentialaddress.clear();
		field_residentialaddress.sendKeys(longPara);
		field_city.sendKeys(rtext);
		field_state.sendKeys(rtext);
		field_postalcode.sendKeys(num);
		field_nationality.sendKeys(Name);
		field_dependencyname.sendKeys(Name);
		field_highestqualification.sendKeys(Name);
		field_aadhaarnumber.sendKeys(num);
		field_workexperience.sendKeys("1");
		field_skillsets.sendKeys(longPara);
		field_pannumber.sendKeys(num);
	}

	public void dropDown() {
		dropdown_role.click();
		dropdown_Designation.click();
		dropdown_Dependency.click();
		dropdown_EmployeeStatus.click();
		
	}
	
	public void radioButton() {
		radiobutton_male.click();
		radiobutton_single.click();
	}
	
	public void editFirstNameTextField(String str) {
		field_firstname.click();
		field_firstname.clear();
		field_firstname.sendKeys(str);
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", UpdateButton1);
//		UpdateButton1.click();
	}
	
	
	public void checkBox() {
		checkbox_sameasResidentialAddress.click();
	}
	
	public void dateOfJoining() {
		date_joining.click();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JoiningcurrentDate.click();
	}
	
	public void dateOfBirth() {
		date_birth.click();
		BirthpreviousMonth.click();
		BirthcurrentDate.click();
	}
	
	public void phoneNumber(String Number) {
		field_phonenumber.sendKeys(Number);
		field_emergencycontactnumber.sendKeys(Number);
	}
	
	public void uploadImage() {
		String projectpath = System.getProperty("user.dir");
		upload_profilePhoto.sendKeys(projectpath+"\\TestData\\profilepic.jpg");
	}
	
	public void createEmployee()  {
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", button_AddEmployee);
	}
	
	
}
