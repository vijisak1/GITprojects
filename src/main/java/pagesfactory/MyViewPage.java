package pagesfactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataproviderfromexcel.Annotations;

public class MyViewPage extends Annotations
{
	public MyViewPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "viewLead_firstName_sp")
	WebElement eleFirstName;
	
	public void verifyName(String expectedText) {
		verifyExactText(eleFirstName, expectedText);
		
	}
	
}
