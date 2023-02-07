package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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
	
	public void consultancy () {
		Consultancy.click();
	}
	
	public void consultancy_Summary () {
		Consultancy_Summary.click();
	}
	
	public void consultancy_New () {
		Consultancy_New.click();
	}
}
