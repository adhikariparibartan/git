package CucumberFramework.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepUrlStep1 {
	WebDriverCalling niraj;
	Working nirajS;

	public LoginStepUrlStep1(WebDriverCalling niraj, Working niraj1) {
		this.niraj = niraj;
		this.nirajS = niraj1;
	}

	// for usereName
	@And("^add username \"([^\"]*)\"$")
	public void add_username() {

	
		nirajS.shyam.sendKeys("ganesh");

	}

//for url
	@Given("^open \"([^\"]*)\" url$")
	public void open_url(String url) {
		niraj.driver.get(url);
	}

	// click login button
	@Then("^click loginbutton$")
	public void click_loginbutton() {
		niraj.driver.findElement(By.name("btnLogin")).click();
	}

}
