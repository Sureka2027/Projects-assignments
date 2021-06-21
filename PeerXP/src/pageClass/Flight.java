package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Flight {
	public Actions act;
//	public SimpleDateFormat sdf;

	public void searchButton(WebDriver driver) {
		driver.findElement(By.id("BE_flight_flsearch_btn")).click();
	}
	public void selectDate(WebDriver driver) {
		
		WebElement date= driver.findElement(By.id("BE_flight_origin_date"));
		act=new Actions(driver);
		act.moveToElement(date).perform();
		
	}
}

