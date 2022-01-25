package com.Amazon.Test_Scripts;

import org.testng.annotations.Test;

import com.Amazon.CommonUtils.Base;
import com.Amazon.CommonUtils.Utils;
import com.Amazon.Pages.AddToCartPage;
import com.Amazon.Pages.HomePage;
import com.Amazon.Pages.ProcessedToCheckOut;

public class HomePageTest extends Base{
	 HomePage hp;
	 Utils ut;
	 AddToCartPage acp;
	 ProcessedToCheckOut pc;
	
	 @Test
	public void searchTest() throws InterruptedException {
		hp = new HomePage();
		ut = new Utils(driver);
		hp.searchField();
		hp.clickOnSearchField();
		ut.scrollDownByPixel();
		hp.clickOnBose();
		hp.selectHeadPhone();
		
		acp = new AddToCartPage();
		acp.selectQty();
		acp.addToCart();
		acp.protectionPlan();
		
		pc = new ProcessedToCheckOut();
		//pc.validateItems();
		//pc.clickProceedBtn();
		
		
		
		
		
		
		
	}

}
