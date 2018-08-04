package testinggroups;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import dataproviderfromexcel.Annotations;

public class Gropus extends Annotations
{
	
	@Test(groups =
	{ "smoke" })
	public void createLead() {
		WebElement clickCRMSFALink = locateElement("linkText", "CRM/SFA");
		click(clickCRMSFALink);
		WebElement clickCreateLead = locateElement("linkText", "Create Lead");
		click(clickCreateLead);
		WebElement enterFisrtName = locateElement("createLeadForm_firstName");
		type(enterFisrtName, "viji");
		WebElement enterLastName = locateElement("createLeadForm_companyName");
		type(enterLastName, "sharmi");
		WebElement enterCompanyName = locateElement("createLeadForm_lastName");
		type(enterCompanyName, "amazon");
		WebElement source = locateElement("createLeadForm_dataSourceId");
		selectDropDownUsingText(source, "Direct Mail");
		WebElement clickLeadButton = locateElement("class", "smallSubmit");
		click(clickLeadButton);
		WebElement verifyName = locateElement("viewLead_firstName_sp");
		verifyExactText(verifyName, "viji");
		verifyTitle("leaftaps");
	}
	
}
