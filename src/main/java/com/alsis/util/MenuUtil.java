package com.alsis.util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuUtil {
	 
	
	 
	public static List<String> getWebList(WebDriver driver,List<WebElement> listElements){
		List<String>menulist = new ArrayList<String>();
		//List<WebElement> listElements = driver.findElements(weblist);
		listElements.size();
		/*for(int i=0;i<listElements.size();i++) {
			WebElement e=listElements.get(i); 
				int x=e.getLocation().getX();
				if(x!=0) {
					e.getText();
				}
			}
		*/
		
		for(WebElement menu:listElements) {
			int x=menu.getLocation().getX();
			if(x!=0) {
				
			String text=menu.getText();
			//System.out.println(text);
			menulist.add(text);
			}
		}System.out.println("Total numbers of menu items present "+menulist.size());
		
		return menulist;
		
	}
	
	
	public static Integer getWebListSize(WebDriver driver,List<WebElement> listElements){
		//List<WebElement> menulist = driver.findElements(locator);
		int count = listElements.size();
		return count;
		
	}

}
