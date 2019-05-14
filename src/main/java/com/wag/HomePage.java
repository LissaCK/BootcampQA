package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends  BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }
    @FindBy(css = ".sc-bdVaJa.sc-bwzfXH.jUXfpw button p")
    private WebElement walkFreeButton;

    public  PromotionPage clickWalkFreeButton(){
           wait.until(ExpectedConditions.elementToBeClickable(walkFreeButton));
           walkFreeButton.click();
           return new PromotionPage(driver);

    }


}
