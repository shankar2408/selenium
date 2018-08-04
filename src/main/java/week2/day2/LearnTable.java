package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnTable {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.setHeadless(false);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in");
		driver.manage().timeouts().implicitlyWait
		(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("tsi",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("ms",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		/*WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());*/
		int size = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr[1]/td").size();
		System.out.println(size);
		}

}