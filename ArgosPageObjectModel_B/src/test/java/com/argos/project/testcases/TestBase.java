package com.argos.project.testcases;

import java.util.concurrent.TimeUnit;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
 
public class TestBase {

	public WebDriver driver;

	public WebDriver getDriver(String browserName) {

		if ("chrome".equalsIgnoreCase(browserName)) {
			System.out.println("user.dir"+System.getProperty("user.dir"));

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/driverexe/chromedriver.exe");
			driver = new ChromeDriver();
		} else if ("firefox".equalsIgnoreCase(browserName)) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/binaries/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if ("ie".equalsIgnoreCase(browserName)) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/binaries/IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	public void loadingUrl(String url) {
		/*
		 * driver = getDriver(Utilities.getValue("browser"));
		 * WebElementActions.setDriver(driver);
		 */
		driver.get("http://www.argos.co.uk/");
	}

	public void closeBrowser() {
		driver.close();
	}

}
