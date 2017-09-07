package com.argos.project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends WebElementActions {	
			
	By Technology_lnk = By.xpath("//div[contains(@class,'meganav--desktop')]//a[text()='Technology']");
	By TelevisionAndAccessories_lnk = By.xpath("//a[text()='Televisions & accessories']");
	
	
    public HomePage(WebDriver driver) {
		 super(driver);
		
	}

    public TelevisionAndAccessoriesPage clickOnLinkTelevisionAndAccessories()  {
		
    	clickSubMenu(Technology_lnk, TelevisionAndAccessories_lnk);
		System.out.println("it is a homepage action to navigate to technology");
		
		return new TelevisionAndAccessoriesPage();
			}
	
	

}
