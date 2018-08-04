package framework;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	RemoteWebDriver driver ;
	int i = 1;
	public void startApp(String browser, String url) {	

		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();			
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				driver = new FirefoxDriver();		
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (WebDriverException e) {			
			System.err.println("WebDriverException has occurred");
		} catch(Exception e) {
			System.err.println("Exception has occurred");
			throw new RuntimeException();
		}
		System.out.println("The Browser "+browser+" is Launched Successfully");
		takeSnap();

	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);		
			}
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException");
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The Data "+data+" is Entered Successfully");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException has occurred");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception has occurred");
			throw new RuntimeException();
		}finally {
			takeSnap();			
		}
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
		takeSnap();		
	}

	public String getText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);
		return text;		
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);
		System.out.println("The Value"+value+" is Selected in This "+ele);
		takeSnap();
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select dd = new Select(ele);
		dd.selectByIndex(index);
		System.out.println("The dropdown is Selected in This "+ele);
		takeSnap();

	}

	public boolean verifyTitle(String expectedTitle) {
		boolean bReturn  = false;
		if (driver.getTitle().equals(expectedTitle)) {
			System.out.println("The expectedTitle Is Matched Successfully");
			bReturn =  true;
		} else {
			System.out.println("The expectedTitle Is not Matched");
		}
		return bReturn ;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			if (ele.getText().equals(expectedText)) {
				System.out.println("The expectedText Is Matched Successfully");
			}else {
				System.out.println("The expectedText Is Not Matched");
			}
		} catch (Exception e) {
			System.err.println("Exception");
			throw new RuntimeException();
		}

	}

	public void verifyPartialText(WebElement ele, String expectedText) {

		if (ele.getText().contains(expectedText)) {
			System.out.println("The expectedText Is Matched Successfully");
		}else {
			System.out.println("The expectedText Is Not Matched");
		}

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).equals(value)) {
			System.out.println("The expectedText Is Matched Successfully");
		}else {
			System.out.println("The expectedText Is Not Matched");
		}

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).equals(value)) {
			System.out.println("The expectedText Is Matched Successfully");
		}else {
			System.out.println("The expectedText Is Not Matched");
		}

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void switchToWindow(int index) {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> listOfWindows = new ArrayList<String>();
		listOfWindows.addAll(allWindows);
		driver.switchTo().window(listOfWindows.get(index));
		takeSnap();
	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		takeSnap();
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();

	}

	public String getAlertText() {
		return driver.switchTo().alert().getText();
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
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

}