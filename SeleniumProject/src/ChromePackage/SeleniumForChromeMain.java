package ChromePackage;

public class SeleniumForChromeMain {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workselenium\\chromedriver.exe");
		
		PersonalInfoTestingPage.personInfo();
		
		

	}

}
