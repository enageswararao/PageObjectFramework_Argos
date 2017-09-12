package com.argos.project.Pages;

import org.openqa.selenium.By;

public class TelevisionProductsPage extends WebElementActions {
	
	By clearall=By.id("refineform-reset");
	By allProductTiltecount=By.xpath("//dt[@class='title']");
	//By Internet connection- filter
	//By built_in_wifi_filter = By.xpath("//input[contains(@value,'Built-in WiFi')]");
	By built_in_wifi_filter = By.xpath("//div[@id='Internet connection-refinement']/div[2]/div/label[1]/span");
    By showAll=By.xpath(".//*[@id='resultsHeader']/div/div//a[text()='Show All']");
	//ScreenType
	By ledtype=By.xpath("//div[@id='Screen type-refinement']/div[2]/div/label[1]/span");
	
	By no_internet_connection_filter = By.xpath("//input[contains(@value,'No internet connection')]");
	By Ethernet_filter = By.xpath("//input[contains(@value,'Ethernet')]");
	
	//By Brands
	By lg_filter = By.xpath("//input[contains(@value,'LG')]");
	By samsung_filter = By.xpath("//input[contains(@value,'Samsung')]");
	By bush_filter = By.xpath("//input[contains(@value,'Bush')]");
	By sony_filter = By.xpath("//input[contains(@value,'Sony')])"); 
	By philips_filter = By.xpath("//input[contains(@value,'Philips')]");
	
	//By customer Rating
	By showAll_rating = By.xpath("//span[text()='Show All']/preceding-sibling::input"); 
	By star_rating_5 = By.xpath("//input[contains(@value,'5 stars')]/following-sibling::span"); 
	By star_rating_4 =By.xpath( "//input[contains(@value,'4 stars')]/following-sibling::span"); 
	By star_rating_3 = By.xpath("//input[contains(@value,'3 stars')]/following-sibling::span");
	By star_rating_2 =By.xpath( "//input[contains(@value,'2 stars')]/following-sibling::span"); 
	By star_rating_1_ormore = By.xpath("//input[contains(@value,'1 star or more')]/following-sibling::span"); 
	
	// Addto Trolley xpath
	By addtotrolley=By.xpath("//div[@id='products']/ul/li[1]/dl/dd[@class='actions']/a[@class='button btnbuyreserve addToTrolley']/span[1]");
	By successmsgaddtrolley=By.xpath("//div[@id='trolleyHeader']/div[1]/div[1]/div[1]/div[1]/div[2]");
 	public TelevisionProductsPage() {
		super(driver);	
	} 
 
public void filterSearch() {
	
	System.out.println("based on the user criteria we are able to select all the left panel items");
	
}
public void byInternetConnection(){
	//input[contains(@value,'Built-in WiFi')]
	click(built_in_wifi_filter);
}

public void byScreenType(){
	//input[contains(@value,'Built-in WiFi')]
	click(ledtype);
}

public void clearALL(){
	
	click(clearall);
}
public void verifyCountofTheItemsSelected() {

	
	System.out.println("verify count");
}
public int  getAllProductCount(){
	System.out.println("count---->"+findandCountElement(allProductTiltecount));
	
	return findandCountElement(allProductTiltecount);
}

public void clickOnShowAllBtn(){
	
	click(showAll);
}
	

public void addtoCart(){
	click(addtotrolley);
}

public String getTextOnScreen(){
	return getText(successmsgaddtrolley);
	
}
}
