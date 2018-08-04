package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import wdMethods.Annotations2;

public class TC003_ViewLead extends Annotations2{

	@BeforeTest
	public void setValues() {
		excelFileName = "ViewLead";
		testName = "View Lead";
		testDesc = "View a created Lead";
		category = "smoke";
		author = "sarath";
		moduleName = "Leads";
		
	}
	
	@Test (dataProvider = "fetchData")
	public void createLead(String fName) {
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.typeFName(fName)
		.clickFindLeads()
		.clickViewLead()
		.verifyfName(fName);
	
	}
}