package week3;
//import static org.junit.Assert.assertTrue;
		//import static org.testng.Assert.assertTrue;

		import java.util.*;

		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		

		

		
			{
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
				driver.manage().window().maximize();
				
				//Click Contact us
				driver.findElementByLinkText("Contact Us").click();
				Set<String> contactUsWindows = driver.getWindowHandles();
				List<String> convertContactWindows= new ArrayList<String>();
				
				convertContactWindows.addAll(contactUsWindows);
				driver.switchTo().window(convertContactWindows.get(1));
				String windowTwoTitle = driver.getTitle();
				System.out.println(windowTwoTitle);
				
				String windowTwoUrl = driver.getCurrentUrl();
				System.out.println(windowTwoUrl);
				driver.close();
				
				
				driver.switchTo().window(convertContactWindows.get(0));
				driver.findElementByLinkText("Compatible Browser").click();
				
				String windowOneTitle = driver.getTitle();
				System.out.println(windowOneTitle);
				
				String windowOneUrl = driver.getCurrentUrl();
				System.out.println(windowOneUrl);
				
				Set<String> compatabileWindows = driver.getWindowHandles();
				List<String> compatabileWindowsVar= new ArrayList<String>();
				
				compatabileWindowsVar.addAll(compatabileWindows);
				driver.switchTo().window(compatabileWindowsVar.get(1));
				
				List<WebElement> browserList = driver.findElementsByXPath("//div[@class='content_12']//ul");
				
				for (WebElement elementsBrowser : browserList)
				{
					System.out.println(elementsBrowser.getText());
				}
										
				 driver.close();
					
		}
			}

	}


