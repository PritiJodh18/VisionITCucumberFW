package context;

import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import pageobjects.*;

public class TestContextUI {

	private WebDriver driver;
	private SearchPageObject searchPageObjects;
	private DataTablePageobject dataTablePageobject;	
	public DataTablePageobject getDataTablePageobject() {
		return dataTablePageobject;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public SearchPageObject getSearchPageObjects() {
		return searchPageObjects;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void initializePageObjectClasses(WebDriver driver,Scenario scn) {
	searchPageObjects = new SearchPageObject(driver, scn);
	dataTablePageobject=new DataTablePageobject(driver,scn);
	}
	
}
