package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesfactory.MyHomePage;
import wdmethods.Annotations;

public class TestCaseCreateLead extends Annotations

{
	@BeforeTest
	public void setValues() {
		author = "Sharmi";
		category = "smoke";
		moduleName = "Leads";
		excelFileName = "Login";
		testName = "Create Lead";
		testDesc = "Create a New Lead";
	}
	
	@Test(dataProvider = "fetchData")
	public void TestCaseLead(String cname, String fname, String lname) {
		new MyHomePage().clickLeads().clickCreateLeadButton().clickCreateLeads(cname, fname, lname).verifyName(fname);
	}
}
