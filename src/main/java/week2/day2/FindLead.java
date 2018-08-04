package week2.day2;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLead {

		public static void main(String[] args) throws InterruptedException {
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
			driver.findElementByXPath("//div[@class='spacer']/following::a[2]").click();
			driver.findElementByXPath("//div[@class=\"frameSectionBody\"]//li[3]/a").click();
			WebElement name=driver.findElementByXPath("(//input[@name='firstName'])[3]");
			name.sendKeys("vijayalakshmi");
			driver.findElementByXPath(("(//td[@class='x-panel-btn-td'])/following::button[5]")).click();
			Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-body']//a").click();
	String title = driver.getTitle();
	
	if (title.contains("View Lead | opentaps CRM")) {
		System.out.println("Title matches");
	} else {
		System.out.println("Title does not  matches");
	}
			//assertTrue(driver.getTitle().contains("http://leaftaps.com"));
			//System.out.println("title matches");
			driver.findElementByXPath("//div[@class='frameSectionExtra']//a[3]").click();
			WebElement cname=driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
			cname.clear();
			cname.sendKeys("mindtree");
			Thread.sleep(5000);
			driver.findElementByXPath("//input[@class='smallSubmit']").click();
			String companyName=driver.findElementById("viewLead_companyName_sp").getText();
			System.out.println(companyName);


			
		
		
		

	}

	
			
		}


			
		


