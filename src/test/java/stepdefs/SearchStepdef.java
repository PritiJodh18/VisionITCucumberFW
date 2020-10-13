package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import context.TestBase;
import context.TestContextUI;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepdef extends TestBase
{
TestContextUI testContextUI;
Scenario scn;
WebDriver driver;

public SearchStepdef(TestContextUI testContextUI) {
this.testContextUI = testContextUI;

}
	@Given("User opened browser")
	    public void user_opened_browser() {
		WebDriver driver=new ChromeDriver();
	    testContextUI.setDriver(driver);
		testContextUI.initializePageObjectClasses(driver, scn);
		driver.get(Urlamazon);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	
	}
	@Given("User navigated to the home application url")
	public void user_navigated_to_the_home_application_url() {
		testContextUI.getSearchPageObjects().CheckTitleOfHOmePage();
		testContextUI.getSearchPageObjects().CheckAmazonLogo();
	
	}
	@When("User Search for product {string}")
	public void user_Search_for_product(String string) {
		testContextUI.getSearchPageObjects().SerchForProduct(string);
		testContextUI.getSearchPageObjects().ClickOnIcon();
	}

	@Then("Search Result page is displayed")
	public void search_Result_page_is_displayed() {
		testContextUI.getSearchPageObjects().CheckResultPage();
	    
	}


	
}
