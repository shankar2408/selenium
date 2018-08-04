package listeners;

import org.testng.annotations.Test;
import wdMethods.Annotations;

public class CreateLead extends Annotations{

	@Test(invocationCount=4)
	public void createLead() {			
		click(locateElement("LinkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "TL");
		type(locateElement("id", "createLeadForm_firstName"), "Babu");
		type(locateElement("id", "createLeadForm_lastName"), "M");
		type(locateElement("id", "createLeadForm_primaryEmail"), "babu@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9843824324");
		clickWithoutSnap(locateElement("name", "submitButton"));			
	}
	
}