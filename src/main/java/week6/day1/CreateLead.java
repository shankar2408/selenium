package week6.day1;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;
public class CreateLead extends Annotations {

		@Test(dataProvider="fetchData") 
		public void createLead(String comp,String fName,String lName) {
			WebElement contactLink = locateElement("LinkText", "Leads");
			click(contactLink);
			WebElement createCntLink = locateElement("LinkText", "Create Lead");
			click(createCntLink);
			WebElement eleUserName1 = locateElement("id", "createLeadForm_companyName" );
			type(eleUserName1, comp);
			WebElement eleFName = locateElement("id", "createLeadForm_firstName" );
			type(eleFName, fName);
			WebElement eleLName = locateElement("id","createLeadForm_lastName" );
			type(eleLName, lName);
			WebElement createLeadBtn = locateElement("className", "smallSubmit");
			click(createLeadBtn);
			
		}
		
		@DataProvider(name="fetchData")
		public Object[] getData() throws IOException {
			ReadExcel excel=new ReadExcel();
			return excel.readExcel("createLead");
			
		}
		
		
}
