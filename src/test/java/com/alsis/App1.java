package com.alsis;

import org.testng.annotations.Test;

import com.alsis.testbase.TestBase;

public class App1 extends TestBase {
	@Test
	public void m2(){
		System.out.println(driver.getCurrentUrl());
	}

}
