package com.wag;

import org.junit.Assert;
import org.junit.Test;

public class PromotionErrorTest extends BaseTest{
    private PromotionPage promotionPage;
    private HomePage homePage;

    @Test
    public void testErrorPromotion(){
        homePage = new HomePage(driver);


        promotionPage = homePage.clickWalkFreeButton();
        promotionPage.clickEmailField();
        promotionPage.clickPasswordField();
        promotionPage.clickFirstName();
        promotionPage.clickLastField();
        promotionPage.clickPhoneField();
        promotionPage.clickNextButton();

        String error = promotionPage.getErrorForEmailField();
        System.out.println(error);
        Assert.assertEquals("required", error);

        String error1 = promotionPage.getErrorForFirstNameField();
        System.out.println(error1);
        Assert.assertEquals("required", error1);

        String error2 = promotionPage.getErrorForLastNameField();
        System.out.println(error2);
        Assert.assertEquals("required", error2);

        String error3 = promotionPage.getErrorForPhoneField();
        System.out.println(error3);
        Assert.assertEquals("required", error3);


    }

}
