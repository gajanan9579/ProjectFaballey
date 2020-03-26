package com.alsis;

import org.testng.annotations.Test;

import com.alsis.testbase.TestBase;
import com.alsis.util.ExtentLogsReport;

public class App extends TestBase {
	@Test
	public void m1(){
		ExtentLogsReport.info(test1, "Hell World");
		ExtentLogsReport.pass(test1, driver.getTitle());
		System.out.println("Hell World");
		System.out.println(driver.getTitle());
	}

}
