package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends  BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }
    @FindBy(css = ".sc-bdVaJa.sc-bwzfXH.jUXfpw button p")
    private WebElement walkFreeButton;

    public void clickWalkFreeButton(){
        walkFreeButton.click();
    }


}
