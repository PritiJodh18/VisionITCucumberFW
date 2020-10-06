package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

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
private By SearchCheck=By.xpath("//span[@class='a-color-state a-text-bold']");
private By ClickProduct=By.xpath("//img[@class='s-image']");
private By ProductTitle=By.xpath("//span[@id='priceblock_ourprice']");
private By ProductPrice=By.xpath("//span[@id='priceblock_ourprice']");
private By Availability=By.xpath("//div[@id='availability_feature_div']");

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
  String actual= getText(SearchCheck);
  Assert.assertEquals("\"Laptop\"",actual);
  logger.info("Search page is Display sucessfully: "+actual);
}
public void ProductClick() {
	clickElement(ClickProduct);
    logger.info("Clicked on product");
}
public void CheckProductDiscription() {
	
	Set<String> window=getDriver().getWindowHandles();
	Iterator<String> it=window.iterator();
	String parwin =it.next();
	String childwin=it.next();
	getDriver().switchTo().window(childwin);
	
	String title= getText(ProductTitle);
    logger.info("Title is: "+title);
    if(title.contains("Earphones"))
    logger.info("Product is Earphones: "+title);
	
	String prize=getText(ProductPrice);
	logger.info("product prize is: "+prize);
   
	String available =getText(Availability);
	logger.info("Product Available/in stock"+available);
	
   getDriver().close();
    }  

}

