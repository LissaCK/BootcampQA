
package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PromotionPageDuplicate extends BasePage{

    public PromotionPageDuplicate(WebDriver driver){
        super(driver);

    }

    @FindBy(css = "input")
    private List<WebElement>fields;

    @FindBy(css = "p.sc-gzVnrw.htpxiB")
    private WebElement nextButton;

    public void inputEmail(String email){
        wait.until(ExpectedConditions.visibilityOfAllElements(fields));
        fields.get(0).sendKeys(email);
    }
    public void inputPassword(String password){
        fields.get(1).sendKeys(password);
    }
    public void inputFirstName(String firstName){
        fields.get(2).sendKeys(firstName);
    }
    public void inputLastName(String lastName){
        fields.get(3).sendKeys(lastName);
    }
    public void inputPhone(String phone){
        fields.get(4).sendKeys(phone);
    }

// some code

}

