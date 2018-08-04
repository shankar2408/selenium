package week6.day2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations2;

public class TC001_CreateLeadNEG extends Annotations2{
	
	@BeforeTest
	public void setValues() {
		excelFileName = "createLeadNEG";
		testName = "Create Lead(NEG)";
		testDesc = "Create a New Lead";
		category = "sanity";
		author = "sarath";
		moduleName = "Leads";
	}
	

	@Test(dataProvider = "fetchData")
	public void createLead(String cName, String fName, String lName,String errMsg) {
		
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickSubmitForFailure()
		.verifyErrMsg(errMsg);
		
	}
}