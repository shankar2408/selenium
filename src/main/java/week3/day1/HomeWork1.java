package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//click contact us
		WebElement print=driver.findElementByXPath("//*[@id=\"topnav\"]/li[3]/a");
		print.click();
		Set<String>allWindowHandle=driver.getWindowHandles();
		List<String> listOfAllWinHan=new ArrayList<String>();
		listOfAllWinHan.addAll(allWindowHandle);
		driver.switchTo().window(listOfAllWinHan.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(listOfAllWinHan.get(0));
		//click compatible browser
		WebElement print1=driver.findElementByXPath("/html/body/div[4]/div/div/div[2]/a");
		print1.click();
		Set<String>allWindowHandle1=driver.getWindowHandles();
		List<String> listOfAllWinHan1=new ArrayList<String>();
		listOfAllWinHan1.addAll(allWindowHandle1);
		driver.switchTo().window(listOfAllWinHan1.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement print3=driver.findElementByXPath("/html/body/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td");
		System.out.println(print3.getText());
		driver.switchTo().window(listOfAllWinHan.get(0));
		driver.close();
		
		//driver.quit();



	}

}
