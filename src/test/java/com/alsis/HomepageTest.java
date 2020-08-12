package com.alsis;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
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
	//public HomePage hp;
	
	@BeforeMethod
	public void loadMenuForTesting() throws InterruptedException  {
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='No Thanks']")).click();
	//	hp=new HomePage(driver, test1);
		/*By listXpath=By.xpath("//div[@class='menuCntr']/ul/li[@class]");
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/nav/div[1]/ul/li[4]/a")).click();
		Thread.sleep(8000);
        By listXpath=By.xpath("//div[@class='ftrLink']/ul/li ");
		*/
		//System.out.println("The size of excelMenu="+listMenuExcel.size());
	}



	/*@Test(priority=4)

	public void checkHeadofficeAddress()  {
        
		ExtentLogsReport.info(test1, "Starting checkHeadofficeAddress method");
		ExtentLogsReport.IExtentResult(test1, hp.headOfficeAdress(), "checkHeadofficeAddress method is passed", "checkHeadofficeAddress method is failed", "checkHeadofficeAddress method is skipped", driver, "YES", "YES");
		ExtentLogsReport.info(test1, "TestCase get ended");
		
		Assert.assertTrue(hp.headOfficeAdress());

	}*/

	/*@Test(priority=5)
	public void checkReturnAddress()  {
		ExtentLogsReport.info(test1, "Starting chechReturnAdress method");
		ExtentLogsReport.IExtentResult(test1, hp.returnadress(), "checkReturnAddress method is passed", "checkReturnAddress method is failed", "checkReturnAddress method is skipped", driver, "YES", "YES");
		ExtentLogsReport.info(test1, "TestCase get ended");
		Assert.assertTrue(hp.returnadress());

	}
	  

	@Test(priority=1)
	public void testLinksCount() throws Exception  {
		
		ExtentLogsReport.info(test1,"Starting testLinksCount test ");
		ExtentLogsReport.info(test1,"Actual size is " +listMenuWeb.size());
		ExtentLogsReport.IExtentResult(test1, hp.countLinks(), "testLinksCount test is passed","testLinksCount test is failead","testLinksCount test is skiped", driver,"YES","YES");
		ExtentLogsReport.info(test1, "Ending testLinksCount test ");
		
		Assert.assertTrue(hp.countLinks());
		
		
	}*/

	/*@Test//(priority=2)
	public void testLinksSeq()  {
		
		ExtentLogsReport.info(test1,"Starting testLinksSeq test ");
		ExtentLogsReport.IExtentResult(test1, hp.linkSeq(), "testLinksSeq test is passed", "testLinksSeq test is failed",
				"testLinksSeq test is skiped", driver,"YES","YES");
		ExtentLogsReport.info(test1, "Ending testLinksSeq test ");
		Assert.assertTrue(hp.linkSeq());
      }
	
	@Test(dataProvider ="Menu",priority=3)
	public void testLinkSpellings(String linkNameExcel) throws Exception {

		ExtentLogsReport.info(test1,"Starting testLinkSpellings test");
		ExtentLogsReport.info(test1,"Spelling  " +linkNameExcel);
		ExtentLogsReport.IExtentResult(test1, hp.MenuSpellingCheck(linkNameExcel), "testLinkSpellings test is passed", "testLinkSpellings test is failead",
				"testLinkSpellings test is skiped", driver, "YES", "YES");
		ExtentLogsReport.info(test1,"Ending testLinkSpellings test");
		
		Assert.assertTrue(hp.MenuSpellingCheck(linkNameExcel));
	}

		@DataProvider(name = "Menu")
	public Object[][] loginData() throws IOException {
		Object[][] arrayObject =ExcelReadWrite.getData("MenuList.xlsx", "MenuSheet");
		return arrayObject;
	}*/
		
	/*@Test
	public void verifySearchBoxDisplayed() {
		ExtentLogsReport.info(test1, "Starting verifySearchBoxDisplayed test");
		ExtentLogsReport.IExtentResult(test1, hp.displaySerachboxbutton(), "verifySearchBoxDisplayed test is passed", "verifySearchBoxDisplayed test is failed", "verifySearchBoxDisplayed test is skipped", driver, "YES", "YES");
		ExtentLogsReport.info(test1, "SearchBox is Present on HomePage");
		ExtentLogsReport.info(test1, "verifySearchBoxDisplayed test is complited");
		
		Assert.assertTrue(hp.displaySerachboxbutton());
		
	}*/
	
	@Test
	public void VerifySearchBoxClickable() {
		ExtentLogsReport.info(test1, "Starting VerifySearchBoxClickable test");
		ExtentLogsReport.IExtentResult(test1, homePage.clickableSearchBox(), "VerifySearchBoxClickable test is passed", "VerifySearchBoxClickable test is failed", "VerifySearchBoxClickable test is skipped", driver, "NO", "NO");
		ExtentLogsReport.info(test1, "SearchBox is clickable on HomePage");
		ExtentLogsReport.info(test1, "VerifySearchBoxClickable test is complited");
		
		Assert.assertTrue(homePage.clickableSearchBox());
	}
	
	
	
	

	
}
