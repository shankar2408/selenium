package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Login1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.setHeadless(false);
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait
		(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.findElementById("username").sendKeys("DemoSalesManager", Keys.TAB);
		/*Thread.sleep(5000);*/
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa", Keys.ENTER);
		//Thread.sleep(10000);
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		//dropdown coding
		WebElement source = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd = new Select(source);
		//dd.selectByIndex(2);
		//dd.selectByValue("LEAD_EMPLOYEE");
		//dd.selectByVisibleText("Other");
		List<WebElement> allOptions = dd.getOptions();
		int size = allOptions.size();
		System.out.println(size);
		dd.selectByIndex(size-1);
		//showing all dropdown option
		for (WebElement eachOpt : allOptions) {
			String text = eachOpt.getText();
			System.out.println(text);
		}
	}

}