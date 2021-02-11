package CucumberFramework.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Working {
	WebDriverCalling niraj;

	Working(WebDriverCalling niraj) {
		this.niraj = niraj;

	}

	WebElement shyam = niraj.driver.findElement(By.name("uid"));

	// for Password
	@Given("^add password \"([^\"]*)\"$")
	public void add_password(String userpassword) {
		niraj.driver.findElement(By.name("password")).sendKeys(userpassword);

	}

}
 