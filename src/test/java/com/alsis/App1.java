package com.alsis;

import org.testng.annotations.Test;

import com.alsis.testbase.TestBase;
import com.alsis.util.ExtentLogsReport;

public class App1 extends TestBase {
	@Test
	public void m2(){
		System.out.println(driver.getCurrentUrl());
		ExtentLogsReport.pass(test1, driver.getCurrentUrl());
	}

}
