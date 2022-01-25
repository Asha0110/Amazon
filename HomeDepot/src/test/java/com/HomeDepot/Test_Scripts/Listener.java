package com.HomeDepot.Test_Scripts;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.HomeDepot.CommonUtils.Base;

public class Listener extends Base implements ITestListener {
	

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			ut.takeScreenShot("Passed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			ut.takeScreenShot("Failed");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("test failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
	}

	

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test failed with timeout ");
	}

	

	

}
