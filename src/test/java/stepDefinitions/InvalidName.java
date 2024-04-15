package stepDefinitions;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HealthAndWellness;

public class InvalidName {
	
	HealthAndWellness hw=new HealthAndWellness(BaseClass.getDriver());

	@Given("the users clicks on For Corporates option")
	public void the_users_clicks_on_for_corporates_option() {
		hw.clickCorporates();
	}

	@Given("the user clicks on the health and wellness option")
	public void the_user_clicks_on_the_health_and_wellness_option() {
		hw.clickHealth();
	}

	@When("the user provides incorrect name")
	public void the_user_provides_incorrect_name() throws IOException {
		
		BaseClass.getLogger().info("*****Passing incorrect name*****");
		hw.sendName(BaseClass.randomeNumber());
		hw.sendOrgName(BaseClass.randomeString().toLowerCase());
	    hw.sendContact(BaseClass.getProperties().getProperty("contact"));
	    hw.sendMail(BaseClass.randomeString().toLowerCase()+"@gmail.com");
	    hw.clickOrgSize();
	    hw.clickInterest();
	}

	@Then("the schedule a demo button should be disabled")
	public void the_schedule_a_demo_button_should_be_disabled() {
		BaseClass.getLogger().info("*****Validating demobutton*****");
	    if(hw.submit.isEnabled()) {
	    	System.out.println("*******enabled*********");	    	
	    }
	    else {
	    	System.out.println("******disabled******");
	    }
	}
	
	

}


