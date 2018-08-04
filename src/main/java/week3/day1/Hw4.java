package week3.day1;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		driver.findElementByLinkText("Draggable").click();
		Thread.sleep(5000);
		//going into the frame
		driver.switchTo().frame(driver.findElementByXPath("//*[@id=\"content\"]/iframe"));
		WebElement drag=driver.findElementByXPath("//*[@id=\"draggable\"]/p");
		System.out.println(drag.getText());
		//frame exit
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a").click();
	}

}
