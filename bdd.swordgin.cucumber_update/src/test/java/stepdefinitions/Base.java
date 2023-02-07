package stepdefinitions;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.AddAttendanceObject;
import pageobjects.AnnouncementObject;
import pageobjects.AttendanceObject;
import pageobjects.CandidatesObject;
import pageobjects.ConsultancyObject;
import pageobjects.EmployeeObject;
import pageobjects.EntitlementObjects;
import pageobjects.FeedbackObjects;
import pageobjects.HolidayMasterObject;
import pageobjects.JobObject;
import pageobjects.JobPositionObject;
import pageobjects.LeaveManagementObject;
import pageobjects.LeaveReportObject;
import pageobjects.LoginPageObjects;
import pageobjects.ProjectsObject;
import pageobjects.ReportObject;
import pageobjects.SelfReportObject;
import pageobjects.TeamAllocationObject;

public class Base {
	public static WebDriver driver;
	LoginPageObjects lpo;
	EmployeeObject EO;
	EntitlementObjects EntO;
	ProjectsObject PrO;
	TeamAllocationObject TAO;
	AnnouncementObject AO;
	HolidayMasterObject HMO;
	LeaveManagementObject LMO;
	AttendanceObject ATO;
	ReportObject RO;
	SelfReportObject SRO;
	LeaveReportObject LRO;
	FeedbackObjects FBO;
	AddAttendanceObject AAO;
	JobPositionObject JPO;
	ConsultancyObject CO;
	JobObject JO;
	CandidatesObject CDO;
	
	public String ds1 = RandomStringUtils.randomAlphabetic(5);
	String ds2 = RandomStringUtils.randomAlphabetic(5);
	String randomtxt1= RandomStringUtils.randomAlphabetic(5);
	String randomtxt2= RandomStringUtils.randomAlphabetic(5);
	String randomlongtext = RandomStringUtils.randomAlphabetic(50);
	String randomEmployee = RandomStringUtils.randomAlphabetic(5);
	String randomEmployeeMail = RandomStringUtils.randomAlphabetic(5)+"@swordgroup.in";
	
	String projectRText= RandomStringUtils.randomAlphabetic(5);
	String projectRtext1= RandomStringUtils.randomAlphabetic(5);
	
	Random r =new Random();
	int num = 999999;
	long randomNum = r.nextInt(num);
	public String randomNumber = Long.toString(randomNum);
	
	 Random rand = new Random();
     int num1 = (rand.nextInt(7) + 1)*100 + (rand.nextInt(8)*10) + rand.nextInt(8);
     int num2 = rand.nextInt(743);
     int num3 = rand.nextInt(10000);

     DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
     DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

     String phoneNumber1 = df3.format(num1) + df3.format(num2) + df4.format(num3);
}
