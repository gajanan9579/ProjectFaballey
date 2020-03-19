package com.alsis;

import org.testng.annotations.Test;

import com.alsis.testbase.TestBase;

public class App extends TestBase {
	@Test
	public void m1(){
		System.out.println("Hell World");
		System.out.println(driver.getTitle());
	}

}
