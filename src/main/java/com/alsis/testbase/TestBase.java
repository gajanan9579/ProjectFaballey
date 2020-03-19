package com.alsis.testbase;

import java.lang.reflect.Method;
import java.util.Date;

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
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestBase extends Base {
	
	public static ExtentReports extent;
	public static ExtentTest test1;
	public static ExtentTest parenttest;
	public static ExtentTest childtest;
	public static ExtentHtmlReporter htmlreporter;
	public static SoftAssert soft;
	
	 

	public  WebDriver driver;
	
	
	
	 @BeforeSuite
	  public void  initialiseExtentReport() {
		  Date d= new Date();
		  String FileName="ExtentReport_"+d.toString().replace(":", "_")+".html";
		  htmlreporter= new ExtentHtmlReporter(currDir+"/reports/"+FileName);
			extent=new ExtentReports(); 
			extent.attachReporter(htmlreporter);
			extent.setSystemInfo("HostName", "HP");
			extent.setSystemInfo("Enviroment", "QA");
			extent.setSystemInfo("UserName", "Gajanan Pawar");	
			soft= new SoftAssert();
	  
	  }
	 @BeforeClass
	 public void parentSetup() {
		 parenttest= extent.createTest(getClass().getSimpleName());
		 
	 }

	@BeforeMethod
	public void openBrowser(Method method) {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\workspaceProject\\ProjectFaballey\\src\\resources\\java\\com\\alsis\\driver\\chromedriver78.exe");

			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

			System.setProperty("webdriver.geckodriver.driver","C:\\workspaceProject\\ProjectFaballey\\src\\resources\\java\\com\\alsis\\driver\\gecodriver.exe");

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
		childtest=parenttest.createNode(method.getName());
		test1=childtest;
		
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
