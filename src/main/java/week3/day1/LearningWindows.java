package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindows {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		String firstWindowHandle = driver.getWindowHandle();
		System.out.println(firstWindowHandle);
		
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> allWindowHandle= driver.getWindowHandles();
		
		List<String> listOfAllWinHandle = new ArrayList<String>();
		listOfAllWinHandle.addAll(allWindowHandle);
		
		//driver.switchTo().window(allWindowHandle.get(1));
		driver.switchTo().window(listOfAllWinHandle.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(listOfAllWinHandle.get(0));
		
		//for (String eachWindow : allWindowHandle) {
			//driver.switchTo().window(eachWindow);
		
		}
		
		
		
		
	}
