package com.HomeDepot.CommonUtils;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {

	public WebDriver driver;

	public Utils(WebDriver driver) {// constructor
		this.driver = driver;
	}

	public WebDriver startBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup(); // using webdrivermanager 
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup(); //using webdriver manager for set up edge driver
			driver = new EdgeDriver();

		} else {
			System.out.println("wrong driver input");
		}
		

		return driver;
	}
	
	public void takeScreenShot(String status) throws IOException {
		Date dt = new Date();
		System.out.println("This is a Date: " + dt);
		String newDate = dt.toString().replace(" ", "_").replace(":", "_");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sourcefile, new File("./ScreenShot/" +status + newDate+ ".jpg"));
	}
	
	public void scrollDownByPixel() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
	}
	
	
	
	
	
	
	

}// ending class
