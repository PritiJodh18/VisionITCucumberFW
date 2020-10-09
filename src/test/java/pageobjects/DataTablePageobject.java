package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Scenario;
import util.Interact;

public class DataTablePageobject extends Interact {
WebDriver driver;
Scenario scn;

private static final Logger logger = LogManager.getLogger(SearchPageObject.class);

private By Registrationform=By.xpath("//a[@data-testid='open-registration-form-button']");
private By FirstName=By.xpath("//input[@name='firstname']");
private By LastName = By.xpath("//input[@name='lastname']");
private By Email=By.xpath("//input[@name='reg_email__']");
private By Password=By.xpath("//input[@name='reg_passwd__']");
private By Day=By.xpath("//select[@name='birthday_day']");
private By Month=By.xpath("//select[@name='birthday_month']");
private By Year=By.xpath("//select[@name='birthday_year']");
private By Gender=By.xpath("//input[@id='u_8_4']");
private By SignUp=By.xpath("//button[@name='websubmit']");

 public DataTablePageobject(WebDriver driver, Scenario scn) {
	 this.setDriver(driver);
	 this.scn=scn;
}
 public void Registration() {
	 clickElement(Registrationform);
 }
 public void EnterName(String name,String surname) {
	 setElement(FirstName, name);
	 setElement(LastName, surname);
 }
 public void  EmailPass(String email,String pass) {
	 setElement(Email, email);
	 setElement(Password, pass);
 }
 public void DateOfBirth() {
	 Select date = new Select(getDriver().findElement(Day));  
	 date.selectByValue("18");
	 Select month = new Select(getDriver().findElement(Month));  
     month.selectByValue("10");
	 Select year = new Select(getDriver().findElement(Year)); 
	 year.selectByValue("1995");
	 }
 public void Gender() {
	 clickElement(Gender);
 }
 public void SignIn() {
	 clickElement(SignUp);
 }
 public void CheckTitle() {
	 String FbTitle="";
	 String title=getDriver().getTitle();
	 if(title.equalsIgnoreCase(FbTitle)) {
		 logger.info("Login sucessfully");
	 }
	 else {
		 logger.info("U enter invalide info");
	 }
 }
 
}

