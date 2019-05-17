package com.wag;


import org.junit.Assert;
import org.junit.Test;

public class IncorectEmailTest extends BaseTest{
    private PromotionPage promotionPage;
    private HomePage homePage;

   @Test
    public void testIncorrectEmail(){
       homePage = new HomePage(driver);

       promotionPage = homePage.clickWalkFreeButton();
       promotionPage.inputEmailField(user.getIncorectEmail());


       promotionPage.clickPasswordField();

       String error = promotionPage.getErrorForEmailField();
       System.out.println(error);
       Assert.assertEquals("please provide a valid email", error);
   }


}
