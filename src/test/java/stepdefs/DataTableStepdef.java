package stepdefs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import context.TestBase;
import context.TestContextUI;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class DataTableStepdef extends TestBase{
	TestContextUI testContextUI;
	Scenario scn;
	
 public DataTableStepdef(TestContextUI testContextUI) {
	 this.testContextUI = testContextUI;

 }
	@Given("User open browser {string}")
	public void user_open_browser(String url) {
		 
		WebDriver driver=new ChromeDriver();
	    testContextUI.setDriver(driver);
	    testContextUI.initializePageObjectClasses(driver, scn);
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 		
	}
	@When("User enter validate details")
	public void user_enter_validate_details(DataTable dataTable) {
	   testContextUI.getDataTablePageobject().Registration();
	   List<String> list=dataTable.asList(String.class);
	   testContextUI.getDataTablePageobject().EnterName(list.get(1),list.get(3));
	   testContextUI.getDataTablePageobject().EmailPass(list.get(5),list.get(7));
	   
	   testContextUI.getDataTablePageobject().DateOfBirth();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		testContextUI.getDataTablePageobject().CheckTitle();
	    
	}

	
}
