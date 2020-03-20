package com.alsis;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.alsis.pages.HomePage;
import com.alsis.testbase.TestBase;
import com.alsis.util.CompeareText;

public class HomepageTest extends TestBase {

	@Test
	public void checkHeadofficeAddress() throws InterruptedException {
     HomePage hp=new HomePage(driver, test1);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='btnNoThanks']")).click();
		Assert.assertTrue(CompeareText.compare(driver, hp.headofficeaddress,"Headofficeaddress1.txt"));

	}

	@Test
	public void checkReturnAddress() throws InterruptedException {
		 HomePage hp=new HomePage(driver, test1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btnNoThanks']")).click();

		Assert.assertTrue(CompeareText.compare(driver, hp.returnadd,"Returnadd.txt"));

	}
}
