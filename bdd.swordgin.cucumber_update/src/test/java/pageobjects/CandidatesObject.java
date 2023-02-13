package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CandidatesObject {
	WebDriver ldriver;

	public CandidatesObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "(//a[@href='https://templetravel.in/hrm-sword/candidate'])[1]")
	WebElement Candidates;
	
	@FindBy(xpath = "//tbody/tr[1]/td[9]/a[2]")
	WebElement button_addCandidates;
	
	@FindBy(xpath = "(//input[@placeholder='Name'])[1]")
	WebElement field_candidateName;
	
	@FindBy(xpath = "(//input[@placeholder='Email Id'])[1]")
	WebElement field_candidateEmail;
	
	@FindBy(xpath = "(//input[@placeholder='Phone Number'])[1]")
	WebElement field_phoneNumber;
	
	@FindBy(xpath = "(//input[@placeholder='Alternate Phone Number'])[1]")
	WebElement field_AlternatephoneNumber;
	
	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement date_Birth;
	
	@FindBy(xpath = "(//div[@class='datepicker--cell datepicker--cell-day'][normalize-space()='1'])[1]")
	WebElement datepicker_Birth;
	
	@FindBy(xpath = "(//label[normalize-space()='Male'])[1]")
	WebElement radio_Gender;
	
	@FindBy(xpath = "(//input[@placeholder='Address'])[1]")
	WebElement field_Adderss;
	
	@FindBy(xpath = "(//input[@placeholder='Location'])[1]")
	WebElement field_location;
	
	@FindBy(xpath = "(//input[@placeholder='Nationality'])[1]")
	WebElement field_nationality;
	
	@FindBy(xpath = "(//input[@placeholder='Current Position'])[1]")
	WebElement field_curposition;
	
	@FindBy(xpath = "(//input[@placeholder='Current Company'])[1]")
	WebElement field_curCompany;
	
	@FindBy(xpath = "(//input[@placeholder='Total Years of Experience'])[1]")
	WebElement field_totExperience;
	
	@FindBy(xpath = "(//input[@placeholder='Relevant Experience'])[1]")
	WebElement field_relExperience;
	
	@FindBy(xpath = "(//input[@placeholder='Cuttent CTC'])[1]")
	WebElement field_curCTC;
	
	@FindBy(xpath = "(//input[@placeholder='Expected CTC'])[1]")
	WebElement field_expCTC;
	
	@FindBy(xpath = "(//input[@placeholder='Candidate Negotiation Salary'])[1]")
	WebElement field_negoSalary;
	
	@FindBy(xpath = "(//input[@placeholder='Notice Period'])[1]")
	WebElement field_noticePeriod;	
	
	@FindBy(xpath = "(//textarea[@id='exampleFormControlTextarea1'])[1]")
	WebElement field_languageKnown;	
	
	@FindBy(xpath = "(//textarea[@id='exampleFormControlTextarea1'])[2]")
	WebElement field_skills;	
	
	@FindBy(xpath = "(//input[@placeholder='Graduation Degree'])[1]")
	WebElement field_graduationDegree;	
	
	@FindBy(xpath = "(//input[@placeholder='Graduation University'])[1]")
	WebElement field_graduationUniversity;	
	
	@FindBy(xpath = "(//input[@name='resume_upload'])[1]")
	WebElement upload_Resume;	
	
	@FindBy(xpath = "(//select[@name='outsourced_via'])[1]")
	WebElement dropdown_OutsourceVia;	
	
	@FindBy(xpath = "(//option[@value='Consultancy'])[1]")
	WebElement dropdownpicker_OutsourceVia;	
	
	@FindBy(xpath = "(//select[@name='recruiter_name'])[1]")
	WebElement dropdown_RecruiterName;	
	
	@FindBy(xpath = "(//option[@value='118'])[1]")
	WebElement dropdownpicker_RecruiterName;	
	
	@FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")
	WebElement button_Submit;	
	
	public void candidates () {
		Candidates.click();
	}
	public void click_button_addCandidates() {
		button_addCandidates.click();
	}
	public void candidate_input(String cName, String email, String num, String longtxt) {
		field_candidateName.sendKeys(cName);
		field_candidateEmail.sendKeys(email);
		field_phoneNumber.sendKeys(num);
		field_AlternatephoneNumber.sendKeys(num);
		date_Birth.click();
		datepicker_Birth.click();
		radio_Gender.click();
		field_Adderss.sendKeys(longtxt);
		field_location.sendKeys("Chennai");
		field_nationality.sendKeys("India");
		field_curposition.sendKeys("Programmer");
		field_curCompany.sendKeys("Sword Global India PVT");
		field_totExperience.sendKeys("2");
		field_relExperience.sendKeys("1");
		field_curCTC.sendKeys("50,000");
		field_expCTC.sendKeys("1,00,000");
		field_negoSalary.sendKeys("85,000");
		field_noticePeriod.sendKeys("3 months");
		field_languageKnown.sendKeys("English, Tamil");
		field_skills.sendKeys("C# & Dot Net developer");
		upload_Resume.sendKeys("/bdd.swordgin.cucumber/TestData/TestResume.docx");
		dropdown_OutsourceVia.click();
		dropdownpicker_OutsourceVia.click();
		dropdown_RecruiterName.click();
		dropdownpicker_RecruiterName.click();
		button_Submit.click();
	}
}
