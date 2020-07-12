package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonDropDown {
    WebDriver driver;
    @BeforeClass
    public void amazonSite(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }
    @Test
    public void amazonAll(){
        WebElement all=driver.findElement(By.id("searchDropdownBox"));
        Select option=new Select(all);

        System.out.println(all.getText());

        

        option.selectByIndex(0);

        Assert.assertEquals(option,"All Departments");



    }

}
