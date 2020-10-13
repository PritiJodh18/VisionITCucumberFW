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

public class ScenarioOutlineStepdefs extends TestBase{
	TestContextUI testContextUI;
	Scenario scn;

public ScenarioOutlineStepdefs(TestContextUI testContextUI) {
	this.testContextUI = testContextUI;
}
@Given("Given User open browser {string}")
public void given_User_open_browser(String url) {
	WebDriver driver=new ChromeDriver();
    testContextUI.setDriver(driver);
    testContextUI.initializePageObjectClasses(driver, scn);
    driver.get(url);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
}
@When("User enter id {string} and pass{string} in step")
public void user_enter_id_and_pass_in_step(String name, String pass) {
  testContextUI.getScenarioOutlinePageObject().EnterId(name);
  testContextUI.getScenarioOutlinePageObject().EnterPass(pass);
}
@Then("User verify Login Page")
public void user_verify_Login_Page() {
   testContextUI.getScenarioOutlinePageObject().CheckOut();
}




	
}
