package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import reporter.Reporter;




public class SeMethods implements WdMethods{
	public RemoteWebDriver driver ;
	int i = 1;
	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver = new ChromeDriver();			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
			 driver = new FirefoxDriver();		
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser "+browser+" is Launched Successfully");
		takeSnap();
		
	}

	public WebElement locateElement(String locator, String locValue) {
		switch (locator) {
		case "id": 	  return driver.findElementById(locValue);
		case "className": return driver.findElementByClassName(locValue);
		case "xpath": return driver.findElementByXPath(locValue);
		case "LinkText": return driver.findElementByLinkText(locValue);
		case "name": return driver.findElementByName(locValue);
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data){
	try {
		ele.sendKeys(data);
		System.out.println("The Data "+data+" is Entered Successfully");
	}catch (WebDriverException e) {
		System.err.println("WebDriverException has occurred");
		throw new RuntimeException();
	} catch (Exception e) {
        System.err.println("Exception has occurred");
        throw new RuntimeException();
}finally {
		takeSnap();
	}
	}

	public void click(WebElement ele) {
		ele.click();
	System.out.println("The Element "+ele+" is clicked Successfully");
	takeSnap();		
	}
	
	public void clickWithoutSnap(WebElement ele) 
		{
			ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
		}
		
	public String getText(WebElement ele) {
		// me
		String text= ele.getText();	
		System.out.println("Text is:"+text);
		return text;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// me
		Select dd=new Select(ele);
		dd.selectByVisibleText(value);
		System.out.println("The Value"+value+"selected in this"+ele);		
		takeSnap();
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// me
		Select dd=new Select(ele);
		dd.selectByIndex(index);
		System.out.println("dd by index selected successfully");
		takeSnap();
	}
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// me
		Select dd=new Select(ele);
		dd.selectByValue(value);
		System.out.println("dd by index selected successfully");
		takeSnap();
	}
	public boolean verifyTitle(String expectedTitle) {
		// me
		boolean bReturn=false;
		if (driver.getTitle().equals(expectedTitle))
		{
			System.out.println("title verified");
			bReturn= true;
		}else
		{
			System.out.println("title not verified");
		}
		return bReturn;
		
	}

	public void verifyExactText(WebElement ele, String expectedText) {
	if (ele.getText().equals(expectedText))	{
		System.out.println("expected text matched successfully");
	}else {
		System.out.println("expected text not matched");
	}
		
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// me
		if (ele.getText().contains(expectedText)) {
			System.out.println("expected text partially matched successfully");
		}else {
			System.out.println("expected text not even partially matched");
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		if(ele.getAttribute(attribute).equals(value)) {
			System.out.println("attribute value matched");
		}else {
			System.out.println("attribute value not matched");
		}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// me
		if(ele.getAttribute(attribute).contains(value)) {
			System.out.println("value partially matched");
		}
		else {
			System.out.println("value not even partially matched");
		}
	}

	public void verifySelected(WebElement ele) {
		// me
		if(ele.isSelected()==true) {
		System.out.println("the element is selected successfully");
		}
		else {
			System.out.println("the element is not selected");
		}
		
	}

	public void verifyDisplayed(WebElement ele) {
		// me
		if(ele.isDisplayed()==true) {
		System.out.println("the element is displayed successfully");
	}else {
		System.out.println("the element is not displayed");
	}
	}
	
	public void switchToWindow(int index) {
        Set<String> allWindows= driver.getWindowHandles();
        List<String> listOfWindows=new ArrayList<String>();
        listOfWindows.addAll(allWindows);
		driver.switchTo().window(listOfWindows.get(index));
		takeSnap();
		
	}

	public void switchToFrame(WebElement ele) {
		// me
		driver.switchTo().frame(ele);
		takeSnap();
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
	}

	public String getAlertText() {
		// me
		String text=driver.switchTo().alert().getText();
		return text;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
	}

}
