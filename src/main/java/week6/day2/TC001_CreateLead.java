package week6.day2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations2;

public class TC001_CreateLead extends Annotations2 {
	@BeforeTest
	public void setValues() {
		excelFileName="createLead";
		testName="CreateLead";
		testDesc="Create a New Lead";
		category="smoke";
		author="sarath";
		moduleName="Leads";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String cName, String fName, String lName) {
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickSubmit()
		.verifyFirstNameText(fName);

	}
}
