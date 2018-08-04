package parametersnDdataproviders;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login extends Annotations
{
	
	@Test(dataProvider = "fetchdata", invocationCount = 5)
	
	public void createLead(String name, String Lname) {
		WebElement clickCRMSFALink = locateElement("linlText", "CRM/SFA");
		click(clickCRMSFALink);
		WebElement clickCreateLead = locateElement("linkText", "Create Lead");
		click(clickCreateLead);
		WebElement enterFisrtName = locateElement("createLeadForm_firstName");
		type(enterFisrtName, name);
		WebElement enterLastName = locateElement("createLeadForm_companyName");
		type(enterLastName, Lname);
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
	
	@DataProvider(name = "fetchdata", indices =
	{ 1 })
	public Object getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "fname";
		data[0][1] = "lname";
		data[1][0] = "sename";
		data[1][1] = "sename";
		return data;
		
	}
	
	// @Test(priority = 2)
	public void createContact() throws InterruptedException {
		WebElement clickCRMSFALink = locateElement("linkText", "CRM/SFA");
		click(clickCRMSFALink);
		WebElement createContact = locateElement("linkText", "Create Contact");
		click(createContact);
		WebElement firstName = locateElement("firstNameField");
		type(firstName, "viji");
		WebElement lastName = locateElement("lastNameField");
		type(lastName, "sharmi");
		WebElement firstNameLocal = locateElement("createContactForm_firstNameLocal");
		type(firstNameLocal, "viji");
		WebElement lastNameLocal = locateElement("createContactForm_lastNameLocal");
		type(lastNameLocal, "sharmi");
		WebElement title = locateElement("createContactForm_personalTitle");
		type(title, "Miss");
		WebElement profile = locateElement("createContactForm_generalProfTitle");
		type(profile, "Hello");
		WebElement curreny = locateElement("createContactForm_preferredCurrencyUomId");
		selectDropDownUsingText(curreny, "INR - Indian Rupee");
		WebElement description = locateElement("createContactForm_description");
		type(description, "CONTACT OF LEAD");
		WebElement importantNote = locateElement("createContactForm_importantNote");
		type(importantNote, "VALUES OF CONATCT");
		WebElement department = locateElement("createContactForm_departmentName");
		type(department, "cse");
		WebElement phoneAreacode = locateElement("createContactForm_primaryPhoneAreaCode");
		type(phoneAreacode, "9867");
		WebElement phonecountrycode = locateElement("createContactForm_primaryPhoneCountryCode");
		phonecountrycode.clear();
		type(phonecountrycode, "91");
		WebElement phoneNumber = locateElement("createContactForm_primaryPhoneNumber");
		type(phoneNumber, "9962553665");
		WebElement primaryPhoneExtension = locateElement("createContactForm_primaryPhoneExtension");
		type(primaryPhoneExtension, "998");
		WebElement primaryEmail = locateElement("createContactForm_primaryEmail");
		type(primaryEmail, "nn@gmail.com");
		WebElement primaryPhoneAskForName = locateElement("createContactForm_primaryPhoneAskForName");
		type(primaryPhoneAskForName, "viji");
		WebElement generalAttnName = locateElement("createContactForm_generalAttnName");
		type(generalAttnName, "for conatact");
		WebElement generalAddress1 = locateElement("createContactForm_generalAddress1");
		type(generalAddress1, "raman street");
		WebElement generalAddress2 = locateElement("createContactForm_generalAddress2");
		type(generalAddress2, "kulalampur");
		WebElement generalCity = locateElement("createContactForm_generalCity");
		type(generalCity, "chennai");
		WebElement country = locateElement("createContactForm_generalCountryGeoId");
		selectDropDownUsingText(country, "India");
		Thread.sleep(2000);
		WebElement StateProvinceGeoId = locateElement("createContactForm_generalStateProvinceGeoId");
		selectDropDownUsingText(StateProvinceGeoId, "TAMILNADU");
		
		WebElement generalPostalCode = locateElement("createContactForm_generalPostalCode");
		type(generalPostalCode, "269");
		WebElement generalPostalCodeExt = locateElement("createContactForm_generalPostalCodeExt");
		type(generalPostalCodeExt, "2");
		WebElement ToNameField = locateElement("generalToNameField");
		String name = ToNameField.getText();
		WebElement submit = locateElement("name", "submitButton");
		click(submit);
		WebElement verifyFirstName = locateElement("viewContact_firstName_sp");
		verifyPartialText(verifyFirstName, name);
		WebElement edit = locateElement("linkText", "Edit");
		click(edit);
		WebElement market = locateElement("addMarketingCampaignForm_marketingCampaignId");
		selectDropDownUsingText(market, "Automobile");
		WebElement add = locateElement("xpath", "//input[@value='Add']");
		click(add);
		WebElement update = locateElement("xpath", "//input[@value='Update']");
		click(update);
		WebElement verifyMarket = locateElement("viewContact_marketingCampaigns_sp");
		
		verifyPartialText(verifyMarket, "Automobile");
		
	}
}
