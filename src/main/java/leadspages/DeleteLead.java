package leadspages;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByName("phoneCountryCode").sendKeys("91");
		driver.findElementByName("phoneNumber").sendKeys("97798786");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String leadID = driver.findElementByClassName("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByClassName("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("(//div[@class='x-form-element'])[18]/input").sendKeys(leadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		
		

	}

}
