package com.web;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		//System.setProperty("webdriver.gecko.driver", "C:/Users/mouna/workspace/SeleniumTutorial1/drivers/geckodriver.exe");
		
		URL geckoDriverURL=XpathDemo.class.getClassLoader().getResource("webdriver/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver",geckoDriverURL.getPath());
        
		
		driver = new FirefoxDriver();
		String baseURl = "http://www.google.com";
		driver.manage().window().maximize();
		driver.get(baseURl);
		
		driver.findElement(By.xpath("//input[@title='Rechercher']")).sendKeys("letskodeit");
		driver.findElement(By.name("btnK")).click();
	}

}
