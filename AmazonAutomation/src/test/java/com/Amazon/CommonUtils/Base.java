package com.Amazon.CommonUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;





public class Base {
	public static WebDriver driver;
	public static Utils ut;
	public static Properties pro;
	String websiteUrl;
	
	@BeforeMethod
	public void setUp() {
		ut = new Utils(driver);
		driver = ut.startBrowser("Chrome");
		driver.get(websiteUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() {
		try {
			if (driver != null) {
				driver.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeClass
	public void beforeClass() throws IOException {
		String path = "src/test/resources/config.properties";
		FileInputStream input = new FileInputStream(path);
		 pro = new Properties();
		 pro.load(input);
		websiteUrl =  pro.getProperty("Url");
		}
	
	@AfterClass
	public void afterClass() {
		try {
			if(driver!=null) {
				driver.quit();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
