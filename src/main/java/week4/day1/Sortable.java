package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://jqueryui.com/");
    driver.findElementByLinkText("Sortable").click();
    Thread.sleep(5000);
    driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
    WebElement start=driver.findElementByXPath("//*[@id=\"sortable\"]/li[1]");
    WebElement stop=driver.findElementByXPath("//*[@id=\"sortable\"]/li[4]");
    Actions builder=new Actions(driver);
    builder.dragAndDropBy(start, stop.getLocation().getX(), stop.getLocation().getY()).perform();
   
	}

}
