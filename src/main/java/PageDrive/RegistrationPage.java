package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class RegistrationPage extends UtilClass {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Basic Details
	@FindBy(xpath = "//a[@aria-label='Click here to register your account with I.R.C.T.C.']")
	WebElement RegistrationButton;

	@FindBy(xpath = "//input[@id='userName']")
	WebElement UserName;

	@FindBy(xpath = "//input[@id='usrPwd']")
	WebElement UserPassword;

	@FindBy(xpath = "//input[@id='cnfUsrPwd']")
	WebElement ConPassword;

	@FindBy(xpath = "//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-14 pi pi-chevron-down']")
	WebElement Perfer;

	@FindBy(xpath = "//span[text()='English']")
	WebElement English;

	@FindBy(xpath = "//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-15 pi pi-chevron-down']")
	WebElement SecurityQuestion;

	@FindBy(xpath = "//li[@aria-label='What is your pet name?']")
	WebElement Question;

	@FindBy(xpath = "//input[@placeholder='Security Answer']")
	WebElement Answer;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement Continue;

	public void Basic(String Name, String Pass, String Ans) {
		RegistrationButton.click();
		UserName.sendKeys(Name);
		UserPassword.sendKeys(Pass);
		ConPassword.sendKeys(Pass);
		Perfer.click();
		English.click();
		SecurityQuestion.click();
		Question.click();
		Answer.sendKeys(Ans);
		Continue.click();
	}

	// Personal Details
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement FirstName;

	@FindBy(css = ".ui-dropdown-trigger-icon.ui-clickable.ng-tns-c65-16.pi.pi-chevron-down")
	WebElement SelOccupation;

	@FindBy(xpath = "//li[@aria-label='STUDENT']")
	WebElement Job;

	@FindBy(xpath = "(//span[@class='ui-radiobutton-icon ui-clickable'])[2]")
	WebElement Status;

	@FindBy(xpath = "//span[normalize-space()='Male']")
	WebElement Sex;

	@FindBy(xpath = "//input[@id='email']")
	WebElement Email;

	@FindBy(xpath = "//input[@id='mobile']")
	WebElement Mobile;

	@FindBy(css = "input[placeholder='Date Of Birth']")
	WebElement DOB;

	@FindBy(css = "select[formcontrolname='nationality']")
	WebElement Nationality;

	@FindBy(xpath = "(//option[text()='India'])[2]")
	WebElement Indian;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement Button2;

	public void Personal(String Nam, String Data, String Mail, String No) {
		FirstName.sendKeys(Nam);
		DOB.sendKeys(Data);
		SelOccupation.click();
		Job.click();
		Status.click();
		Sex.click();
		Email.sendKeys(Mail);
		Mobile.sendKeys(No);
		Nationality.click();
		Indian.click();
		Button2.click();
	}

	// Address
	@FindBy(xpath = "//input[@id='resAddress1']")
	WebElement Door;

	@FindBy(xpath = "//input[@id='resAddress2']")
	WebElement Street;

	@FindBy(xpath = "//input[@placeholder='Pin code']")
	WebElement Pincode;

	@FindBy(xpath = "//select[@formcontrolname='resCity']")
	WebElement City;

	@FindBy(xpath = "//option[@value='Kanchipuram']")
	WebElement Kan;

	@FindBy(xpath = "//select[@formcontrolname='resPostOff']")
	WebElement Post;

	@FindBy(xpath = "//option[@value='Chromepet S.O']")
	WebElement Chrom;

	@FindBy(xpath = "//input[@id='resPhone']")
	WebElement Phone;

	@FindBy(xpath = "//p-radiobutton[@id='yes']//div[@role='radio']")
	WebElement Copy;

	@FindBy(xpath = "//input[@class='ng-pristine ng-invalid ng-touched']")
	WebElement Term;

	@FindBy(xpath = "//button[normalize-space()='REGISTER']")
	WebElement Registor;

	public void Address(String Dor, String St, String Pin, String Pho) {
		Door.sendKeys(Dor);
		Street.sendKeys(St);
		Pincode.sendKeys(Pin);
		City.click();
		Kan.click();
		Post.click();
		Chrom.click();
		Phone.sendKeys(Pho);
		Copy.click();
		Registor.click();
	}
}
