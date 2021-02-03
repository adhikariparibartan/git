package FirefoxPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumForFirefox {

	public static void main(String[] args) {
		System.setProperty ("webdriver.gecko.driver", "D:\\workselenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");

	}

}
