package week5.day2;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;
public class EditLead extends Annotations {
// @Test(dependsOnMethods= {"week5.day1.cw.CreateLead.createLead"})
	@Test
 public void editLead() {
		WebElement contactLink = locateElement("LinkText", "Leads");
		click(contactLink);
		WebElement createCntLink = locateElement("LinkText", "Find Leads");
		click(createCntLink);
		WebElement locateElement = locateElement("xpath", "//label[text()='Lead ID:']/following::input[2]");
		type(locateElement, "First Name");
		WebElement findBtn = locateElement("xpath", "//button[text()='Find Leads']");
		click(findBtn);
 }
}