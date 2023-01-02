package pageobjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class HolidayMasterObject {
	WebDriver ldriver;

	public HolidayMasterObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[8]/a")
	WebElement HolidayMasterMenu;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[1]/div/div/div[2]/span/a")
	WebElement button_AddHoliday;
	
	@FindBy(xpath = "//*[@id=\"holi\"]/div[3]/div/div/input")
	WebElement button_Add;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/div/form/div[3]/div/div/input")
	WebElement button_Update;
	
	@FindBy(xpath = "//input[@placeholder='Holiday Name *']")
	WebElement field_HolidayName;
	
	@FindBy(xpath = "//input[@placeholder='DD-MM-YYYY']")
	WebElement date_HolidayDate;
	
	@FindBy(xpath = "//div[@class='datepicker--cell datepicker--cell-day -current-']")
	WebElement date_pickdate;
	
	@FindBy(xpath = "//div[@role='alert']")
	WebElement Alert;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement field_Search;
	
	@FindBy(xpath = "//*[@id=\"datatable\"]/tbody/tr[1]/td[2]")
	WebElement sort_table;
	
	@FindBy(xpath = "//tbody/tr[1]/td[7]/a[1]")
	WebElement button_Action;
	
	
	public void clickHolidayMaster () {
		HolidayMasterMenu.click();
	}
	public void clickAddHoliday () {
		button_AddHoliday.click();
	}
	public void addHolidayIputs (String str) {
		field_HolidayName.sendKeys(str);
		date_HolidayDate.click();
		date_pickdate.click(); //should be dynamic
		button_Add.click();
	}
	public Object holidayAlertMessage() {
		return Alert.getText();
	}
	public void searchHoliday (String str) {
		field_Search.sendKeys(str);
	}
	public void sortTable (String string) {
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String tableText = sort_table.getText();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expectedText = string;
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertEquals(expectedText, tableText);
	}
	public void updateHoliday (String str) {
		button_Action.click();
		field_HolidayName.sendKeys(str);
		button_Update.click();
	}
}
