package week3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\driver\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Draggable").click();
		
		WebElement className = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(className);
		String text = driver.findElementById("draggable").getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("Droppable").click();
		WebElement className1 = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(className1);
		String text1 = driver.findElementById("draggable").getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		
		
}
	}
