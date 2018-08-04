package week6.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.Annotations2;

public class ViewLeadsPage extends Annotations2 {
public ViewLeadsPage() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="viewLead_firstName_sp")
WebElement eleFirstName;

public ViewLeadsPage verifyFirstNameText(String fName){
	verifyExactText(eleFirstName, fName);
	return this;
}
}
