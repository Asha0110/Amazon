package com.Amazon.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Amazon.CommonUtils.Base;

public class HomePage extends Base {

	public HomePage searchField() throws InterruptedException {
		WebElement search = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		search.click();
		search.sendKeys("electronic");
		Thread.sleep(3000);
		return this;
	}

	public HomePage clickOnSearchField() {
		WebElement searchBtn = driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
		searchBtn.click();
		return this;
	}

	public HomePage clickOnBose() throws InterruptedException {
		//WebElement Bose = driver.findElement(By.xpath("//*[@id=\"p_89/Bose\"]/span/a/div/label/input"));
		WebElement Bose = driver.findElement(By.xpath("//*[@id=\"p_89/Bose\"]/span/a/span"));
		Thread.sleep(3000);
		Bose.click();
		return this;
	}
	
	public HomePage selectHeadPhone() {
		WebElement bosHeadPhone = driver.findElement(By.xpath("//*[contains(text(),'New Bose QuietComfort 45 Bluetooth Wireless Noise Cancelling Headphones - White Smoke')]"));
		bosHeadPhone.click();
		return this;
	}

}
