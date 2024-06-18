package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {



	@Test	
	public void openBing() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasanth\\eclipse-workspace1\\testng\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.bing.com/");
		driver.quit();
	}
	
	
	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasanth\\eclipse-workspace1\\testng\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.quit();
	}
}