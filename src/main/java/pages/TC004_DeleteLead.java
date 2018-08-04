package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import wdMethods.Annotations2;

public class TC004_DeleteLead extends Annotations2{

	@BeforeTest
	public void setValues() {
		excelFileName = "DeleteLead";
		testName = "Delete Lead";
		testDesc = "Delete an existing Lead";
		category = "smoke";
		author = "sarath";
		moduleName = "Leads";
		
	}
	
	@Test (dataProvider = "fetchData")
	public void DeleteLead(String fName) {
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.typeFName(fName)
		.clickFindLeads()
		.clickViewLead()
		.clickonDeleteButton();
	}
}