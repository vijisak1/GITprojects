package leadspages;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead 
{

	static String userName="DemoSalesManager";
    static String password="crmsfa";
    static String firstName="ShaJ";
    static String companyName="emis";
	
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
		//driver.findElementByName("firstName").sendKeys("Sharmila");
		driver.findElementByXPath("(//div[@class='x-form-element'])[19]/input").sendKeys("Sharmila");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(companyName);
		driver.findElementByName("submitButton").click();
		driver.close();
		

	}

}
