package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignupPageAutomate {

	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver objDrive =new ChromeDriver();
		objDrive.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		objDrive.manage().window().maximize();

		//UserName and Password
		objDrive.findElementById("userRegistrationForm:userName").sendKeys("Shankar");
		objDrive.findElementById("userRegistrationForm:password").sendKeys("Shan123");
		objDrive.findElementById("userRegistrationForm:confpasword").sendKeys("Shan123");

		//Security Question
		WebElement DDSecQuesSource = objDrive.findElementById("userRegistrationForm:securityQ");
		Select objSecQusDD =new Select(DDSecQuesSource);
		objSecQusDD.selectByVisibleText("What is your pet name?");

		objDrive.findElementById("userRegistrationForm:securityAnswer").sendKeys("Fish");

		// FirstName,LastName,Middle Name
		objDrive.findElementById("userRegistrationForm:firstName").sendKeys("Shan");
		objDrive.findElementById("userRegistrationForm:middleName").sendKeys("Kar");
		objDrive.findElementById("userRegistrationForm:lastName").sendKeys("G");

		//Gender
		
		objDrive.findElementById("userRegistrationForm:gender:0").click();
		//Martial Status
		objDrive.findElementById("userRegistrationForm:maritalStatus:0").click();
		// DOB
		WebElement DDobDay = objDrive.findElementById("userRegistrationForm:dobDay");
		WebElement DDobMonth = objDrive.findElementById("userRegistrationForm:dobMonth");
		WebElement DDobYear = objDrive.findElementById("userRegistrationForm:dateOfBirth");

		Select objDDobDay =new Select(DDobDay);
		objDDobDay.selectByValue("24");

		Select objDDobMonth =new Select(DDobMonth);
		objDDobMonth.selectByValue("08");

		Select objDDobYer =new Select(DDobYear);
		objDDobYer.selectByValue("1992");

		//Occupational
		WebElement DDOccupay = objDrive.findElementById("userRegistrationForm:occupation");
		Select objDDOccupay =new Select(DDOccupay);
		objDDOccupay.selectByValue("3");

		//Country 
		WebElement DDCountry = objDrive.findElementById("userRegistrationForm:countries");
		Select objDDCountry =new Select(DDCountry);
		objDDCountry.selectByValue("94");

		//Email
		objDrive.findElementById("userRegistrationForm:email").sendKeys("Shan@gmail.com");

		//Mobile
		objDrive.findElementById("userRegistrationForm:mobile").sendKeys("9876543210");

		//AadaarCard
		objDrive.findElementById("userRegistrationForm:uidno").sendKeys("12345678910");

		//PanCard
		objDrive.findElementById("userRegistrationForm:idno").sendKeys("12345678910");

		//Nationality 
		WebElement DDONational = objDrive.findElementById("userRegistrationForm:nationalityId");
		Select objDDNational =new Select(DDONational);
		objDDNational.selectByValue("94");

		//Address ,Street and Area
		objDrive.findElementById("userRegistrationForm:address").sendKeys("abcderadsfasdfadsfsadfsadf");
		objDrive.findElementById("userRegistrationForm:street").sendKeys("adsj");
		objDrive.findElementById("userRegistrationForm:area").sendKeys("adfasd");

		//PinCode
		objDrive.findElementById("userRegistrationForm:pincode").sendKeys("600012",Keys.TAB);
		
		
		//City
		Thread.sleep(5000);
		WebElement DDCity = objDrive.findElementById("userRegistrationForm:cityName");
		Select objDDCity =new Select(DDCity);
		objDDCity.selectByValue("Chennai");
		objDrive.findElementById("userRegistrationForm:cityName").sendKeys(Keys.TAB);
		
		//PostOffice
		Thread.sleep(5000);
		WebElement DDPostOff = objDrive.findElementById("userRegistrationForm:postofficeName");
		Select objDDPostOff =new Select(DDPostOff);
		objDDPostOff.selectByValue("Perambur Barracks S.O");

		//LandLine
		objDrive.findElementById("userRegistrationForm:landline").sendKeys("04412345678");

		System.out.println("Values Successfully inserted");
	}

}