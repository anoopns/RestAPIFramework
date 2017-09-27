package com.guitest.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {

	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
	
	public static WebDriver getBrowser(String sBrowserName)
	{
		WebDriver driver = null;
		switch (sBrowserName.toLowerCase()) {
		case "chrome":
			driver = drivers.get("chrome");
			if(driver == null)
			{
				System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
				driver = new ChromeDriver();
				drivers.put("chrome", driver);
			}
			break;
		case "firefox":
			driver = drivers.get("firefox");
			if(driver == null)
			{
				System.setProperty("webdriver.gecko.driver", "resources//geckodriver.exe");
				driver = new FirefoxDriver();;
				drivers.put("firefox", driver);
			}
			break;

		default:
			break;
		}
		return driver;
	}
}

