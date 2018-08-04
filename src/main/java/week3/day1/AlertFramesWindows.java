package week3.day1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertFramesWindows {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");		
		//frames
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		//alerts
		Alert myAlert=driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.sendKeys("shan");
		myAlert.accept();
		driver.switchTo().defaultContent(); //come out of frame		
		driver.findElementByXPath("//*[@id=\"tryhome\"]").click();		
		//windows handle
		Set<String>allWindowHandle=driver.getWindowHandles();
		List<String> listOfAllWinHan=new ArrayList<String>();
		listOfAllWinHan.addAll(allWindowHandle);
		driver.switchTo().window(listOfAllWinHan.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(listOfAllWinHan.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();		
	}

}
