package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public ChromeDriver driver;
	@Given("Open the Browser")
	public void openBrowser() {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@And("maximize the window")
	public void maximizeBrowser() {
		
		driver.manage().window().maximize();
	}
	
	@And("Load the leaftaps URL")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps");
		
	}
	@And("Set the TimeOut")
	public void setTimeOut() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@And("Enter the UserName as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	
	@And("Enter the Password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@When("Click on LogIn Button")
	public void clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("Click on crmsfa link")
	public void clickcrmsfaLink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click on Leads")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}
	
	@And("Click On Create Lead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("Enter the Company Name as (.*)")
	public void enterCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	
	@And("Enter the firstName as (.*)")
	public void enterfirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}

	@And("Enter the lastName as (.*)")
	public void enterLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	@And("Click On Create Lead Button")
	public void clickCreateLeadButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	@Then("Verify Login Is Succesful")
	public void verifyLogin() {
System.out.println("Login Successful");	
	}
	
	@And("Verify Create Lead Is Successful")
	public void verifyCreateLeadSuccess() {
System.out.println("Create Lead is Successful");	
	}

	@Then("Verify Login Is Not Succesful")
	public void verifyLoginfailed() {
System.out.println("Login failed");	
	}

}