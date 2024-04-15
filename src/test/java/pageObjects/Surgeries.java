package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Surgeries extends BasePage {

	WebDriver driver;

	public Surgeries(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='product-tab__title'][text()='Surgeries']")
	WebElement surgery;
	
	@FindBy(xpath="//div[@class='SurgicalSolutions-module_ailmentItemWrapper__Krx-u']")
	List<WebElement> surgeryL;
	
	public void surgeries() throws InterruptedException {
		Thread.sleep(2000);
		surgery.click();
	}
	
	public List<String> surgeryList() throws InterruptedException {
		Thread.sleep(1000);
		
		List<String> l = new ArrayList<String>();
			for(WebElement i : surgeryL) {
			l.add(i.getText());
		}
		return l ;
	}
	

}
