package advanceuserinterface;


	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DragAndDrop

	{
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\driver\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://jqueryui.com/");
			driver.manage().window().maximize();
			driver.findElementByLinkText("Draggable").click();
			
			WebElement className = driver.findElementByClassName("demo-frame");
			driver.switchTo().frame(className);
			WebElement drag = driver.findElementById("draggable");
			Actions builder = new Actions(driver);
			builder.dragAndDropBy(drag, 100, 17).perform();
			driver.switchTo().defaultContent();
			
			driver.findElementByLinkText("Selectable").click();
			WebElement className1 = driver.findElementByClassName("demo-frame");
			driver.switchTo().frame(className1);
			WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
			Actions builder1 = new Actions(driver);
			builder1.clickAndHold(item1).release().perform();
			
			WebElement item2 = driver.findElementByXPath("//ol[@id='selectable']/li[4]");
			WebElement item3 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
			
			builder1.clickAndHold(item2).release(item3).perform();
			
			/*
			 * driver.findElementByLinkText("Droppable").click(); WebElement className1 =
			 * driver.findElementByClassName("demo-frame");
			 * driver.switchTo().frame(className1); WebElement drop =
			 * driver.findElementById("draggable"); Actions builder1 = new Actions(driver);
			 * WebElement droppable =driver.findElementById("droppable");
			 * builder.dragAndDrop(drop,droppable).perform();
			 * driver.switchTo().defaultContent();
			 */
			
			driver.findElementByLinkText("Sortable").click();
			WebElement className2 = driver.findElementByClassName("demo-frame");
			driver.switchTo().frame(className2);
			WebElement sort = driver.findElementByXPath("//ul[@id ='sortable']/li[1]");
			Actions bulider3 = new Actions(driver);
			Point location = driver.findElementByXPath("//ul[@id ='sortable']/li[5]").getLocation();
			System.out.println(location);
			bulider3.dragAndDropBy(sort, location.x, location.y).perform();
			
		}
		
	}


