package GridScript;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class JqueryUi {

	@Test
	public void frame() throws InterruptedException, MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new RemoteWebDriver(
				new URL("http://192.168.54.12:4444/wd/hub"), dc);
		
		//Load the URL
		driver.get("http://jqueryui.com/draggable/");
		
		WebElement demo = driver.findElementByClassName("demo-frame");
		
		// switch to the frame
		driver.switchTo().frame(demo);
		
		// Get the text of the draggable
		System.out.println(driver.findElementById("draggable").getText());
		
		// come out frame
		driver.switchTo().defaultContent();
		
		// Click on the Download
		driver.findElementByLinkText("Download").click();
		
		
		
		
	}
}