package pagesfactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataproviderfromexcel.Annotations;

public class MyCreateLeadPage extends Annotations
{
	public MyCreateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "createLeadForm_companyName")
	WebElement elecompanyName;
	@FindBy(id = "createLeadForm_firstName")
	WebElement eleFirstName;
	@FindBy(id = "createLeadForm_lastName")
	WebElement eleLastName;
	@FindBy(name = "submitButton")
	WebElement eleSubmit;
	@FindBy(className = "errorList")
	WebElement eleErrorMsg;
	
	public MyViewPage clickCreateLeads(String cname, String fName, String lName) {
		type(elecompanyName, cname);
		type(eleFirstName, fName);
		type(eleLastName, lName);
		click(eleSubmit);
		return new MyViewPage();
	}
	
	public MyCreateLeadPage clickCreateLeadsNeg(String cname, String fName, String lName) {
		type(elecompanyName, cname);
		type(eleFirstName, fName);
		type(eleLastName, lName);
		click(eleSubmit);
		return this;
	}
	
	public MyCreateLeadPage errorMsg(String expectedText) {
		verifyPartialText(eleErrorMsg, expectedText);
		return this;
	}
}
