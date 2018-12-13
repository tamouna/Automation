package com.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURl = "http://www.google.com";
		
		driver.get(baseURl);

	}

}
