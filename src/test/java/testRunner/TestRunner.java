package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		            		
		            features= {
		            		".//Features/doctorDetails.feature",
		            		".//Features/HealthAndWellness.feature",
		            		".//Features/InvalidContact.feature",
		            		".//Features/invalidEmail.feature",
		            		".//Features/InvalidName.feature",
		            		".//Features/Surgeries.feature"},
		            		
		            		//{"@target/rerun.txt"}, 
		            		
					 
					glue="stepDefinitions",
					plugin= {"pretty", "html:report/myreport.html", 
							  "rerun:target/rerun.txt",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
							
			       dryRun=false,    // checks mapping between scenario steps and step definition methods
					monochrome=true,    // to avoid junk characters in output
					publish=false  // to publish report in cucumber server
					//tags="@sanity"  // this will execute scenarios tagged with @sanity
					//tags="@regression"
					//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
					//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
					//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
					)

public class TestRunner {

}