package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import cucumber.api.Scenario;
import util.Interact;

public class SearchPageObject extends Interact{

private static final Logger logger = LogManager.getLogger(SearchPageObject.class);
	
Scenario scn;
	
private By AmazonLogo=By.xpath("//a[@class='nav-logo-link']");
private By Search = By.xpath("//input[@type='text']");
private By Click=By.xpath("//input[@value='Go']");
	
public SearchPageObject (WebDriver driver, Scenario scn)
{
this.setDriver(driver);
this.scn=scn;
}
public void CheckTitleOfHOmePage() {
	String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
    String actual =getDriver().getTitle();
    Assert.assertEquals("Page Title validation",expected,actual);
    logger.info("Clicked on Search Button");
}
    public void CheckAmazonLogo() {
	boolean HomeLogo=getDriver().findElement(AmazonLogo).isDisplayed();
	if(!HomeLogo) {
	scn.write("Amazon logo is Present"+HomeLogo);
	System.out.println("present");}
    else {
    logger.info("Amazon page is not present");
    	}
}
public void SerchForProduct(String Product) {
	setElement(Search, Product);
	logger.info("Clicked on Search Button");
}
public void ClickOnIcon() {
	clickElement(Click);
	logger.info("Clicked on Search Button");
}
public void CheckResultPage() {
	
}
}

