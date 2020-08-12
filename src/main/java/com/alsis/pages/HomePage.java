package com.alsis.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import com.alsis.pageor.HomePageOR;
import com.alsis.testbase.TestBase;
import com.alsis.util.CompeareText;
import com.alsis.util.ExcelReadWrite;
import com.alsis.util.ExtentLogsReport;
import com.alsis.util.MenuUtil;
import com.aventstack.extentreports.ExtentTest;

public class HomePage extends HomePageOR {

	public HomePage(WebDriver driver, ThreadLocal<ExtentTest> test) {
		super(driver, test);

	}
	
	  List<String> listMenuWeb;
	  List<String> listMenuExcel = null;
	  
	  
	public boolean countLinks() throws Exception {
		listMenuWeb=MenuUtil.getWebList(driver,weblist);
		listMenuExcel =ExcelReadWrite.getExcellist("MenuList.xlsx", "MenuSheet");
		
		boolean condition=listMenuWeb.size()==listMenuExcel.size();
		return condition;
	}
	
   public boolean linkSeq() {
	   
	   boolean condition=true;

		listMenuWeb=MenuUtil.getWebList(driver,weblist);
		try {
			listMenuExcel = ExcelReadWrite.getExcellist("MenuList.xlsx", "MenuSheet");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		if(listMenuWeb.size()==listMenuExcel.size()) {
			for(int i=0;i<listMenuWeb.size();i++) {
				if(!(listMenuWeb.get(i).equals(listMenuExcel.get(i)))) {
					condition=false;
			     	break;
				}
				return condition;
			}
		}else {
			return false;
		}
		return condition;
   }
   
   public boolean MenuSpellingCheck(String ExcelLinkName) {
	   listMenuWeb=MenuUtil.getWebList(driver,weblist);
		try {
			listMenuExcel = ExcelReadWrite.getExcellist("MenuList.xlsx", "MenuSheet");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		boolean condition=listMenuWeb.contains(ExcelLinkName);
	   return condition;
   }
   
   
   public boolean headOfficeAdress() {
	   return CompeareText.compare(driver, headofficeaddress, "Headofficeaddress1.txt");
   }
   
   
   public boolean returnadress() {
	   return CompeareText.compare(driver, returnadd, "Returnadd.txt");
   }
	
   public boolean displaySerachboxbutton() {
	   boolean serachboxName= searchbox.isDisplayed();
	  return serachboxName;
   }
   
   
   public boolean clickableSearchBox() {
	  //element =  ExpectedConditions.elementToBeClickable(searchbox);
	   
	  System.out.println("<<<<<<<<<<<<<<<<<<<Started>>>>>>>>>>>>>>>>>>>");
	   System.out.println("The original weblemenet is " +searchbox);
	   //boolean flag =false;
	   boolean condition=searchbox.isDisplayed() && searchbox.isEnabled();
	   return condition;
	  /* if(searchbox.isDisplayed() && searchbox.isEnabled() ) {
		flag=true;
	   }        //ExpectedConditions.elementToBeClickable(searchbox) -this  method return same webelement if it is clickable otherwise give Timeoutexception
	return flag;
	*/
   }
   
   public void currency() {
	   
   }
   

}
