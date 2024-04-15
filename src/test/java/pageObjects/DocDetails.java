package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DocDetails extends BasePage {
 
	public DocDetails(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[@class='pure-u-20-24']")
	List<WebElement> info;
	
	public List<String> docList() {
		List<String> doc = new ArrayList<String>();
				for(WebElement a : info) {
					doc.add(a.getText());
					
				}
		return doc;
	}
}
