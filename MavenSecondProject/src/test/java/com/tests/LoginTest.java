package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

@Test
public void test01() {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///E:/SeleniumSoftwares/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	Assert.assertEquals(driver.getTitle(),"JavaByKiran | Log in");
	
	
	
}







}
