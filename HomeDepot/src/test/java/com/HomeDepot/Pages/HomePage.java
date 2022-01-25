package com.HomeDepot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.HomeDepot.CommonUtils.Base;

public class HomePage extends Base {

	public HomePage clickOnMyAccountBtn() {
		WebElement myAccount = driver.findElement(By.xpath("(//*[text()='My Account'])[1]"));
		myAccount.click();
		return this;
	}

	public void clickOnRegister() {
		WebElement register = driver.findElement(By.xpath("//*[text()='Register']"));
		register.click();
	}

	

}