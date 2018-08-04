package leadspages;



	import static org.testng.Assert.assertTrue;

	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;


	public class CreateLead
	{
		
		
		public static void main(String[] args)
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\driver\\chromedriver.exe" );
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			
			//UserName and Password
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByLinkText("Create Lead").click();
			driver.findElementById("createLeadForm_companyName").sendKeys("Emis Health India");
			WebElement firstName = driver.findElementById("createLeadForm_firstName");
			firstName.sendKeys("Sharmila");
			driver.findElementById("createLeadForm_lastName").sendKeys("J");
			driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Sha");
			driver.findElementById("createLeadForm_lastNameLocal").sendKeys("J");
			driver.findElementById("createLeadForm_personalTitle").sendKeys("Miss");
			WebElement source = driver.findElementById("createLeadForm_dataSourceId");
			Select sourceDrop=new Select(source);
			sourceDrop.selectByValue("LEAD_CONFERENCE");
			driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Hello");
			driver.findElementById("createLeadForm_annualRevenue").sendKeys("10000");
			WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
			Select dropIndustry=new Select(industry);
			dropIndustry.selectByVisibleText("Distribution");
			WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
			Select dropOwnerShip=new Select(ownership);
			dropOwnerShip.selectByIndex(2);
			driver.findElementById("createLeadForm_sicCode").sendKeys("1235");
			driver.findElementById("createLeadForm_description").sendKeys("hello world");
			driver.findElementById("createLeadForm_importantNote").sendKeys("Danger");
			driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
			driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
			driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("9867");
			driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("998");
			driver.findElementById("createLeadForm_departmentName").sendKeys("cse");
			WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
			Select dropCurrency=new Select(currency);
			dropCurrency.selectByIndex(2);
			driver.findElementById("createLeadForm_numberEmployees").sendKeys("12");
			driver.findElementById("createLeadForm_tickerSymbol").sendKeys("12");
			driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("1293779");
			driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("nn@gmail.com");
			driver.findElementById("createLeadForm_generalToName").sendKeys("uhih");
			driver.findElementById("createLeadForm_generalAddress1").sendKeys("raman street");
			driver.findElementById("createLeadForm_generalAddress2").sendKeys("kulalampur",Keys.TAB);
			WebElement stateProvince = driver.findElementByXPath("//select[@id='createLeadForm_generalStateProvinceGeoId']");
			Select dropStateProvince=new Select(stateProvince);
			dropStateProvince.selectByValue("IN-TN");
			driver.findElementById("createLeadForm_generalCity").sendKeys("chennai");
			
			WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
			Select dropCountry=new Select(country);
			dropCountry.selectByVisibleText("India");;
			
			
			
			driver.findElementById("createLeadForm_generalPostalCode").sendKeys("044");
			driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("044");
			WebElement campaign = driver.findElementById("createLeadForm_marketingCampaignId");
			Select dropCampaign=new Select(campaign);
			dropCampaign.selectByIndex(2);
			
			driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("97798786");
			driver.findElementByName("submitButton").click();
			//assert.assertTrue(true, "Sharmila");
			
			//driver.close();
			
			String text=driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
			System.out.println(text);
			if(text=="Sharmila")
				System.out.println("TestPassed");
		else
			System.out.println("testFailed");
			
			
//			String valueTrue=firstName.getText();
//			System.out.println(valueTrue);
//			
//			if(valueTrue==firstName.getText())
//			
//				System.out.println("TestPassed");
//			else
//				System.out.println("testFailed");
			
			


			

		}


	}


