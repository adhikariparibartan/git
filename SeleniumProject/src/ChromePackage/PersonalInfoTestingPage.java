package ChromePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PersonalInfoTestingPage {
	public static void personInfo() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.planetfitness.com/join/malden-ma?offer=pfx:offers:e237df8e-6181	-11eb-95d2-c2bfc616c938&Language=en");
		driver.findElement(By.name("firstName")).sendKeys("bhabna");
		driver.findElement(By.id("personal-lastName")).sendKeys("tako");
		driver.findElement(By.id("personal-email")).sendKeys("niraj_raj2009@yahoo.com");
		driver.findElement(By.name("gender")).sendKeys("male");
		driver.findElement(By.id("personal-address1")).sendKeys("1812 Rio costilla Rd");
		driver.findElement(By.name("phone")).click();
		driver.findElement(By.name("phone")).sendKeys("(781)526-4527");
		driver.findElement(By.id("personal-birthDate")).click();
		driver.findElement(By.id("personal-birthDate")).sendKeys("01/12/1993");
		driver.findElement(By.id("personal-zipcode")).sendKeys("76131");
	}

}
