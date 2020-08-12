package com.alsis.util;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ExtentLogsReport {
	
	

	public static void IExtentResult(ThreadLocal<ExtentTest> test, Object Actual, Object Expexted, String PassMessage,
			String FailMessage, String SkipMessage, WebDriver driver,String PassScrnshot,String FailScrnshot) {
		
		
		
		if (Actual.equals(Expexted)) {
			
			test.get().log(Status.PASS, PassMessage);
			if(PassScrnshot.equals("YES")) {
			ScreenShot.extentScreenshot(driver,test, "ScreenShot for Passed test", Status.PASS);
			}
			
		} else if (!(Actual.equals(Expexted))) {
			try {
				
				test.get().log(Status.FAIL, FailMessage);
				Markup m = MarkupHelper.createLabel(FailMessage, ExtentColor.RED);
				test.get().log(Status.FAIL, m);
				Assert.assertEquals(Actual, Expexted);
				
				
			} catch (Throwable e) {
				test.get().log(Status.FAIL, e.fillInStackTrace());
				
			}
			if(FailScrnshot.equals("YES")) {
				ScreenShot.extentScreenshot(driver,test, "ScreenShot for Failed test", Status.FAIL);
			}
			
		} else {
			test.get().log(Status.SKIP, SkipMessage);
			
		}
		}
		

	

	public static void IExtentResult(ThreadLocal<ExtentTest> test, boolean condition, String PassMessage,
			String FailMessage, String SkipMessage, WebDriver driver,String PassScrnshot,String FailScrnshot) {

		if (condition== true) {
			
			
		  test.get().log(Status.PASS, PassMessage);
			if(PassScrnshot.equals("YES")) {
				ScreenShot.extentScreenshot(driver,test, "ScreenShot for Passed test", Status.PASS);
				}		
		} 
		else if (condition==false) {
            
			try {
				
				test.get().log(Status.FAIL, FailMessage);
				Assert.assertTrue(condition);
			}
			catch(Throwable e) {
				
				test.get().log(Status.FAIL, e.fillInStackTrace());
			}
			if(FailScrnshot.equals("YES")) {
				ScreenShot.extentScreenshot(driver,test, "ScreenShot for Failed test", Status.FAIL);
			}
		
		}else {
			test.get().log(Status.SKIP, SkipMessage);
		}
	
}

	public static void info(ThreadLocal<ExtentTest> test, String message) {
		test.get().log(Status.INFO, message);
		// test.info(message);
	}

	public static void pass(ThreadLocal<ExtentTest> test, String message) {
		test.get().log(Status.PASS, message);
	}

	public static void fail(ThreadLocal<ExtentTest> test, String message) {
		test.get().log(Status.FAIL, message);
	}

	public static void skip(ThreadLocal<ExtentTest> test, String message) {
		test.get().log(Status.SKIP, message);
	}




	
}
