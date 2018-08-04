package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.switchTo().frame(driver.findElementByXPath("//*[@id=\"childIframe\"]"));
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		driver.switchTo().defaultContent();
		driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
	}

}
