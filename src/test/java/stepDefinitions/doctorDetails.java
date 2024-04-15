package stepDefinitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.ExcelUtility;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DocDetails;
import pageObjects.Filters;
import pageObjects.SearchPage;

public class doctorDetails {
    WebDriver driver = BaseClass.getDriver();
	Filters f = new Filters(driver);
	SearchPage sp = new SearchPage(driver);
	DocDetails d =new DocDetails(driver);
	List<String> l = new ArrayList<String>();
	
	@Given("the user is on practo homepage and clears the default location")
	public void the_user_is_on_practo_homepage_and_clears_the_default_location() throws InterruptedException {
	 BaseClass.getLogger().info("*****Clearing the default location*****");
	 sp.clearLocation();
	}

	@When("the user selects the location as {string}")
	public void the_user_selects_the_location_as(String loc) throws InterruptedException {
		BaseClass.getLogger().info("*****Passing location*****");
	    sp.setLoc(loc);
	    sp.clickLocation();
	    
	}
	
	@When("searches for a speacialist as {string}")
	public void searches_for_a_speacialist_as(String spec) throws InterruptedException {
		BaseClass.getLogger().info("*****Selecting specialist*****");
	    sp.selectDepartment(spec);
	    sp.clickDepartment();
	}

	@When("the user applies various filters")
	public void the_user_applies_various_filters() throws InterruptedException {
		BaseClass.getLogger().info("*****Applying various filters*****");		
	    f.clickStories();
	    f.selectStories();
	    f.clickExp();
	    f.selectExp();
	    f.clickAllFilter();
	    f.selectFees();
	    f.selectAvailablity();
	    f.clickSortBy();
	    f.selectSortBy();
	}

	@Then("the user gets doctors details and prints it")
	public void the_user_gets_doctors_details_and_prints_it() throws InterruptedException, IOException {
		BaseClass.getLogger().info("*****Prints the doctor details*****");
	    	    
		for(int i=2;i<7;i++) {
			Thread.sleep(1000);				
			WebElement info=BaseClass.getDriver().findElement(By.xpath("(//div[@class='info-section'])["+i+"]"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", info);		

			js.executeScript("arguments[0].click();", info);
			Thread.sleep(5000);
			
			BaseClass.getLogger().info("***** Getting the Window Handles *****");
			Set<String>window=driver.getWindowHandles();
			List<String>wind=new ArrayList<String>(window);
			
			String parent=wind.get(0);
			String child=wind.get(1);
			driver.switchTo().window(child);
			
			
			BaseClass.getLogger().info("***** Printing the first five doctor details *****");
			System.out.println();
			System.out.println(d.docList());
			
	       System.out.println();
			
	       List<String> ss = d.docList();
			for(String a: ss )
			l.add(a);
			driver.close();
			driver.switchTo().window(parent);	
		}
		System.out.println();
		ExcelUtility.output1(l);
		ExcelUtility.closeExcel();
	}
	
	
}
