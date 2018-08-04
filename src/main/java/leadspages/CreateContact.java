package leadspages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact
{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		// UserName and Password
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Contact").click();
		WebElement firstName = driver.findElementById("firstNameField");
		firstName.sendKeys("Sharmila");
		driver.findElementById("lastNameField").sendKeys("J");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Sha");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("J");
		driver.findElementById("createContactForm_personalTitle").sendKeys("Miss");
		
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("Hello");
		driver.findElementById("createContactForm_departmentName").sendKeys("cse");
		WebElement currency = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select dropCurrency = new Select(currency);
		dropCurrency.selectByValue("INR");
		driver.findElementById("createContactForm_description").sendKeys("CONTACT OF LEAD");
		driver.findElementById("createContactForm_importantNote").sendKeys("VALUES OF CONATCT");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("9867");
		driver.findElementById("createContactForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createContactForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("9962553665");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("998");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("nn@gmail.com");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("viji");
		
		driver.findElementById("createContactForm_generalAttnName").sendKeys("for conatact");
		driver.findElementById("createContactForm_generalAddress1").sendKeys("raman street");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("kulalampur", Keys.TAB);
		driver.findElementById("createContactForm_generalCity").sendKeys("chennai");
		WebElement country = driver.findElementById("createContactForm_generalCountryGeoId");
		Select dropCountry = new Select(country);
		dropCountry.selectByVisibleText("India");
		Thread.sleep(2000);
		WebElement stateProvince = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select dropStateProvince = new Select(stateProvince);
		dropStateProvince.selectByValue("IN-TN");
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("269");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("2");
		String toField = driver.findElementById("generalToNameField").getText();
		driver.findElementByName("submitButton").click();
		String firstNameText = driver.findElementById("viewContact_firstName_sp").getText();
		if (firstNameText.contains(toField))
		{
			System.out.println("Correct");
		}
		driver.findElementByLinkText("Edit").click();
		WebElement market = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select marketing = new Select(market);
		marketing.selectByValue("CATRQ_AUTOMOBILE");
		driver.findElementByXPath("//input[@value='Add']").click();
		driver.findElementByXPath("//input[@value='Update']").click();
		
		String camp = driver.findElementById("viewContact_marketingCampaigns_sp").getText();
		if (camp.contains("Automobile"))
		{
			System.out.println("matched");
		}
		
	}
}
