package week3;
import java.util.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CloseAllframes {

	public static void main(String[] args) {
		
		
			{
				System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\driver\\chromedriver.exe" );
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
				driver.manage().window().maximize();
				
				List<WebElement> frameNumbers = driver.findElementsByTagName("iframe");
				for (WebElement count : frameNumbers)
				{
					System.out.println(count.getSize());
				}
				driver.quit();
				
					
		}
			}


	}

