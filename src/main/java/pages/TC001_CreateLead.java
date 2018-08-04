package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations2;

public class TC001_CreateLead extends Annotations2{

	@BeforeTest
	public void setValues() {
		excelFileName = "createLead";
		testName = "Create Lead";
		testDesc = "Create a New Lead";
		category = "smoke";
		author = "sarath";
		moduleName = "Leads";
		
	}
	
	@Test (dataProvider = "fetchData")
	public void createLead(String cName, String fName, String lName) {
		new MyHomePage()
		.clickLeads()
		.clickCreateLeads()
		.typeCName(cName)
		.typeFName(fName)
		.typeLName(lName)
		.clickViewLead()
		.verifyfName(fName);
	
	}
}