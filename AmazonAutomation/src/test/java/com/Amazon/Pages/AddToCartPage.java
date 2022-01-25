package com.Amazon.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Amazon.CommonUtils.Base;

public class AddToCartPage extends Base {
	
	
	public AddToCartPage selectQty() throws InterruptedException {
		
		WebElement qty = driver.findElement(By.xpath("//*[@id='quantity']"));
		Select se = new Select(qty);
		se.selectByIndex(2);
		Thread.sleep(2000);
		return this;
	}
	
	public AddToCartPage addToCart() throws InterruptedException {
		WebElement addcart = driver.findElement(By.xpath("//*[@id='add-to-cart-button']"));
		addcart.click();
		Thread.sleep(2000);
		return this;
	}
	
	public AddToCartPage protectionPlan() {
		driver.findElement(By.xpath("//*[@id=\"attachSiNoCoverage\"]/span/input")).click();
		return this;
	}

}
