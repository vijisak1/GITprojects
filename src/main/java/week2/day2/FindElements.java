package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Sel\\Selenium\\driver\\chromedriver.exe");
		//ChromeOptions op =new ChromeOptions();
		//op.setHeadless(true);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement pwd = driver.findElementById("password");
		
		pwd.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		List<WebElement> findElementsByTagName = driver.findElementsByTagName("select");
		int size = findElementsByTagName.size();
		System.out.println(size);
			
	
}}

