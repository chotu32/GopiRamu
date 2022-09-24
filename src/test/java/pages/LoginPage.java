package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.BaseClass;

public class LoginPage extends BaseClass {
	
	WebDriver driver;

	// Intializing constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public static final By USER_NAME = By.id("email-address");
	public static final By PASSWORD = By.id("account-password");
	public static final By SIGN_IN_BTN = By.xpath("//button[@type='submit']");

	public String getHomePageTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public void enterUserName(WebDriver driver, String email) {
		WebElement userName = driver.findElement(USER_NAME);
		waitForExpectedElement(driver, USER_NAME);
		highlightWebElement(driver, userName);
		userName.sendKeys(email);
		//String searchItemData = userName.getAttribute("value");
	}
	
	public void enterUserPassword(WebDriver driver, String password) {
		WebElement userPassword = driver.findElement(PASSWORD);
		waitForExpectedElement(driver, PASSWORD);
		highlightWebElement(driver, userPassword);
		userPassword.sendKeys(password);
		//String searchItemData = userName.getAttribute("value");
	}
	
	public void clickSignInBtn(WebDriver driver) {
		WebElement signinBtn = driver.findElement(SIGN_IN_BTN);
		waitForExpectedElement(driver, SIGN_IN_BTN);
		highlightWebElement(driver, signinBtn);
		signinBtn.click();
	}
	
}
