package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class HealthAndWellness extends BasePage{

	public HealthAndWellness(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@FindBy(xpath="(//*[text()='For Corporates'])[1]")
	WebElement clickCorporates;
	
	@FindBy(xpath="//a[text()='Health & Wellness Plans']")
	WebElement click_health;
	
	@FindBy(id="name")
    WebElement send_name;
	
	@FindBy(id="organizationName")
    WebElement send_org;
	
	@FindBy(id="contactNumber")
    WebElement send_contact;
	
	@FindBy(id="officialEmailId")
    WebElement send_mailID;
	
	@FindBy(id="organizationSize")
    WebElement click_orgSize;
	
	@FindBy(id="interestedIn")
    WebElement click_interest;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/header[2]/div[2]/div/form/button")
	public
	WebElement submit;
	
	@FindBy(xpath="(//div[text()='THANK YOU'])")
    WebElement thanks;
	
		public void clickCorporates() {
			clickCorporates.click();
		}
	
	    public void clickHealth() {
	    	click_health.click();
	    }
	    
	    public void sendName(String name) {
	    	send_name.sendKeys(name);
	    }
	    
	     public void sendOrgName(String orgname) {
	    	send_org.sendKeys(orgname);
	    }
	    
	    public void sendContact(String contact) {
	    	send_contact.sendKeys(contact);
	    }
	    
	    public void sendMail(String mail) {
	    	send_mailID.sendKeys(mail);
	    }
	    
	    public void clickOrgSize() {
	      Select ss=new Select(click_orgSize);
	      ss.selectByIndex(2);
	    }
	    
	    public void clickInterest() {
	      Select ss=new Select(click_interest);
	      ss.selectByIndex(2);
	    }
	    
	     public void clearMail() {
	    	send_mailID.clear();
	    }
	    
	     public void sendCorrectMail(String correctmail) {
	    	send_mailID.sendKeys(correctmail);
	    }
	    
	     public void clickSubmit() {   	
	    	js.executeScript("arguments[0].click()", submit);
	    }
	    
	     public boolean validation() throws InterruptedException {
	    	 Thread.sleep(10000);
	    	 boolean a = thanks.isDisplayed();
	    	 return a;
	     }
	    		 
}
