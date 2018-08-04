package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeOptions op = new ChromeOptions();
		//op.setHeadless(true);		
		//ChromeDriver driver = new ChromeDriver(op);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Nextwave Multimedia");
		driver.findElementById("createLeadForm_firstName").sendKeys("Shankar");
		driver.findElementById("createLeadForm_lastName").sendKeys("G");
		WebElement industry=driver.findElementById("createLeadForm_industryEnumId");
		Select dd=new Select(industry);
		//dd.selectByIndex(2);
		//dd.selectByValue("LEAD_EMPLOYEE")
		//dd.selectByVisibleText("Other");
		List<WebElement> allOptions=dd.getOptions();
		int size=allOptions.size();
		dd.selectByIndex(size-9);
		//driver.findElementByName("submitButton").click();

	}

}
