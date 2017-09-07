
package com.argos.project.Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class TelevisionAndAccessoriesPage extends WebElementActions {
	
 
	By televisions_link=By.xpath("//a[contains(text(),'Televisions')]");
	
	public TelevisionAndAccessoriesPage(){
		super(driver);
		
	}

	public ArrayList getsubPageCount()  {
				
		System.out.println("it is a televisionaccessories page;we are getting subpages");
			
		return null;
		
	}
	
	public TelevisionProductsPage navigateToTelevisionProductsPage(){
		System.out.println("navigating to television products page");
		 click( televisions_link);
		return new TelevisionProductsPage(); 
	}
}
