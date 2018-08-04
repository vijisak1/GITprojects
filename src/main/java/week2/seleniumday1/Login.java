package week2.seleniumday1;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Sel\\Selenium\\driver\\chromedriver.exe");
		//ChromeOptions op =new ChromeOptions();
		//op.setHeadless(true);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement pwd = driver.findElementById("password");
		pwd.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("amazon");
		driver.findElementById("createLeadForm_firstName").sendKeys("vijayalakshmi");
		WebElement lastName = driver.findElementById("createLeadForm_lastName");
		lastName.sendKeys("dhandapani");
		

		WebElement drop = driver.findElementById("createLeadForm_industryEnumId");
		Select dlValue = new Select(drop);
		dlValue.selectByVisibleText("Insurance");
		
		List<WebElement> alloptions = dlValue.getOptions();
		int size = alloptions.size();
		System.out.println(size);
		for (WebElement webElement : alloptions) {
			System.out.println(webElement.getText());
			
		}
		
		driver.findElementByName("submitButton").click();
		
		
		
	

	}

}
