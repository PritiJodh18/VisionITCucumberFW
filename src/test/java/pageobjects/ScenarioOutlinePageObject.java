package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import util.Interact;

public class ScenarioOutlinePageObject extends Interact {
	private static final Logger logger = LogManager.getLogger(SearchPageObject.class);
	Scenario scn;
	
	private By Id=By.xpath("//input[@id='email']");
	private By Pass=By.xpath("//input[@id='pass']");
	private By Login=By.xpath("//button[@name='login']");
		
	public ScenarioOutlinePageObject (WebDriver driver, Scenario scn)
	{
	this.setDriver(driver);
	this.scn=scn;
	}
	public void EnterId(String name) {
		setElement(Id, name);
	}
	public void EnterPass(String pass) {
		setElement(Pass,pass);
	}
	public void CheckOut() {
		clickElement(Login);
	}
}
