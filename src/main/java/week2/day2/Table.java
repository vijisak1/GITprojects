package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Sel\\Selenium\\driver\\chromedriver.exe");
		//ChromeOptions op =new ChromeOptions();
		//op.setHeadless(true);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		int sizeCol = driver.findElementsByXPath("//section[@class='innerblock']//tr[2]/td").size();
			System.out.println(sizeCol);	
			int sizeRow= driver.findElementsByXPath("//section[@class='innerblock']//tr[2]").size();
			System.out.println(sizeRow);
			String value = driver.findElementByXPath("//section[@class='innerblock']//table//tr[3]/td[2]").getText();
			System.out.println(value);
			driver.findElementByXPath("//section[@class='innerblock']//table//tr[4]/td[3]").click();
			
	}
	

}
