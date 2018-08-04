package reporter;

import org.testng.annotations.Test;

public class CreateLead extends Annotations
{
	
	@Test(invocationCount = 2)
	public void createLead() {
		click(locateElement("linkText", "Create Lead1"));
		type(locateElement("id", "createLeadForm_companyName"), "TL");
		type(locateElement("id", "createLeadForm_firstName"), "Babu");
		type(locateElement("id", "createLeadForm_lastName"), "M");
		type(locateElement("id", "createLeadForm_primaryEmail"), "babu@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9843824324");
		click(locateElement("name", "submitButton"));
	}
	
}
