package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HealthAndWellness;

public class HealthForm {
	WebDriver driver = BaseClass.getDriver();
	HealthAndWellness hw = new HealthAndWellness(driver);
	
		@Given("the user clicks on for corporates option")
	public void the_user_clicks_on_for_corporates_option() {
		BaseClass.getLogger().info("*****Clicking on corporates option*****");
	    hw.clickCorporates();
	}

	@When("the user clicks on Health&Wellness plan")
	public void the_user_clicks_on_health_wellness_plan() throws InterruptedException {
		Thread.sleep(1000);
	    hw.clickHealth();
	}

	@When("the user fills all the given fields")
	public void the_user_fills_all_the_given_fields() throws InterruptedException, IOException {
		BaseClass.getLogger().info("*****Filling all the fields with valid data*****");
	    Thread.sleep(1000);
	    hw.sendName(BaseClass.randomeString().toLowerCase());
	    hw.sendOrgName(BaseClass.randomeString().toLowerCase());
	    hw.sendContact(BaseClass.getProperties().getProperty("contact"));
	    hw.sendMail(BaseClass.randomeString().toLowerCase()+"@gmail.com");
	    hw.clickOrgSize();
	    hw.clickInterest();
	}

	@When("clicks on Schedule a demo button")
	public void clicks_on_schedule_a_demo_button() {
		BaseClass.getLogger().info("*****Clicking on schedule a demo button*****");
	    hw.clickSubmit();
	}

	@Then("the user navigates to Thankyou page")
	public void the_user_navigates_to_thankyou_page() throws InterruptedException {
		BaseClass.getLogger().info("*****Validating thankyou message*****");
		Thread.sleep(5000);
	    Assert.assertEquals(hw.validation(),true);
	}

}
