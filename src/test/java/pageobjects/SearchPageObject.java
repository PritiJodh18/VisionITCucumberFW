package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import util.Interact;

public class SearchPageObject extends Interact{

Scenario scn;
	
private By Search = By.xpath("//input[@type='text']");
private By Click=By.xpath("//input[@value='Go']");
	
public SearchPageObject (WebDriver driver, Scenario scn)
{
this.setDriver(driver);
this.scn=scn;
}

public void SerchForProduct(String Product) {
	setElement(Search, Product);
	
}
public void Click() {
	clickElement(Click);
}
}

