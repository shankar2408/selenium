package week5.day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class CreateContactSeMethod extends SeMethods {

	@Test //testng

	public void NewLeadProject()
	{
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");

		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);

		WebElement eleCRMSFALink = locateElement("xpath", "//a[contains(text(),'CRM/SFA')]");
		click(eleCRMSFALink);
		takeSnap();

		WebElement eleCreateContact = locateElement("xpath", "//a[text()= 'Create Contact']");
		click(eleCreateContact);

		WebElement eleFirstName = locateElement("firstNameField");
		type(eleFirstName, "Lakshmi");

		WebElement eleLastName = locateElement("lastNameField");
		type(eleLastName, "Mani");

		WebElement eleFirstNameLocal = locateElement("createContactForm_firstNameLocal");
		type(eleFirstNameLocal, "Guddu");

		WebElement eleLastNameLocal = locateElement("createContactForm_lastNameLocal");
		type(eleLastNameLocal, "Mani");

		WebElement eleTitle = locateElement("createContactForm_personalTitle");
		type(eleTitle, "Miss");

		WebElement eleSal = locateElement("createContactForm_generalProfTitle");
		type(eleSal, "Jr");

		WebElement eleDeptName = locateElement("createContactForm_departmentName");
		type(eleDeptName, "Bio-Tech");

		WebElement eleCurrency = locateElement("createContactForm_preferredCurrencyUomId");
		selectDropDownUsingValue(eleCurrency, "INR");
		
		WebElement eleDescription= locateElement("createContactForm_description");
		type(eleDescription, "Sample description for week 4 day 2 prject creation!!!");
		
		WebElement eleImpNote = locateElement("createContactForm_importantNote");
		type(eleImpNote, "Random54564fsd");
		
		WebElement areaPIN = locateElement("createContactForm_primaryPhoneAreaCode");
		type(areaPIN, "600033");
		
		WebElement phoneExt = locateElement("createContactForm_primaryPhoneExtension");
		type(phoneExt, "+91");
		
		WebElement phoneNo = locateElement("createContactForm_primaryPhoneNumber");
		type(phoneNo, "9566180183");
		
		WebElement askForName = locateElement("createContactForm_primaryPhoneAskForName");
		type(askForName, "DJ");
		
		WebElement emailAdd = locateElement("createContactForm_primaryEmail");
		type(emailAdd, "guddu@sample.com");
		
		WebElement toNameDisplayed = locateElement("generalToNameField");
		getText(toNameDisplayed);
		
		WebElement addressLine1 = locateElement("createContactForm_generalAddress1");
		type(addressLine1, "Kumaran nagar");

		WebElement attName = locateElement("createContactForm_generalAttnName");
		type(attName, "Mr Mani");
		
		WebElement addressLine2 = locateElement("createContactForm_generalAddress2");
		type(addressLine2, "Madambakkam");
		
		WebElement city = locateElement("createContactForm_generalCity");
		type(city, "Chennai");
		
		WebElement country = locateElement("createContactForm_generalCountryGeoId");
		selectDropDownUsingValue(country,"IND");
	
		WebElement state = locateElement("createContactForm_generalStateProvinceGeoId");
		selectDropDownUsingValue(state,"IN-TN");
	
		WebElement postCode = locateElement("createContactForm_generalPostalCode");
		type(postCode, "600126");
		
		WebElement postCodeExt = locateElement("createContactForm_generalPostalCodeExt");
		type(postCodeExt, "126");
		
		WebElement crateContactButton = locateElement("xpath", "//input[@name= 'submitButton']");
		click(crateContactButton);
		
		//view contact
		
		WebElement displayName = locateElement("viewContact_fullName_sp");
		
		verifyPartialText(displayName, "Lakshmi");
		
		//Edit
		
		WebElement EditButton = locateElement("LinkText", "Edit");
		click(EditButton);
		
		WebElement editMarkID = locateElement("addMarketingCampaignForm_marketingCampaignId");
		selectDropDownUsingValue(editMarkID,"CATRQ_CAMPAIGNS");
		
		WebElement addButton = locateElement("xpath", "(//input[@name= 'submitButton'])[2]");
		click(addButton);
		
		WebElement dispText = locateElement("LinkText", "Catalog Generating Marketing Campaigns (CATRQ_CAMPAIGNS)");
		verifyPartialText(dispText, "Catalog");
		
		WebElement updateButtton = locateElement("xpath", "(//input[@name= 'submitButton'])[1]");
		click(updateButtton);
		
		
		
	
	}
	
	
	
	
	
	
}