package week3;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
					{
						System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
						
						ChromeDriver driver=new ChromeDriver();
						driver.get("http://popuptest.com/popuptest12.html");
						driver.manage().window().maximize();
						Set<String> parentWindow = driver.getWindowHandles();
						List<String> parentWindowsConvert= new ArrayList<String>();
						parentWindowsConvert.addAll(parentWindow);
						boolean addAll = parentWindowsConvert.addAll(parentWindow);
						System.out.println(addAll);
						driver.switchTo().defaultContent();
						
						//List<WebElement> close = driver.findElementsByTagName("img");

						for(int i=0;1<=3;i++)
						
						{
							driver.switchTo().window(parentWindowsConvert.get(i));
							driver.close();
							//System.out.println(close);
							
							
						}
						
					
						
						
			}

		}

	}


