package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Annotations extends SeMethods {

	/*/@BeforeMethod(groups= {"smoke","sanity"})
	@BeforeMethod
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement eleLink = locateElement("LinkText","CRM/SFA");
		click(eleLink);
}
	//@AfterMethod(groups= {"smoke","sanity"})*/
	@BeforeMethod
	@Parameters({"url","uN","pwd"})
	public void login(String url,String uName, String pwd) {
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, uName);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, pwd);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement eleLink = locateElement("LinkText","CRM/SFA");
		click(eleLink);
}
	@AfterMethod
	public void closBrowser() {
		closeAllBrowsers();
	}
}