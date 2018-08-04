package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://jqueryui.com/");
    driver.findElementByLinkText("Droppable").click();
    Thread.sleep(5000);
    //goingtoframe
    driver.switchTo().frame(driver.findElementByXPath("//*[@id=\"content\"]/iframe"));
    WebElement start=driver.findElementById("draggable");
    WebElement stop=driver.findElementById("droppable");
    //actions
    Actions builder=new Actions(driver);
    builder.dragAndDrop(start, stop).perform();
	}

}
