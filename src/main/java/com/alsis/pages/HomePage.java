package com.alsis.pages;

import org.openqa.selenium.WebDriver;

import com.alsis.pageor.HomePageOR;
import com.aventstack.extentreports.ExtentTest;

public class HomePage extends HomePageOR {

	public HomePage(WebDriver driver, ThreadLocal<ExtentTest> test) {
		super(driver, test);

	}

}
