package com.argos.project.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementActions {
	public static WebDriver driver;

	public WebElementActions(WebDriver driver) {
		this.driver = driver;
	}

	// textbox handling
	public void setText(By by, String text) {
		driver.findElement(by).sendKeys(text);
	}

	public void clickSubMenu(By mainMenu, By subMenu) {
		Actions actions = new Actions(driver);
		WebElement menuHoverLink = driver.findElement(mainMenu);
		//actions.moveToElement(menuHoverLink).perform();
		actions.moveToElement(menuHoverLink).build().perform();
		driver.findElement(subMenu).click();
	}

	// click functionality
	public void click(By by) {
		driver.findElement(by).click();
	}

	public static void setDriver(WebDriver driver) {
		WebElementActions.setDriver(driver);
	}
	
	public int findandCountElement(By by){
		
		List<WebElement> elementslist=driver.findElements(by);
		return elementslist.size();
 	}
}
