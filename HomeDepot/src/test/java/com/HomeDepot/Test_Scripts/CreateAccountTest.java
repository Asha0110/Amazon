package com.HomeDepot.Test_Scripts;

import org.testng.annotations.Test;

import com.HomeDepot.CommonUtils.Base;
import com.HomeDepot.Pages.CreateAccountPage;
import com.HomeDepot.Pages.HomePage;
import com.HomeDepot.Pages.SignUpPage;

public class CreateAccountTest extends Base{
	HomePage hp;
	CreateAccountPage cp; 
	SignUpPage sp;
	
@Test	
public void createAcct() throws InterruptedException {
	hp = new HomePage();
	hp.clickOnMyAccountBtn();
	hp.clickOnRegister();
	cp= new CreateAccountPage();
	ut.scrollDownByPixel();
	cp.selectPersonalAccount();
	sp = new SignUpPage();
	sp.sendEmail();
	sp.sendPassWord();
	sp.sendZipCode();
	sp.sendPhone();
	ut.scrollDownByPixel();
	//sp.ckBox();
	sp.clickOnCreateAcct();
	
}
	
	
	
	
	

}
