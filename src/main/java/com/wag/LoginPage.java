package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);

    }

    @FindBy(css = "input[data-testid=\"email-input\"]")
    private WebElement emailField;

    @FindBy(css = "input[data-testid=\"password-input\"]")
    private WebElement passwordField;

    @FindBy(css = "button[class=\"btn btn-secondary btn-block\"]")
    private WebElement loginButton;

    @FindBy(css = "div[data-testid=\"login-error-alert\"]")
    private WebElement invalidData;

    public void inputEmailField(String email){
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }

    public void inputPasswordField(String password){
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys(password);
    }
    public String clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
        String result = loginButton.getText();
        return result;
    }



    public String getInvalidDate(){
        wait.until(ExpectedConditions.visibilityOf(invalidData));
        String res  = invalidData.getText();
        return res;

    }






}
