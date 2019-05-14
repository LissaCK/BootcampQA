package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    @FindBy(css =".sc-bdVaJa.sc-gZMcBi.giglCC")
    private List<WebElement> errorFields;


    public void inputEmailField(String email){
        wait.until(ExpectedConditions.visibilityOfAllElements(emailField));
        emailField.sendKeys(email);
    }


    public void inputPassword(String password){
        wait.until(ExpectedConditions.visibilityOfAllElements(passwordField));

        passwordField.sendKeys(password);
    }


    public void inputFirstName(String firstName){
        wait.until(ExpectedConditions.visibilityOfAllElements(firstNameField));
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName){
        wait.until(ExpectedConditions.visibilityOfAllElements(lastNameField));
        lastNameField.sendKeys(lastName);
    }
    public void inputPhone(String phoneNumber){

        wait.until(ExpectedConditions.visibilityOfAllElements(phoneField));
        phoneField.sendKeys(phoneNumber);
    }

    public String clickNextButton(){
        wait.until(ExpectedConditions.visibilityOfAllElements(nextButton));
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

    public String getErrorForEmailField(){
        wait.until(ExpectedConditions.visibilityOfAllElements(emailField));
        String error = errorFields.get(0).getText();
        return error;
    }

    public String getErrorForPasswordField(){
        wait.until(ExpectedConditions.visibilityOfAllElements(passwordField));
        String error = errorFields.get(1).getText();
        return error;
    }

    public String getErrorForFirstNameField(){
        wait.until(ExpectedConditions.visibilityOfAllElements(firstNameField));
        String error = errorFields.get(2).getText();
        return error;
    }
    public String getErrorForLastNameField(){
        wait.until(ExpectedConditions.visibilityOfAllElements(lastNameField));
        String error = errorFields.get(3).getText();
        return error;
    }

    public String getErrorForPhoneField(){
        wait.until(ExpectedConditions.visibilityOfAllElements(phoneField));
        String error = errorFields.get(4).getText();
        return error;
    }


}
