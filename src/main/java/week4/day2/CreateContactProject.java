package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContactProject {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		//click create contact
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Sridurga");
		driver.findElementById("lastNameField").sendKeys("Srinivasan");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Sri");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("AB");
		driver.findElementById("createContactForm_personalTitle").sendKeys("Mr");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("Miss");
		driver.findElementById("createContactForm_departmentName").sendKeys("Testing");

		WebElement currency = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select value=new Select(currency);
		value.selectByValue("INR");

		driver.findElementById("createContactForm_description").sendKeys("Sample description for week 4 day 2 project creation!!!");
		driver.findElementById("createContactForm_importantNote").sendKeys("Important note captured-25465465465");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("600033");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("91");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("8939834792");

		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Danny Junior");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("sridurga18.srinivasan@gmail.com");	

		String toNameText = driver.findElementById("generalToNameField").getText();
		System.out.println(toNameText);

		driver.findElementById("createContactForm_generalAddress1").sendKeys("A8 Abinaya Apartments");
		driver.findElementById("createContactForm_generalAttnName").sendKeys("Random name");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("Lake view road, West mambalam");
		driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");

		WebElement country = driver.findElementById("createContactForm_generalCountryGeoId");
		Select countryName=new Select(country);
		countryName.selectByValue("IND");

		WebElement state = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select stateName=new Select(state);
		stateName.selectByValue("IN-TN");		

		driver.findElementById("createContactForm_generalPostalCode").sendKeys("600033");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("001");

		driver.findElementByName("submitButton").click();

		//View contact 

		String displayName = driver.findElementById("viewContact_fullName_sp").getText();
		if (displayName.contains(toNameText))
		{
			System.out.println(displayName+ "Name matches" +toNameText);
		}
		else
			System.out.println("Name mismatch");

		//Edit
		
		driver.findElementByPartialLinkText("Edit").click();

		WebElement editMarkettingCampaign = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select markettingCampaign=new Select(editMarkettingCampaign);
		markettingCampaign.selectByValue("CATRQ_CAMPAIGNS");
		//System.out.println("New value" +markettingCampaign);
		driver.findElementByXPath("(//input[@name= 'submitButton'])[2]").click();
		
		String dispText = driver.findElementByPartialLinkText("Catalog Generating Marketing Campaigns (CATRQ_CAMPAIGNS)").getText();
		
		if(dispText.contains("Catalog"))
		{
			System.out.println("Choosen Marketing Campaigns appears");
		}
		else
			System.out.println("Not done");
		
		
		driver.findElementByXPath("(//input[@name= 'submitButton'])[1]").click();
		
		
	}

}