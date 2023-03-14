package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefs {

WebDriver driver=null;
@Given("^user on login page$")
public void user_on_login_page() throws Throwable {
   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("file:///E:/SeleniumSoftwares/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
}

@When("^user enters valid credentials$")
public void user_enters_valid_credentials() throws Throwable {
   driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
   driver.findElement(By.id("password")).sendKeys("123456");
   driver.findElement(By.xpath("//button")).click();
}

@Then("^user should be on home page$")
public void user_should_be_on_home_page() throws Throwable {
   Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
}












}
