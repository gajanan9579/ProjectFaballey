package com.alsis.testbase;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import org.testng.asserts.SoftAssert;

import com.alsis.base.Base;
import com.alsis.pages.HomePage;
import com.alsis.util.ExcelReadWrite;
import com.alsis.util.MenuUtil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestBase extends Base {
	
	public static ExtentReports extent;
	public static ThreadLocal<ExtentTest> test1;
	public static ExtentTest parenttest;
	public static ExtentTest childtest;
	public static ExtentHtmlReporter htmlreporter;
	public static SoftAssert soft;
	public static ThreadLocal<ExtentTest>testReport;
	

	public  WebDriver driver;
	//public  HomePage homePage;
	
	
	
	 @BeforeSuite
	  public void  initialiseExtentReport() {
		  Date d= new Date();
		  String FileName="ExtentReport_"+d.toString().replace(":", "_")+".html";
		  htmlreporter= new ExtentHtmlReporter(currDir+"/reports/"+FileName);
			extent=new ExtentReports(); 
			 testReport=new ThreadLocal<ExtentTest>();
			  test1=new ThreadLocal<ExtentTest>();
			  
			extent.attachReporter(htmlreporter);
			extent.setSystemInfo("HostName", "HP");
			extent.setSystemInfo("Enviroment", "QA");
			extent.setSystemInfo("UserName", "Gajanan Pawar");	
			soft= new SoftAssert();
	  
	  }
	 @BeforeClass
	 public void parentSetup() throws Exception {
		 parenttest= extent.createTest(getClass().getSimpleName());
		 testReport.set(parenttest);
		
	 }

	@BeforeMethod
	public void openBrowser(Method method) throws InterruptedException {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\workspaceProject\\ProjectFaballey\\src\\resources\\java\\com\\alsis\\driver\\chromedriver78.exe");

			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

			System.setProperty("webdriver.geckodriver.driver","C:\\workspaceProject\\ProjectFaballey\\src\\resources\\java\\com\\alsis\\driver\\geckodriver64bit.exe");

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		/*
		 * driver.manage().timeouts().pageLoadTimeout(WebEventListener.page_Load_Time,
		 * TimeUnit.SECONDS);
		 * driver.manage().timeouts().implicitlyWait(WebEventListener.implicit_Wait,
		 * TimeUnit.SECONDS);
		 */
		driver.get(prop.getProperty("url"));
		Thread.sleep(10000);
<<<<<<< HEAD
		childtest=testReport.get().createNode(method.getName());
		test1.set(childtest);
		homePage = new HomePage(driver,test1);
=======
		childtest=parenttest.createNode(method.getName());
		test1=childtest;
		//homePage = new HomePage(driver,test1);
>>>>>>> 091526e7255df17fd2505fdc2ab425b1b7e1f157
		
	}

	@AfterMethod
	public void closeBrowser() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}
	
	@AfterSuite
	public void endReport() {
		extent.flush();
	}
	
	
}
