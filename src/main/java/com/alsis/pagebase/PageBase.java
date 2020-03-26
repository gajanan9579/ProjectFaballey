package com.alsis.pagebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.alsis.base.Base;
import com.aventstack.extentreports.ExtentTest;


public class PageBase extends Base {

	public  WebDriver driver;
	public ThreadLocal<ExtentTest> test;

	public PageBase(WebDriver driver,ThreadLocal<ExtentTest> test) {
			this.driver=driver;
			this.test=test;
			PageFactory.initElements(driver, this);
	}
}
