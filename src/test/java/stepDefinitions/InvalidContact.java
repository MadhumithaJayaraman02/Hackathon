package stepDefinitions;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.When;
import pageObjects.HealthAndWellness;

public class InvalidContact {

	HealthAndWellness hw=new HealthAndWellness(BaseClass.getDriver());
	
	@When("the user provides incorrect phonenumber")
	public void the_user_provides_incorrect_phonenumber() throws IOException {
		BaseClass.getLogger().info("*****Passing invalid phonenumber*****");
		
		hw.sendName(BaseClass.randomeString().toLowerCase());
		hw.sendOrgName(BaseClass.randomeString().toLowerCase());
	    hw.sendContact(BaseClass.randomAlphaNumeric());
	    hw.sendMail(BaseClass.randomeString().toLowerCase()+"@gmail.com");
	    hw.clickOrgSize();
	    hw.clickInterest();
	}
	
	
	
	
}
