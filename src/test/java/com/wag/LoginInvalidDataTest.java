package com.wag;

import org.junit.Assert;
import org.junit.Test;

public class LoginInvalidDataTest extends  BaseTest{

    private LoginPage loginPage;
    private HomePage homePage;

    @Test
    public void testLoginInvalidData(){
        homePage = new HomePage(driver);
       loginPage = homePage.clickLoginButton();
       loginPage.inputEmailField(user.getEmail());
       loginPage.inputPasswordField(user.getPassword());
      loginPage.clickLoginButton();


       String res = loginPage.getInvalidDate();
        System.out.println(res);
        Assert.assertEquals("Invalid credentials", res);


    }

}
