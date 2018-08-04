package wdMethods;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day1.ReadExcel;





public class Annotations2 extends SeMethods2{
	public String excelFileName,testName,testDesc,category,author,moduleName;
	@BeforeSuite
	public void startSuite() throws FileNotFoundException, IOException {
		beginResult();
		//loadObject();
	}
	
	@BeforeClass
	public void startTest() {
		startTest(testName, testDesc);
	}

	@Parameters({"url","pwd","uName"})
	@BeforeMethod(groups= {"smoke","sanity"})
	public void login(String url, String pwd, String uName) {
		startTestIteration(moduleName,author,category);
		startApp("chrome", url);
		type(locateElement("id", "username"), uName);
		type(locateElement("id", "password"), pwd);
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
	}
	
	@AfterMethod(groups= {"smoke","sanity"})
	public void closeApp() {
		closeBrowser();
	}
	
	@AfterSuite
	public void stopSuite() {
		endResult();
	}
	
	@DataProvider(name = "fetchData"/*, indices = {1}*/)
	public Object[][] getData() throws IOException {		
		ReadExcel excel = new ReadExcel();
		return excel.readExcel(excelFileName);		
	}
	
	
	
}





