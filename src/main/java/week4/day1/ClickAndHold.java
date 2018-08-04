package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com/");
	    driver.findElementByXPath("/html/body/div[2]/div/div/button").click();
	    WebElement firstMenu=driver.findElementByXPath("//*[@id=\"container\"]/div/header/div[3]/ul/li[2]/a/span");
	    WebElement secondMenu=driver.findElementByXPath("//*[@id=\"container\"]/div/header/div[3]/ul/li[2]/ul/li/ul/li[1]/ul/li[1]/a/span[1]");
	    Actions builder=new Actions(driver);
	    builder.moveToElement(firstMenu).pause(3000).click(secondMenu).perform();
	}

}
