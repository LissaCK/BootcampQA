package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PromotionPageDuplicate extends BasePage{

    public PromotionPageDuplicate(WebDriver, driver){
        super(driver);

    }

    @FindBy(css = "input")
    private List<WebElement>field;
    public void inputEmail(String email){
        field.get(0).sendKeys(email);
    }
    public void inputPassword(String password){
        field.get(1).sendKeys(password);
    }
    public void inputFirstName(String firstName){
        field.get(2).sendKeys(firstName);
    }
    public void inputLastName(String lastName){
        field.get(3).sendKeys(lastName);
    }
    public void inputPhone(String phone){
        field.get(4).sendKeys(phone);
    }



}
