package pagesfactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataproviderfromexcel.Annotations;

public class MyLeadsPage extends Annotations
{
	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Create Lead")
	WebElement eleCreateLeads;
	
	public MyCreateLeadPage clickCreateLeadButton() {
		click(eleCreateLeads);
		return new MyCreateLeadPage();
	}
}
