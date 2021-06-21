package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageClass.Flight;

public class BaseClass {
	public WebDriver driver;
	public Flight search;
	public ExcelLibrary xlib;

	@BeforeClass
	public void openBrowser() {
	    search=new Flight();
	    xlib=new ExcelLibrary();
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
