package stepdefs;

import context.TestBase;
import context.TestContextUI;
import cucumber.api.Scenario;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductDiscripStepdef extends TestBase{

	TestContextUI testContextUI;
	Scenario scn;

	public ProductDiscripStepdef(TestContextUI testContextUI) {
	this.testContextUI = testContextUI;

	}
	@When("User click on any product")
	public void user_click_on_any_product() {
	   testContextUI.getSearchPageObjects().ProductClick();
	}

	@Then("Product Description is displayed in new tab")
	public void product_Description_is_displayed_in_new_tab() {
	   testContextUI.getSearchPageObjects().CheckProductDiscription();
	}
}
