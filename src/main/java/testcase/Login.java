package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Login extends SeMethods{

	@Test //junit test execution
	public void login() throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement eleLink = locateElement("LinkText","CRM/SFA");
		//	System.out.println(eleLink);
		click(eleLink);
		WebElement elead= locateElement("LinkText","Create Lead");
		click(elead);
		WebElement mlead= locateElement("LinkText","Merge Leads");
		click(mlead);
		WebElement icon= locateElement("xpath","//*[@alt='Lookup'][1]");
		click(icon)	;
		switchToWindow(1);
		WebElement fname= locateElement("xpath","//*[@id=\"ext-gen25\"]");
		type(fname,"10041");
		WebElement flead= locateElement("class","x-btn-text");
		click(flead);
		Thread.sleep(1000);
		WebElement rflead= locateElement("LinkText","10041");
		clickWithoutSnap(rflead);
		Thread.sleep(1000);
		switchToWindow(0);
		WebElement icon1= locateElement("xpath","(//*[@alt='Lookup'])[2]");
		clickWithoutSnap(icon1);
		switchToWindow(1);
		WebElement toId= locateElement ("name","id");
		type(toId,"10051");
		WebElement flead1= locateElement("class","x-btn-text");
		click(flead1);
		WebElement rflead1= locateElement("LinkText","10051");
		clickWithoutSnap(rflead1);
		switchToWindow(0);
		WebElement mlead1 = locateElement("xpath","//a[text()='Merge']");
		System.out.println(mlead1);
		clickWithoutSnap(mlead1);
		acceptAlert();
		WebElement efindLeads= locateElement("LinkText","Find Leads");
		click(efindLeads);
		WebElement fleadId1= locateElement("xpath"," //*[@name='id']");
		System.out.println(fleadId1);
		type(fleadId1,"10041");
		WebElement btnFindLead = locateElement("xpath","//button[text()='Find Leads']");
		click(btnFindLead);
			
	}
	
}







