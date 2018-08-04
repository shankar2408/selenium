package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.Annotations2;

public class MyLeadsPage extends Annotations2 {
	
	public MyLeadsPage() {
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(linkText = "Find Leads")
	WebElement eleFindLead;

	@FindBy(linkText = "Create Lead")
	WebElement eleclickcreateLead;
	
	public CreateLeadPage clickCreateLeads() {
		click(eleclickcreateLead);
		reportStep("Create Leads has been cicked Successfully", "pass");
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLeads() {
		click(eleFindLead);
		reportStep("Find Leads has been cicked Successfully", "pass");
		return new FindLeadsPage();
	}
	
}