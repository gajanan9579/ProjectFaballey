package com.alsis;

import org.testng.annotations.Test;

import com.alsis.testbase.TestBase;
import com.alsis.util.ExtentLogsReport;

public class App2 extends TestBase{
	
	@Test
	public void m3(){
		System.out.println(driver.getTitle());
		ExtentLogsReport.pass(test1, driver.getTitle());
	}

}
