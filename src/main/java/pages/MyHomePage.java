package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.Annotations2;

public class MyHomePage extends Annotations2{
	
	public MyHomePage() {
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(xpath = "//a[text()='Contacts']")
	WebElement eleContact;
	
	@FindBy(xpath = "//a[text()='Leads']")
	WebElement eleLeads;
	
		
	public MyLeadsPage clickLeads() {
		click(eleLeads);
		reportStep("Leads has been cicked Successfully", "pass");
		return new MyLeadsPage();
	}
	public MyContactsPage clickContacts() {
		click(eleContact);
		reportStep("Contacts has been cicked Successfully", "pass");
		return new MyContactsPage();
	}
	
}