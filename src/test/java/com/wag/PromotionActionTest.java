package com.wag;


import org.junit.Assert;
import org.junit.Test;


public class PromotionActionTest extends BaseTest{
    private HomePage homePage;
    private PromotionPage promotionPage;



    @Test
    public void testPromotionAction() {
        homePage = new HomePage(driver);


        promotionPage = homePage.clickWalkFreeButton();

        promotionPage.inputEmailField(user.getEmail());
        promotionPage.inputPassword(user.getPassword());
        promotionPage.inputFirstName(user.getFirstName());
        promotionPage.inputLastName(user.getLastName());
        promotionPage.inputPhone(user.getPhoneNumber());
        String res = promotionPage.clickNextButton();
        Assert.assertEquals("NEXT", res);
        String email = promotionPage.getEmail();
        Assert.assertEquals(user.getEmail(), email);
        String password = promotionPage.getPassword();
        Assert.assertEquals(user.getPassword(), password);
        String firstName = promotionPage.getFirstName();
        Assert.assertEquals(user.getFirstName(), firstName);
        String lastName = promotionPage.getLastName();
        Assert.assertEquals(user.getLastName(), lastName);
        String phone = promotionPage.getPhone();
        Assert.assertEquals(user.getPhoneNumber(), phone);
        String notification = promotionPage.getConfirmNotification();
        Assert.assertEquals("Let's start with the basics", notification);

        //String errorEmail = promotionPage.getErrorForEmailField();
        //Assert.assertEquals("required", errorEmail);


    }

}
