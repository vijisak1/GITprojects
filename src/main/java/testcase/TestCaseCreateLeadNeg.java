package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesfactory.MyHomePage;
import wdmethods.Annotations;

public class TestCaseCreateLeadNeg extends Annotations

{
	@BeforeTest
	public void setValues() {
		author = "Sharmi, Viji";
		category = "smoke";
		moduleName = "Leads";
		excelFileName = "CreateLeadNeg";
		testName = "Create Lead";
		testDesc = "Create a New Lead";
	}
	
	@Test(dataProvider = "fetchData")
	public void TestCaseLead(String cname, String fname, String lname, String errorMsg) {
		new MyHomePage().clickLeads().clickCreateLeadButton().clickCreateLeadsNeg(cname, fname, lname)
				.errorMsg(errorMsg);
	}
}
