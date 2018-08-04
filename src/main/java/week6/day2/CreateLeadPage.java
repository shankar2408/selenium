package week6.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.Annotations2;

public class CreateLeadPage extends Annotations2 {
public CreateLeadPage() {
	PageFactory.initElements(driver, this);
}
//@FindBy=driver.findElementBy
@FindBy(id="createLeadForm_companyName")
WebElement eleCompName;
@FindBy(id="createLeadForm_firstName")
WebElement eleFirstName;
@FindBy(id="createLeadForm_lastName")
WebElement eleLastName;
@FindBy(className="smallSubmit")
WebElement eleSubmit;
@FindBy(className="errorList")
WebElement eleErrMsg;

public CreateLeadPage typeCompanyName(String cName){
	type(eleCompName, cName);
	return this;
}
public CreateLeadPage typeFirstName(String fName){
	type(eleFirstName, fName);
	return this;
}
public CreateLeadPage typeLastName(String lName){
	type(eleLastName, lName);
	return this;
}

public CreateLeadPage clickSubmitForFailure() {
	click(eleSubmit);
	return this;
}

public CreateLeadPage verifyErrMsg(String errMsg) {
	type(eleErrMsg,errMsg);
	return this;
	
}
public ViewLeadsPage clickSubmit() {
	//WebElement eleLeads=locateElement("linkText", "Leads")
	click(eleSubmit);
	return new ViewLeadsPage();

}
}
