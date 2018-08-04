package week6.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.Annotations2;

public class MyLeadsPage extends Annotations2 {
public MyLeadsPage() {
	PageFactory.initElements(driver, this);
}
//@FindBy=driver.findElementBy
@FindBy(linkText="Create Lead")
WebElement eleCreateLead;

public CreateLeadPage clickCreateLead() {
	//WebElement eleLeads=locateElement("linkText", "Leads")
	click(eleCreateLead);
	return new CreateLeadPage();

}
}
