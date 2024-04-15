package stepDefinitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Utilities.ExcelUtility;
import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Surgeries;

public class SurgeriesList {
	
	Surgeries s = new Surgeries(BaseClass.getDriver());
	List<String> sl = new ArrayList<String>();
	
	@When("the user clicks on the surgeries button")
	public void the_user_clicks_on_the_surgeries_button() throws InterruptedException {
		BaseClass.getLogger().info("*****clicking on surgery button*****");
		Thread.sleep(2000);
	    s.surgeries();
	}

	@Then("the user prints all the surgeries given")
	public void the_user_prints_all_the_surgeries_given() throws InterruptedException, IOException {
		BaseClass.getLogger().info("*****Printing surgerylist*****");
		Thread.sleep(2000);
	    s.surgeryList();
	    List<String> list = s.surgeryList();
	    for(String a: list) {
	    	System.out.println(a);
	    	sl.add(a);
	    }
	    System.out.println();
	    ExcelUtility.output1(sl);
	    ExcelUtility.closeExcel();
	}
}
