package yatraProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import testBase.BaseClass;
import testBase.ExcelLibrary;

public class selectPlace extends BaseClass{
	public ExcelLibrary xlib;
	public Actions act;
	
  @Test
  public void place() throws InterruptedException {
	  xlib=new ExcelLibrary();
	  act=new Actions(driver);
	  String from=xlib.getExcelData("from_place", 1, 0);
	  String to=xlib.getExcelData("to_place", 1, 0);


	  Thread.sleep(1000);
	  driver.findElement(By.name("flight_origin")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("BE_flight_origin_city")).sendKeys(from);
	  WebElement from_box= driver.findElement(By.xpath("//li[@class='active ac_over']"));
	  act.moveToElement(from_box).click().perform();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("BE_flight_arrival_city")).sendKeys(to);
	  Thread.sleep(1000);
	  WebElement to_box= driver.findElement(By.xpath("//li[@class='active ac_over']"));
	  act.moveToElement(to_box).click().perform();
	  Thread.sleep(1000);
	  
	  search.searchButton(driver);
	  search.selectDate(driver);
	  driver.findElement(By.xpath("//td[contains(@title,'30 June 2021')]")).click();
	  Thread.sleep(1000);
	  search.searchButton(driver);


  }
}

