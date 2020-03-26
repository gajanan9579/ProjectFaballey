package com.alsis;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.alsis.pages.HomePage;
import com.alsis.testbase.TestBase;
import com.alsis.util.CompeareText;
import com.alsis.util.ExcelReadWrite;
import com.alsis.util.ExtentLogsReport;
import com.alsis.util.MenuUtil;
import com.alsis.util.ScreenShot;

public class HomepageTest extends TestBase {
	
	List<String> listMenuWeb;
	List<String> listMenuExcel = null;
	public HomePage hp;
	
	@BeforeMethod
	public void loadMenuForTesting() throws InterruptedException  {
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='No Thanks']")).click();
		hp=new HomePage(driver, test1);
		/*By listXpath=By.xpath("//div[@class='menuCntr']/ul/li[@class]");
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/nav/div[1]/ul/li[4]/a")).click();
		Thread.sleep(8000);
        By listXpath=By.xpath("//div[@class='ftrLink']/ul/li ");
		*/
		//System.out.println("The size of excelMenu="+listMenuExcel.size());
	}

<<<<<<< HEAD
	/*@Test
=======
	@Test(priority=4)
>>>>>>> 091526e7255df17fd2505fdc2ab425b1b7e1f157
	public void checkHeadofficeAddress() throws InterruptedException {
        
		
		
		//driver.findElement(By.xpath("//a[@class='btnNoThanks']")).click();
		Assert.assertTrue(CompeareText.compare(driver, hp.headofficeaddress,"Headofficeaddress1.txt"));

	}

	@Test(priority=5)
	public void checkReturnAddress() throws InterruptedException {
// 		Thread.sleep(3000);
// 		driver.findElement(By.xpath("//a[@class='btnNoThanks']")).click();F

		Assert.assertTrue(CompeareText.compare(driver, hp.returnadd,"Returnadd.txt"));

	}
	*/

	@Test(priority=1)
	public void testLinksCount() throws Exception {
		
<<<<<<< HEAD
		ExtentLogsReport.info(test1,"Starting testLinksCount test ");
		HomePage hp=new HomePage(driver, test1);
=======
		test1.info("Starting testLinksCount test ");
>>>>>>> 091526e7255df17fd2505fdc2ab425b1b7e1f157
		listMenuWeb=MenuUtil.getWebList(driver,hp.weblist);
		listMenuExcel =ExcelReadWrite.getExcellist("MenuList.xlsx", "MenuSheet");
		boolean condition=listMenuWeb.size()==listMenuExcel.size();
		ExtentLogsReport.IExtentResult(test1, condition, "testLinksCount test is passed", "testLinksCount test is failead", "testLinksCount test is skiped", driver, "YES", "YES");
		ScreenShot.takeScreenshot(driver, "testLinksCount");
		
		ExtentLogsReport.info(test1, "Ending testLinksCount test ");
		Assert.assertTrue(condition);
	}

	@Test(priority=2)
	public void testLinksSeq() throws Exception {
<<<<<<< HEAD
		ExtentLogsReport.info(test1,"Starting testLinksSeq test");
		HomePage hp=new HomePage(driver, test1);
=======
		test1.info("Starting testLinksSeq test");
>>>>>>> 091526e7255df17fd2505fdc2ab425b1b7e1f157
		listMenuWeb=MenuUtil.getWebList(driver,hp.weblist);
		listMenuExcel = ExcelReadWrite.getExcellist("MenuList.xlsx", "MenuSheet");
		//Assert.assertEquals(listMenuWeb,listMenuExcel);
		if(listMenuWeb.size()==listMenuExcel.size()) {
			for(int i=0;i<listMenuWeb.size();i++) {
				boolean condition=true;
				if(!(listMenuWeb.get(i).equals(listMenuExcel.get(i)))) {
					condition=false;
					break;
				}
				ExtentLogsReport.IExtentResult(test1, condition, "testLinksSeq test is passed", "testLinksSeq test is failead", "testLinksSeq test is skiped", driver, "YES", "YES");
				ExtentLogsReport.info(test1,"Ending testLinksSeq test");
				Assert.assertTrue(condition);
			}
			
			
		}else {
			ExtentLogsReport.IExtentResult(test1, false, "testLinksSeq test is passed", "testLinksSeq test is failead bcz size doesnt matched", "testLinksSeq test is skiped", driver, "YES", "YES");
			ExtentLogsReport.info(test1,"Ending testLinksSeq test");
			Assert.assertTrue(false);
		}
	}
	/*@Test(dataProvider ="Menu",priority=3)
	public void testLinkSpellings(String linkNameExcel) throws Exception {
<<<<<<< HEAD
		ExtentLogsReport.info(test1,"Starting testLinkSpellings test");
		HomePage hp=new HomePage(driver, test1);
=======
		test1.info("Starting testLinkSpellings test");
>>>>>>> 091526e7255df17fd2505fdc2ab425b1b7e1f157
		listMenuWeb=MenuUtil.getWebList(driver,hp.weblist);
		listMenuExcel = ExcelReadWrite.getExcellist("MenuList.xlsx", "MenuSheet");
		boolean condition=listMenuWeb.contains(linkNameExcel);
		ExtentLogsReport.IExtentResult(test1, condition, "testLinkSpellings test is passed", "testLinkSpellings test is failead", "testLinkSpellings test is skiped", driver, "YES", "YES");
		ExtentLogsReport.info(test1,"Ending testLinkSpellings test");
		Assert.assertTrue(condition);
	}

		@DataProvider(name = "Menu")
	public Object[][] loginData() throws IOException {
		Object[][] arrayObject =ExcelReadWrite.getData("MenuList.xlsx", "MenuSheet");
		return arrayObject;
	}*/

	
	
}
