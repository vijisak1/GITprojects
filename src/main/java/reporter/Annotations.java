package reporter;

import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import dataproviderfromexcel.SeMethods;

public class Annotations extends SeMethods

{
	
	@Parameters(
	{ "url", "name", "pwd" })
	@BeforeMethod
	public void login(String url, String name, String pwd) {
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, name);
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, pwd);
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement eleVerifyGivenName = locateElement("xpath", "//h2");
		verifyPartialText(eleVerifyGivenName, "Demo Sales Manager");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		beginResult();
	}
	
	@BeforeClass
	public void beforeClass()
	
	{
		startTest(null, null);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
