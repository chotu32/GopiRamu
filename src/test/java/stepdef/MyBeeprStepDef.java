package stepdef;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import utilities.BaseClass;
import utilities.ConfigClass;
import utilities.Utilities;

public class MyBeeprStepDef extends BaseClass {

	// Create Instance of Utilities Class
	Utilities utilities = new Utilities();
	// store current working directory path
	public static String pth = System.getProperty("user.dir");
	// Create Reports Folder In Current Working Directory Path
	public static String reportFilePath = pth + "/Reports/";
	// Create Instance for ExtentReports Class
	public ExtentReports reports;
	// create variable for extent test
	ExtentTest test;

	ConfigClass config = new ConfigClass();
	Utilities objUtil = new Utilities();
	LoginPage objLP = new LoginPage(driver);
	Scenario scenario;

	static float sortByValue;

	@Before
	public void start(Scenario scenario) throws Exception {
		this.scenario = scenario;
		config.loadPropertyFile();
	}
	
	@Given("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to(String url) throws Throwable {
		launchBrowser(config.getProperty(url));
	}
	
	@When("^I enter user \"([^\"]*)\"$")
	public void i_enter_user(String userName) throws Throwable {
		System.out.println("User Name: " + userName);
		objLP.enterUserName(driver, config.getProperty(userName));
		System.out.println("User Name: " + config.getProperty(userName));
		
	}

	@When("^I enter pswd \"([^\"]*)\"$")
	public void i_enter_pswd(String password) throws Throwable {
		System.out.println("User Password: " + password);
		objLP.enterUserPassword(driver, config.getProperty(password));
		System.out.println("User Password: " + config.getProperty(password));
	    
	}

	@When("^I click on Sign in button$")
	public void i_click_on_Sign_in_button() throws Throwable {
		objLP.clickSignInBtn(driver);
	    
	}

	@Then("^I navigate to dashboard page$")
	public void i_navigate_to_dashboard_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@When("^I close browser instance$")
	public void i_close_browser_instance() throws Throwable {
		driver.close();
	    
	}

}
