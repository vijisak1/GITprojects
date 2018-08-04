package week3;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMe {

	

	

			public static void main(String[] args) throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\driver\\chromedriver.exe" );
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://layout.jquery-dev.com/demos/iframe_local.html ");
				driver.manage().window().maximize();
				
				driver.findElementByXPath("//button[text()='Close Me']").click();
				
				driver.switchTo().frame("childIframe");
				driver.findElementByXPath("//button[text()='Close Me']").click();
				driver.findElementByXPath("(//button[text()='Close Me'])[2]").click();
				driver.switchTo().defaultContent();	
				
				driver.findElementByXPath("//button[text()='Close Me']").click();


	}

}
