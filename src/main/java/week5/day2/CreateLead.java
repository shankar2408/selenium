package week5.day2;

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
			WebElement createLeadBtn = locateElement("class", "smallSubmit");
			click(createLeadBtn);
			
		}
		
		@DataProvider(name="fetchData")
		public Object[] getData() {
			Object[][] data=new Object[2][3];
			data[0][0]="TestLeaf";
			data[0][1]="Shan";
			data[0][2]="G";
			
			
			data[1][0]="TestLeaf";
			data[1][1]="Prav";
			data[1][2]="S";
			return data;
			
		}
		
		
}