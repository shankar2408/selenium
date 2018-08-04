package week6.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wdMethods.Annotations2;

public class MyHomePageProp extends Annotations2{
	
	public MyHomePageProp() {
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy = driver.findElementBy	
	/*@FindBy(xpath = "//a[text()='Leads']")
	WebElement eleLeads;	*/
	
	public MyLeadsPage clickLeads() {
		WebElement eleLeads = locateElement("linkText", prop.getProperty("MyHomePage.leads.link"));
		click(eleLeads);
		return new MyLeadsPage();
	}

}