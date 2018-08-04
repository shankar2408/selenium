package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import wdMethods.Annotations2;

public class TC002_CreateContact extends Annotations2{

	@BeforeTest
	public void setValues() {
		excelFileName = "CreateContact";
		testName = "Create Contact";
		testDesc = "Create a New Contact";
		category = "smoke";
		author = "sarath";
		moduleName = "Leads";
		
	}
	
	@Test (dataProvider = "fetchData")
	public void createContact(String firstName, String lastName) {
		new MyHomePage()
		.clickContacts()
		.clickCreateContacts()
		.typeFName(firstName)
		.typeLName(lastName)
		.clickViewContact()
		.verifyfName(firstName);
	
	}
}