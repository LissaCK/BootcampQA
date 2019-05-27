package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BecomeWalkerPage extends BasePage {
    public BecomeWalkerPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#first_name")
    private WebElement firstNameField;

    @FindBy(css = "#last_name")
    private WebElement lastNameField;

    @FindBy(css = "#email")
    private WebElement emailField;

    @FindBy(css = "#phone")
    private WebElement phoneField;

    @FindBy(css = "#address__line-one")
    private WebElement addressField;

    @FindBy(css = ".autocomplete-result")
    private List<WebElement> autocompleteField;

    @FindBy(css = ".error-message")
    private List<WebElement> errorMessage;


    @FindBy(css = "#address__line-two")
    private WebElement aptField;

    @FindBy(css = "button")
    private WebElement applyButton;

    //@FindBy(css = ".autocomplete-result span")



    public void inputFirstName(String firstName){
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName){
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(lastName);
    }

    public void inputEmailField(String email){
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }

    public void inputPhoneField(String phone){
        wait.until(ExpectedConditions.elementToBeClickable(phoneField));
        phoneField.sendKeys(phone);
    }

    public void inputAddressField(String address){
        wait.until(ExpectedConditions.elementToBeClickable(addressField));
        addressField.sendKeys(address);
    }

    public void confirmAddress() {
        wait.until(ExpectedConditions.visibilityOfAllElements(autocompleteField));
        int size = autocompleteField.size();
        System.out.println(size);
        autocompleteField.get(1).click();
    }

    public void clickAptField(){
        wait.until(ExpectedConditions.elementToBeClickable(aptField));
        aptField.click();
    }

    public String clickApplyButton(){
        wait.until(ExpectedConditions.elementToBeClickable(applyButton));
        applyButton.click();
        String res = applyButton.getText();
        return res;
    }

    public String getError(){
        wait.until(ExpectedConditions.visibilityOf(errorMessage.get(2)));
        String error = errorMessage.get(2).getText();
        return error;
    }




}
