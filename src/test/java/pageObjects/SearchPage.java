package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@FindBy(xpath="//input[@placeholder='Search location']")
	WebElement clear_location;
	
	@FindBy(xpath="(//div[@data-qa-id='omni-suggestion-main'])[1]")
	WebElement click_location;
	
	@FindBy(xpath="//input[@data-qa-id='omni-searchbox-keyword']")
	WebElement department;
	
	@FindBy(xpath="//div[@class='c-omni-suggestion-item'][1]")
	WebElement click_department;
	
	
	public void clearLocation() throws InterruptedException {
		Thread.sleep(2000);
		clear_location.clear();
	}
	
	public void setLoc(String loc) throws InterruptedException {
		Thread.sleep(2000);
		clear_location.sendKeys(loc);
	}
	
	public void clickLocation() throws InterruptedException {
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()",click_location);
	}
	
	public void selectDepartment(String dept) throws InterruptedException {
		Thread.sleep(3000);
		//js.executeScript("arguments[0].setAttribute('value','dept')",department);
		department.sendKeys(dept);
	}
	public void clickDepartment() throws InterruptedException {
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()",click_department);
			
		}	
}
