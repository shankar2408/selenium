package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.Annotations2;

public class ViewContactsPage extends Annotations2 {
	
	public ViewContactsPage() {
		PageFactory.initElements(driver,this);

	}
	@FindBy(id = "viewContact_firstName_sp")
	WebElement actualFName;
	
	public ViewContactsPage verifyfName(String expText) {
		verifyExactText(actualFName,expText );
		return this;
	}
	
}