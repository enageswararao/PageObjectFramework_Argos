package com.argos.project.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.argos.project.Pages.HomePage;
import com.argos.project.Pages.TelevisionAndAccessoriesPage;
import com.argos.project.Pages.TelevisionProductsPage;

 
public class TelevisionProductTestCase extends TestBase {

	public WebDriver driver;
	
	@BeforeTest
	public void initiateDriver()  {
		System.out.println("initialising a browser");
		TestBase tb = new TestBase();
		driver=tb.getDriver("chrome");
		tb.loadingUrl("www.argos.co.uk/");
	}
	
	@AfterTest
	public void closeDriver()  {
		System.out.println("closing the browser");
	}
	
	@Test(description="verify the no of product in built-in- wifi after selecting option ")
	public void Tc_01_televisionProductTestCase_verify_built_in_wifi_product() throws InterruptedException{
		HomePage homepage = new HomePage(driver);
		TelevisionAndAccessoriesPage tvAccessPage = homepage.clickOnLinkTelevisionAndAccessories();
		TelevisionProductsPage tvpage = tvAccessPage.navigateToTelevisionProductsPage();
		Thread.sleep(5000);
		tvpage.byInternetConnection();
		 
		Thread.sleep(5000);
		tvpage.clickOnShowAllBtn();
		Thread.sleep(5000);
		int countofproducts=tvpage.getAllProductCount();
		Assert.assertEquals(countofproducts, 63);
		 
	}
	 
	@Test(description="verify the no of product in LED after selecting option in the By Screen type")
	public void Tc_01_televisionProductTestCase1() throws InterruptedException{
		HomePage homepage = new HomePage(driver);
		TelevisionAndAccessoriesPage tvAccessPage = homepage.clickOnLinkTelevisionAndAccessories();
		TelevisionProductsPage tvpage = tvAccessPage.navigateToTelevisionProductsPage();
		Thread.sleep(5000);		
		tvpage.byScreenType();
		Thread.sleep(5000);
		tvpage.clickOnShowAllBtn();
		Thread.sleep(5000);
		tvpage.getAllProductCount();
		Thread.sleep(5000);
		int countofproducts=tvpage.getAllProductCount();
		Assert.assertEquals(countofproducts, 131);
	}
	 
	
}
