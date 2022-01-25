package com.HomeDepot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.HomeDepot.CommonUtils.Base;

public class SignUpPage extends Base{
	
	
	public SignUpPage sendEmail() {
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("abc12@gmail.com");
		return this;
	}
	

	public SignUpPage sendPassWord() throws InterruptedException {
		WebElement passw = driver.findElement(By.xpath("//*[@id=\"password-input-field\"]"));
		String passwod = pro.getProperty("password");
		passw.sendKeys(passwod);
		Thread.sleep(5000);
		
		return this;
	}
	public SignUpPage sendZipCode() {
		WebElement zip = driver.findElement(By.xpath("//*[@id=\"zipCode\"]"));
		zip.sendKeys("03302");
		return this;
	}
	public SignUpPage sendPhone() throws InterruptedException {
		WebElement phone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
		phone.sendKeys("6031234325");
		Thread.sleep(2000);
		return this;
	}
	
	public SignUpPage ckBox() {
		WebElement ckBx = driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));
		ckBx.click();
		return this;
	}
	
	public SignUpPage clickOnCreateAcct() {
		WebElement createAccount = driver.findElement(By.xpath("(//*[text()='Create an Account'])[2]"));
		createAccount.click();
		return this;
	}

}
