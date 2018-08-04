package testng.learn;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class CreateContactSeMethod extends Annotations {
//@Test(priority=1)
	//@Test(invocationCount=2) //testng
@Test(groups= {"smoke"})
	public void newLeadProject()
	{
		
		WebElement elead= locateElement("LinkText","Create Lead");
		click(elead);
			}
	
	
}