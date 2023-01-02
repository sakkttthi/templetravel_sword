package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class AnnouncementObject {
	WebDriver ldriver;

	public AnnouncementObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[7]/a")
	WebElement AnnouncementMenu;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[1]/div/div/div[2]/span/a")
	WebElement button_AddAnnouncement;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/div/div[4]/div/div/input")
	WebElement button_AnnouncementAdd;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/a[1]//*[name()='svg']")
	WebElement button_Action;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/div/div[4]/div/div/input")
	WebElement button_Update;
	
	
//	Create Announcement
	
	@FindBy(name = "title")
	WebElement field_Title;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div/div/div[3]/select/option[2]")
	WebElement dropDown_status;
	
	@FindBy(xpath = "//*[@id=\"tinymce\"]/p")
	WebElement field_Description;
	
	@FindBy(xpath = "//div[@role='alert']")
	WebElement Alert;
	
//	Search Announcement
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement field_Search;
	
	@FindBy(xpath = "//*[@id=\"datatable\"]/tbody/tr[1]/td[2]")
	WebElement sort_table;
	
	
	
	public void clickAnnouncement () {
		AnnouncementMenu.click();
	}
	public void clickAddAnnouncement () {
		button_AddAnnouncement.click();
	}
	public void selectStatusDropdown () {
		
		dropDown_status.click();
	}
	public void enterTitle (String str) {
		field_Title.sendKeys(str);
	}
	public void enterDescription (String str) {
		ldriver.switchTo().frame(0);
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		field_Description.sendKeys(str);
		ldriver.switchTo().parentFrame();
	}
	public void clickAdd () {
		button_AnnouncementAdd.click();
	}
	
	public void update (String str) {
		button_Action.click();
		field_Title.clear();
		field_Title.sendKeys(str);
		button_Update.click();
	}
	public Object announcementAlertMessage() {
		return Alert.getText();
	}
	
	public void Search (String str) {
		field_Search.click();
		field_Search.sendKeys(str);
	}
	public void sortTable (String string) {
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String tableText = sort_table.getText();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expectedText = string;
		Assert.assertEquals(expectedText, tableText);
	}
	
	
}
