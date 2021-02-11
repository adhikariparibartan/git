package CucumberFramework.steps;

import org.openqa.selenium.By;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CustomerEntryFrmStep2 { // this is class
private WebDriverCalling niraj; // Class Name calling (WebDriverCalling) any variable name

	public CustomerEntryFrmStep2(WebDriverCalling niraj) {
		this.niraj = niraj;
	}

	// New Scenario for Data Entry Url
	@Given("^open \"([^\"]*)\" data_entry$")
	public void open_data_entry(String DataEntryUrl) {
		niraj.driver.get(DataEntryUrl);

	}

	// Enter the name
	@And("^enter name \"([^\"]*)\" name$")
	public void enter_name_name(String custName) {
		niraj.driver.findElement(By.name("name")).sendKeys(custName);

	}

	// for date
	@Given("^enter date \"([^\"]*)\"date$")
	public void enter_date_date(String Custdate) {
		niraj.driver.findElement(By.name("dob")).sendKeys(Custdate);

	}

	// for address
	@Given("^enter address \"([^\"]*)\" Address$")
	public void enter_address_Address(String CustAddress) {
		niraj.driver.findElement(By.name("addr")).sendKeys(CustAddress);

	}

	// city
	@Given("^enter city \"([^\"]*)\" city$")
	public void enter_city_city(String CustCity) {
		niraj.driver.findElement(By.name("city")).sendKeys(CustCity);
	}

	// state
	@Given("^enter state \"([^\"]*)\" state$")
	public void enter_state_state(String CustState) {
		niraj.driver.findElement(By.name("state")).sendKeys(CustState);
	}

	// pin
	@And("^pin \"([^\"]*)\" pin$")
	public void pin_pin(String CustPin) {
		niraj.driver.findElement(By.name("pinno")).sendKeys(CustPin);
	}

	// mobile no
	@And("^mobileno \"([^\"]*)\" mobileNo$")
	public void mobileno_mobileNo(String CustMobile) {
		niraj.driver.findElement(By.name("telephoneno")).sendKeys(CustMobile);
	}

	// email
	@And("^email \"([^\"]*)\" email$")
	public void email_email(String CustEmail) throws Throwable {
		niraj.driver.findElement(By.name("emailid")).sendKeys(CustEmail);
	}

	// NewPassword
	@And("^enter password \"([^\"]*)\" pass$")
	public void enter_password_pass(String CustPassword) {
		niraj.driver.findElement(By.name("password")).sendKeys(CustPassword);

	}

	@Then("^click loginbutton for custEntry$")
	public void click_loginbutton_for_custEntry() {
		niraj.driver.findElement(By.name("sub")).click();

	}
}
