package com.guitest.utility;
/**
 * TestBase class - Parent class for all test case class.
 * Selection of browser, supply of url, Setup and teardown will happen here
 * 
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.guitest.utility.BrowserFactory;

public class TestBase {

	protected static WebDriver driver = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = BrowserFactory.getBrowser("chrome");
		driver.navigate().to("https://www.expedia.com.au/");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
}
