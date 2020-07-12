package com.techproed.tests;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is test Before method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("This is before CLASS only once");
    }
    @Test
    public void test1(){
        System.out.println("This is test 1 method");
    }
    @Test
    public void test2(){
        System.out.println("This is test 2 method");
    }

    @Ignore
    @Test
    public void test3(){
        System.out.println("This is test 3 method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is after method");
    }
    @AfterClass
            public void afterClass(){
        System.out.println("This is after CLASS runs only once");
    }
}
