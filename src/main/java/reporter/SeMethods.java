package reporter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods
{
	RemoteWebDriver driver;
	int i = 1;
	Select dropValue;
	Set<String> allWindows;
	List<String> getWindows;
	
	public void startApp(String browser, String url) {
		try
		{
			if (browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (WebDriverException e)
		{
			
			e.printStackTrace();
			System.err.println(e);
			throw new RuntimeException();
		} catch (Exception e)
		{
			
			e.printStackTrace();
			System.err.println(e);
			throw new RuntimeException();
		}
		System.out.println("The Browser " + browser + " is Launched Successfully");
		takeSnap();
	}
	
	public WebElement locateElement(String locator, String locValue) {
		try
		{
			switch (locator)
			{
			case "id":
				return driver.findElementById(locValue);
			case "class":
				return driver.findElementByClassName(locValue);
			case "xpath":
				return driver.findElementByXPath(locValue);
			case "linkText":
				return driver.findElementByLinkText(locValue);
			case "name":
				return driver.findElementByName(locValue);
			case "tagname":
				return driver.findElementByTagName(locValue);
			}
		} catch (NoSuchElementException e)
		{
			
			System.err.println("Error appeared");
		} catch (Exception e)
		{
			System.err.println("Error appeared");
		}
		return null;
	}
	
	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
		
	}
	
	public void type(WebElement ele, String data) {
		try
		{
			ele.sendKeys(data);
		} catch (Exception e)
		{
			
			e.printStackTrace();
		}
		System.out.println("The Data " + data + " is Entered Successfully");
		takeSnap();
	}
	
	public void click(WebElement ele) {
		try
		{
			ele.click();
		} catch (NullPointerException e)
		{
			System.err.println(e);
			throw new NullPointerException();
		} catch (Exception e)
		{
			System.err.println(e);
			throw new NullPointerException();
		}
		System.out.println("The Element " + ele + " is clicked Successfully");
		takeSnap();
	}
	
	public void selectDropDownUsingText(WebElement ele, String value) {
		dropValue = new Select(ele);
		dropValue.selectByVisibleText(value);
	}
	
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		dropValue = new Select(ele);
		dropValue.selectByIndex(index);
	}
	
	public boolean verifyTitle(String expectedTitle) {
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains(expectedTitle))
		{
			System.out.println("success");
			return true;
		}
		return false;
	}
	
	public void verifyExactText(WebElement ele, String expectedText) {
		String actualText = getText(ele);
		if (actualText.equals(expectedText))
		{
			System.out.println("Passed");
		} else
		{
			System.out.println("Failed");
		}
	}
	
	public void verifyPartialText(WebElement ele, String expectedText) {
		String actualText = ele.getText();
		if (actualText.contains(expectedText))
		{
			System.out.println("Passed");
		} else
		{
			System.out.println("Failed");
		}
	}
	
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		String exactAttribute = ele.getAttribute(attribute);
		if (exactAttribute.equals(value))
		{
			System.out.println("Entered attribute is matched");
		} else
		{
			System.out.println("Entered attribute is not matched");
		}
	}
	
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		String exactAttribute = ele.getAttribute(attribute);
		if (exactAttribute.contains(value))
		{
			System.out.println("Entered attribute is matched");
		} else
		{
			System.out.println("Entered attribute is not matched");
		}
	}
	
	public void verifySelected(WebElement ele) {
		if (ele.isSelected())
		{
			System.out.println("Respected element is selected");
		} else
		{
			System.out.println("Respected element is not selected");
		}
		
	}
	
	public void verifyDisplayed(WebElement ele) {
		if (ele.isDisplayed())
		{
			System.out.println("The element is displayed");
		} else
		{
			System.out.println("The element is not displayed");
		}
		
	}
	
	public void switchToWindow(int index) {
		try
		{
			allWindows = driver.getWindowHandles();
			getWindows = new ArrayList<String>();
			getWindows.addAll(allWindows);
			driver.switchTo().window(getWindows.get(index));
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		} catch (NoSuchWindowException e)
		{
			System.err.println(e);
			throw new RuntimeException();
		} catch (Exception e)
		{
			System.err.println(e);
			throw new RuntimeException();
		}
	}
	
	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public String getAlertText() {
		String alertText = driver.switchTo().alert().getText();
		return alertText;
	}
	
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img" + i + ".png");
		try
		{
			FileUtils.copyFile(src, desc);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		i++;
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void closeAllBrowsers() {
		driver.quit();
	}
	
	@Override
	public String getText(WebElement ele) {
		String actualText = ele.getText();
		return actualText;
	}
}
