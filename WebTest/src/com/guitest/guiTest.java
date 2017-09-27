package com.guitest;

import static org.testng.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.guitest.utility.BrowserFactory;
import com.guitest.utility.TestBase;



public class guiTest extends TestBase{
	
  @Test
  public void flightBooking() {
	  
	  
	  assertEquals(driver.getTitle(), "Travel: Cheap Flights, Hotels, Packages & Car Hire | Expedia.com.au", "Checking title of landing page");
	  
	  driver.findElement(By.id("package-origin-hp-package")).sendKeys("Kochi, India (COK-Cochin Intl.)");
	  driver.findElement(By.id("package-destination-hp-package")).sendKeys("Sydney, New South Wales, Australia");
	  
	  
	  
	  driver.findElement(By.id("package-departing-hp-package")).sendKeys("01/10/2017");
	  driver.findElement(By.id("package-returning-hp-package")).sendKeys("15/10/2017");
	  
	  driver.findElement(By.id("search-button-hp-package")).click();
	  
	    
	  
 	  
	  
  }

	@BeforeTest
	public static void setUpBeforeClass() throws Exception {
		driver = BrowserFactory.getBrowser("chrome");
		driver.navigate().to("https://www.expedia.com.au/");

	}

	@AfterTest
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

}
