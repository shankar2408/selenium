package week4.day2;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.SeMethods;

public class FlipkartUsingSeMethod extends SeMethods{

	@Test

	public void FlipkartSEMethods() throws InterruptedException
	{
		startApp("chrome", "https://www.flipkart.com/");
		Actions builder= new Actions(driver);

		WebElement clickClose = locateElement("xpath", "//button[text()='✕']");
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(clickClose));
		clickClose.click();

		WebElement clickTv = locateElement("xpath","//span[text() ='TVs & Appliances']");
		WebElement clickSamsung = locateElement("xpath","//*[@id=\"container\"]/div/header/div[3]/ul/li[2]/ul/li/ul/li[1]/ul/li[8]/a");

		builder.moveToElement(clickTv).perform();
		Thread.sleep(2000);
		builder.click(clickSamsung).perform();

		//limit

		WebElement minValue = locateElement("xpath","(//select[@class= 'fPjUPw'])[1]");
		selectDropDownUsingValue(minValue,"25000");
		Thread.sleep(2000);

		WebElement maxValue = locateElement("xpath","(//select[@class= 'fPjUPw'])[2]");
		selectDropDownUsingValue(maxValue,"60000");		
		Thread.sleep(2000);

		WebElement screenSize = locateElement("xpath","//div[text()= 'Screen Size']");
		screenSize.click();Thread.sleep(2000);

		WebElement screenInch = locateElement("xpath","//div[@title = '48 - 55']");
		screenInch.click();Thread.sleep(2000);

		WebElement result1 = locateElement("xpath","//div[text()= 'Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV']");
		result1.click();

		switchToWindow(1);

		WebElement compare1 = locateElement("xpath","//span[text() = 'Compare']");
		compare1.click();
		closeBrowser();
		switchToWindow(0);

		WebElement result2 = locateElement("xpath","//div[text()= 'Samsung Series 5 123cm (49 inch) Full HD LED TV']");
		result2.click();
		switchToWindow(1);
		WebElement compare2 = locateElement("xpath","//span[text() = 'Compare']");
		compare2.click();

		WebElement compare3 = locateElement("xpath","//span[text() = 'COMPARE']");
		compare3.click();

		WebElement price1 = locateElement("xpath","(//div[text() = '₹59,999'])[1]");
		//price1.getText();

		WebElement price2 = locateElement("xpath","(//div[text() = '₹44,999'])[1]");

		String replacePrice1 = price1.getText().replaceAll("\\D", "");
		int parseIntPrice1 = Integer.parseInt(replacePrice1);
		System.out.println(parseIntPrice1);

		String replacePrice2 = price2.getText().replaceAll("\\D", "");
		int parseIntPrice2 = Integer.parseInt(replacePrice2);
		System.out.println(parseIntPrice2);

		if(parseIntPrice1 < parseIntPrice2)
		{
			WebElement buyNow1 = locateElement("xpath","(//button[text()='BUY NOW'])[1]");
			System.out.println("Price 1 is lower");
			click(buyNow1);
		}
		else {
			WebElement buyNow2 = locateElement("xpath","(//button[text()='BUY NOW'])[2]");
			System.out.println("Price 2 is lower");
			click(buyNow2);
		}

	}
}