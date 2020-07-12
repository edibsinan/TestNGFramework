package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sorf_Hard_Assertion {
    WebDriver driver;
     @BeforeMethod
    public void login(){
         WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.get("http://a.testaddressbook.com/sign_in");
     }
     @Test
    public void email(){
         driver.findElement(By.id("session_email")).sendKeys("edib@gmail.com");
         driver.findElement(By.id("session_password")).sendKeys("12345");
         driver.findElement(By.name("commit")).click();
     }
}
