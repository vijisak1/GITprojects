package advanceuserinterface;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Flipkart {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\driver\\chromedriver.exe" );
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElementByXPath("//button[text()='✕']").click();
			WebElement tv = driver.findElementByXPath("//span[text()='TVs & Appliances']");
			WebElement mi=driver.findElementByXPath("(//span[text()='Mi'])[2]");	
			Actions tvv =new Actions(driver);
			tvv.moveToElement(tv).pause(3000).click(mi).perform();
			
		
			
		}

	}


