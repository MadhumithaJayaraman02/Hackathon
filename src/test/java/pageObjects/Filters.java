package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Filters extends BasePage {

	public Filters(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
    @FindBy(xpath="//div[@role='button'][2]")
	WebElement click_stories;
    
    @FindBy(xpath="//div[@role='button'][2]//li[1]")
	WebElement select_stories;
    
    @FindBy(xpath="//div[@role='button'][3]")
	WebElement click_Exp;
    
    @FindBy(xpath="//div[@role='button'][3]//li[2]")
	WebElement select_exp;
    
    @FindBy(xpath="//div[@class='pure-u-4-24'][1]//label[4]")
	WebElement select_availability;
    
    @FindBy(xpath="//span[text()='Relevance']")
	WebElement click_sortby;
    
    @FindBy(xpath="//div[@role='button'][4]")
	WebElement click_allfilter;
    
    @FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[6]/div/div/div/ul/li[2]")
	WebElement select_sortby;
    
    @FindBy(xpath="//div[@class='pure-u-4-24'][1]//label[3]")
	WebElement select_fees;
    
    public void clickStories() throws InterruptedException {
		Thread.sleep(3000);
		click_stories.click();
	}
	
	public void selectStories() {
		select_stories.click();
	}
	
	public void clickExp() {
		click_Exp.click();
	}
	
	public void selectExp() {
		select_exp.click();
	}
	
	public void clickAllFilter() {
		click_allfilter.click();
	}
	
	public void selectFees() throws InterruptedException {
		
		Thread.sleep(5000);
		js.executeScript("arguments[0].click()",select_fees);
	}
	
	public void selectAvailablity() {	
		js.executeScript("arguments[0].click()",select_availability);
	}
	
	public void clickSortBy() {
		js.executeScript("arguments[0].click()",click_sortby);
	}
	
	
	public void selectSortBy() throws InterruptedException {		
		js.executeScript("arguments[0].click()",select_sortby);
		Thread.sleep(2000);
	}
}


