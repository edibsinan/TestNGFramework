package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookGrup {

    @Test
    public void facebookGrup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("gplussinan@hotmail.com");
        driver.findElement(By.id("pass")).sendKeys("fac12345");
        //login Button
        driver.findElement(By.id("u_0_b")).click();

//        driver.findElement(By.className("linkWrap.noCount")).click();
    }
}
