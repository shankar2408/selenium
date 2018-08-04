package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindRowsColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		WebElement table = driver.findElementByXPath("//table");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		WebElement table1= driver.findElementByXPath("//table");
		List<WebElement> columns=table1.findElements(By.tagName("td"));
		System.out.println(columns.size());
		WebElement table2= driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/table/tbody/tr[3]/td[2]/font");
	    System.out.println(table2.getText());
	    WebElement table3= driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/table/tbody/tr[4]/td[3]/input");
	    table3.click();
	}

}
