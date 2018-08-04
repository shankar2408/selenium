package testng.learn;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class MergeLead extends Annotations{
//attributes
	//@Test(priority=1)
	//@Test(invocationCount=2) //testng
	//@Test(dependsOnMethods= {"testng.learn.CreateContactSeMethod.newLeadProject"}) //testng test execution
	//@Test(timeOut=5000)
	//@Test(enabled=false)
	//@Test(groups= {"sanity"})
	public void merge() {
		WebElement elead= locateElement("LinkText","Create Lead");
		click(elead);
		WebElement mlead= locateElement("LinkText","Merge Leads");
		click(mlead);
	}}