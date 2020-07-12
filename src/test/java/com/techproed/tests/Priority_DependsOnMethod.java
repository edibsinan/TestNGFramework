package com.techproed.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority_DependsOnMethod {

    @Test(priority = 0)
    public void login(){
        System.out.println("This is a login page");
    }
    @Test(priority = 2)
    public void homePage(){
        System.out.println("This is a home page");
    }
    @Test(priority = 3)
    public void search(){
        System.out.println("This is a search page");
//        Assert.assertTrue(false);
        Assert.assertEquals(3,5);
    }
    // "result" depend on "search"
    @Test(priority = 4, dependsOnMethods = "search")
    public void result(){
        System.out.println("This is a result page");
    }
    @Test(dependsOnMethods ="homePage" )
    public void depends(){
        System.out.println("Depends try");
    }
}