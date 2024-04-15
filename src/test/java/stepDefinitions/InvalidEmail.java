package stepDefinitions;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.When;
import pageObjects.HealthAndWellness;

public class InvalidEmail {

	HealthAndWellness hw=new HealthAndWellness(BaseClass.getDriver());
	
	@When("the user provides incorrect email")
	public void the_user_provides_incorrect_email() throws IOException {
		BaseClass.getLogger().info("*****Passing invalid email id*****");
		hw.sendName(BaseClass.randomeString().toLowerCase());
		hw.sendOrgName(BaseClass.randomeString().toLowerCase());
	    hw.sendContact(BaseClass.getProperties().getProperty("contact"));
	    hw.sendMail(BaseClass.randomeString().toLowerCase()+"gmail.com");
	    hw.clickOrgSize();
	    hw.clickInterest();
	}
	
	
	
	
}
