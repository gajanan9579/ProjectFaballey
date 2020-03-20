package com.alsis.util;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompeareText {

	public static boolean compare(WebDriver driver, String xpath, String filepath) {

		String readLine = "";
		String fdata = null;

		String webdata = driver.findElement(By.xpath(xpath)).getText();

		System.out.println();
		System.out.println("Data from website");

		System.out.println(webdata);

		try {

			StringBuilder sb = new StringBuilder();

			FileReader f1 = new FileReader(filepath);

			BufferedReader br = new BufferedReader(f1);

			System.out.println();
			System.out.println("Data form file");

			while ((readLine = br.readLine()) != null) {
				sb.append(readLine);
				sb.append("\n");
			}
			br.close();

			fdata = sb.toString().trim();
			System.out.println(fdata);

		} catch (Exception e) {
			e.printStackTrace();
		}

	
	if (webdata.equalsIgnoreCase(fdata)) {
		System.out.println("matached data both from file and  website");
		return true;
	} else {
		System.out.println("not matached data both from file and  website");
		return false;
	}

}

	public static boolean compare(WebDriver driver, WebElement webelement, String filepath) {
		String readLine = "";
		String fdata = null;

		String webdata =webelement.getText();

		System.out.println();
		System.out.println("Data from website");

		System.out.println(webdata);

		try {

			StringBuilder sb = new StringBuilder();

			FileReader f1 = new FileReader(filepath);

			BufferedReader br = new BufferedReader(f1);

			System.out.println();
			System.out.println("Data form file");

			while ((readLine = br.readLine()) != null) {
				sb.append(readLine);
				sb.append("\n");
			}
			br.close();

			fdata = sb.toString().trim();
			System.out.println(fdata);

		} catch (Exception e) {
			e.printStackTrace();
		}

	
	if (webdata.equalsIgnoreCase(fdata)) {
		System.out.println("matached data both from file and  website");
		return true;
	} else {
		System.out.println("not matached data both from file and  website");
		return false;
	}
	}}
