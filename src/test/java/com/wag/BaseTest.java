package com.wag;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/lesya/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://wagwalking.com/");
        String titleExpected = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners | WagWalking.com - Leading Local Dog Walker Service for Dog Owners";
        String titleActual = driver.getTitle();
        Assert.assertEquals(titleExpected, titleActual);

    }
    @After
    public void close(){
        //driver.quit();
    }


}
