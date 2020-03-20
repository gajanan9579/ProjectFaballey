package com.alsis;

import org.testng.annotations.Test;

import com.alsis.testbase.TestBase;

public class App2 extends TestBase{
	
	@Test
	public void m3(){
		System.out.println(driver.getTitle());
	}

}
