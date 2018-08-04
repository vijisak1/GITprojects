package week2.seleniumday1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Sel\\Selenium\\driver\\chromedriver.exe");
		//ChromeOptions op =new ChromeOptions();
		//op.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("vijayalakshmi");
		driver.findElementById("userRegistrationForm:password").sendKeys("vijipapa@143");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("vijipapa@143");
		WebElement drop = driver.findElementById("userRegistrationForm:securityQ");
		Select dlValue = new Select(drop);
		dlValue.selectByVisibleText("What is your pet name?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("tom");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("vijaya");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("lakshmi");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("dhandapani");
		WebElement radioBut = driver.findElementById("userRegistrationForm:gender:1");
		radioBut.click();
		WebElement radioButt = driver.findElementById("userRegistrationForm:maritalStatus:1");
		radioButt.click();
		WebElement dropDate = driver.findElementById("userRegistrationForm:dobDay");
		Select dateValue = new Select(dropDate);
		dateValue.selectByIndex(25);
		WebElement dropMn = driver.findElementById("userRegistrationForm:dobMonth");
		Select monValue = new Select(dropMn);
		monValue.selectByIndex(4);
		WebElement dropYr = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select monYear = new Select(dropYr);
		monYear.selectByIndex(8);
		WebElement occu = driver.findElementById("userRegistrationForm:occupation");
		Select occup = new Select(occu);
		occup.selectByIndex(2);
		driver.findElementById("userRegistrationForm:uidno").sendKeys("3421 6754 8765");
		driver.findElementById("userRegistrationForm:idno").sendKeys("ATPV258K");
		WebElement selCu = driver.findElementById("userRegistrationForm:countries");
		Select con= new Select(selCu);
		con.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("viajyalakshmid26@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9789199510");
		WebElement nation = driver.findElementById("userRegistrationForm:nationalityId");
		Select national= new Select(nation);
		national.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("flat no 5");
		driver.findElementById("userRegistrationForm:street").sendKeys("tansi nagar");
		driver.findElementById("userRegistrationForm:area").sendKeys("velacherry");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600096",Keys.TAB );
		//driver.findElementById("userRegistrationForm:statesName").sendKeys("tamilnadu");
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:cityName").sendKeys("kanchipuram" ,Keys.ENTER);
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:postofficeName").sendKeys("perungudi s.o" ,Keys.ENTER);


		//driver.findElementById("userRegistrationForm:postofficeName").sendKeys(Keys.ENTER);
		driver.findElementById("userRegistrationForm:landline").sendKeys("9962553665");
		WebElement radioBt = driver.findElementById("userRegistrationForm:resAndOff:0");
		radioBt.click();
	}
}