package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ListInterface {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager", Keys.TAB);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		//dropdown coding
		WebElement source=driver.findElementByName("dataSourceId");
		Select dd=new Select(source);
		//dd.selectByIndex(2);	
		List<WebElement> allOptions = dd.getOptions();
		int size = allOptions.size();
		System.out.println(size);
		dd.selectByIndex(size-1);
		//showing all dropdown option
		for (WebElement eachOpt : allOptions) {
			String text = eachOpt.getText();
			System.out.println(text);
	}

}}