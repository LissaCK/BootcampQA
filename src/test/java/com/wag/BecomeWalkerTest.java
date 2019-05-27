package com.wag;

import org.junit.Assert;
import org.junit.Test;

public class BecomeWalkerTest extends BaseTest{
    private BecomeWalkerPage becomeWalkerPage;
    private HomePage homePage;

    @Test
    public void testBecomeWalker(){
        homePage = new HomePage(driver);
        becomeWalkerPage = homePage.clickBecomeWalkerButton();
        becomeWalkerPage.inputFirstName(userWalker.getFirstName());
        becomeWalkerPage.inputLastName(userWalker.getLastName());
        becomeWalkerPage.inputEmailField(userWalker.getEmail());
        becomeWalkerPage.inputPhoneField(userWalker.getPhone());
        becomeWalkerPage.inputAddressField(userWalker.getAddress());
        becomeWalkerPage.confirmAddress();
       // becomeWalkerPage.selectStateField();
        becomeWalkerPage.clickAptField();
       // becomeWalkerPage.inputAptField(userWalker.getApt());
        //becomeWalkerPage.inputCityField(userWalker.getCity());
      //  becomeWalkerPage.selectStateField();
       // becomeWalkerPage.inputZipcodeField(userWalker.getZipcode());
        becomeWalkerPage.clickApplyButton();

        String error = becomeWalkerPage.getError();
        System.out.println(error);
        Assert.assertEquals("Enter a valid email address", error);
    }



}
