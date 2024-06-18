package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TEstSelenium {

	WebDriver driver;
	long startTime;
	long endTime;

	@BeforeSuite
	public void startUp() {
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasanth\\eclipse-workspace1\\testng\\driver1\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Test	
	public void openGoogle() {
		driver.get("https://www.google.co.in/");
	}


	@Test	
	public void openBing() {
		driver.get("https://www.bing.com/");
	}


	@Test	
	public void openYahoo() {
		driver.get("https://in.search.yahoo.com/?fr2=inr");

	}
	@AfterSuite
	public void quit() {
		driver.quit();
		System.out.println("done");
		endTime = System.currentTimeMillis();
		long totalTime= endTime-startTime;
		System.out.println(totalTime);


	}}
