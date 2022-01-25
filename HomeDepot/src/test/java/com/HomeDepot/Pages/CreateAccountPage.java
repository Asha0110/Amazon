package com.HomeDepot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.HomeDepot.CommonUtils.Base;

public class CreateAccountPage extends Base{
	
	public CreateAccountPage selectPersonalAccount() {
		WebElement selectcont = driver.findElement(By.xpath("(//*[text()='Select & Continue'])[1]"));
		selectcont.click();
		return this;
	}
	
	}
