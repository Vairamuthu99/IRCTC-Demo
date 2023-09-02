package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class BookingPage extends UtilClass {

	WebDriver driver;

	public BookingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")
	WebElement From;

	@FindBy(xpath = "//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")
	WebElement To;

	@FindBy(css = ".ng-tns-c58-10 > .ui-inputtext")
	WebElement Date;

	@FindBy(linkText = "9")
	WebElement Date1;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement Submit;

	public void Home(String For, String Too) {
		From.sendKeys(For);
		To.sendKeys(Too);
		Date.click();
		Date1.click();
		Submit.click();
	}

	@FindBy(xpath = "//div[@class='tbis-div']//div[1]//div[1]//app-train-avl-enq[1]//div[1]//div[5]//div[1]//table[1]//tr[1]//td[1]//div[1]//div[2]")
	WebElement Select;

	@FindBy(xpath = "//strong[normalize-space()='Sat, 09 Sep']")
	WebElement Sleeper;

	@FindBy(xpath = "//button[@class='btnDefault train_Search ng-star-inserted']")
	WebElement Book;

	public void Travel() {
		Select.click();
		Sleeper.click();
		Book.click();
	}
}
