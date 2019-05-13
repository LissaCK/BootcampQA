package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PromotionPage extends BasePage {
    public PromotionPage(WebDriver driver){
        super(driver);
    }
    @FindBy(css = "input[type=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[type=\"password\"]")
    private WebElement passwordField;

    @FindBy(css = "input[name=\"firstName\"]")
    private WebElement firstNameField;

    @FindBy(css = "input[name=\"lastName\"]")
    private WebElement lastNameField;

    @FindBy(css = "input[type=\"tel\"]")
    private WebElement phoneField;

    @FindBy(css = "p.sc-gzVnrw.htpxiB")
    private WebElement nextButton;

    @FindBy(css ="p.sc-gzVnrw.bMAZbm")
    private List<WebElement> confirmNotification;


    public void inputEmailField(String email){
        emailField.sendKeys(email);
    }

    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }

    public void inputFirstName(String firstName){
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName){
        lastNameField.sendKeys(lastName);
    }
    public void inputPhone(String phoneNumber){
        phoneField.sendKeys(phoneNumber);
    }

    public String clickNextButton(){
        nextButton.click();
        String result = nextButton.getText();
        return result;


    }
    public String getEmail(){
     String res = emailField.getAttribute("value");
     return res;
    }
    public String getPassword(){
        String res = passwordField.getAttribute("value");
        return res;
    }
    public String getFirstName(){
        String res = firstNameField.getAttribute("value");
        return res;
    }
    public String getLastName(){
        String res = lastNameField.getAttribute("value");
        return res;
    }
    public String getPhone(){
        String res = phoneField.getAttribute("value");
        return res;
    }
    public String getConfirmNotification(){
        String res = confirmNotification.get(1).getText();
        return res;
    }


}
