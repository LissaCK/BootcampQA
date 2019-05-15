package com.wag;

import testData.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    protected WebDriver driver;
    protected User user;
    protected WebDriverWait wait;

    @Before
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/lesya/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://wagwalking.com/");
        String titleExpected = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";
        String titleActual = driver.getTitle();
        Assert.assertEquals(titleExpected, titleActual);
        user = new User();
        wait = new WebDriverWait(driver, 10);

    }
    @After
    public void close(){
        //driver.quit();
    }


}
