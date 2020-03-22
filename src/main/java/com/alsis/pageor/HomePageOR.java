package com.alsis.pageor;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.alsis.pagebase.PageBase;
import com.aventstack.extentreports.ExtentTest;

public class HomePageOR extends PageBase {

	public HomePageOR(WebDriver driver, ExtentTest test) {
		super(driver, test);

	}

	@FindBy(xpath = "//div[@style='width:38%;padding-right:40px']")
	public WebElement headofficeaddress;

	@FindBy(xpath = "//div[@class='ftrtnBox']")
	public WebElement returnadd;
	
	@FindAll({ @FindBy(xpath = "//div[@class='menuCntr']/ul/li[@class]")})
	public List<WebElement>weblist;

}
