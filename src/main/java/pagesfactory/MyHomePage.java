package pagesfactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataproviderfromexcel.Annotations;

public class MyHomePage extends Annotations
{
	public MyHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Leads")
	WebElement eleLeads;
	
	public MyLeadsPage clickLeads() {
		click(eleLeads);
		return new MyLeadsPage();
	}
}
