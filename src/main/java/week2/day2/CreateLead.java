package week2.day2;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CreateLead {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Sel\\Selenium\\driver\\chromedriver.exe");
		// ChromeOptions op =new ChromeOptions();
		// op.setHeadless(true);

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement pwd = driver.findElementById("password");

		pwd.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Amazon");
		driver.findElementById("createLeadForm_firstName").sendKeys("vijayalakshmi");
		driver.findElementById("createLeadForm_lastName").sendKeys("dhandapani");
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dlValue = new Select(src);
		dlValue.selectByIndex(3);
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("vijayalakshmi");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("dhandapani");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("greeting");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("500000");
		
		WebElement owner = driver.findElementById("createLeadForm_dataSourceId");
		Select dlValue2 = new Select(owner);
		dlValue2.selectByIndex(2);
		
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dlValue1 = new Select(industry);
		dlValue1.selectByIndex(2);
		WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dlValue3 = new Select(market);
		dlValue3.selectByVisibleText("Affiliate Sites");
		/*WebElement currency = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dlValue4 = new Select(currency);
		dlValue4.selectByIndex(34);*/
		driver.findElementById("createLeadForm_sicCode").sendKeys("901");
		driver.findElementById("createLeadForm_description").sendKeys("greeting for you");
		driver.findElementById("createLeadForm_importantNote").sendKeys("please be on time");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("+1");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("044");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("vijayalakshmid26@gmail.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("viji");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("mark field");
		driver.findElementById("createLeadForm_generalCity").sendKeys("texas");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("73301");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("733");
		driver.findElementById("createLeadForm_departmentName").sendKeys("transport");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("80");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("dollar");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9962553665");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("viji");
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dlValue4 = new Select(state);
		dlValue4.selectByIndex(2);
		
		
	   driver.findElementByName("submitButton").click();
	   
	    
		

		

	}
}
