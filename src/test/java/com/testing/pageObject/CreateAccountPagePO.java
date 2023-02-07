package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {

    // Element locators - Stage 1
    @FindBy(id = "firstname")
    public static WebElement FirstNameField;

    @FindBy(id = "lastname")
    public static WebElement LastNameField;

    @FindBy(id = "email_address")
    public static WebElement EmailAddressField;

    @FindBy(id = "password")
    public static WebElement PassWordField;

    @FindBy(id = "password-confirmation")
    public static WebElement PassWordConfirmationField;

   @FindBy(css = "#form-validate > div > div.primary > button")
   public static WebElement CreateAccountButton;




    //Initialise Web Elements to use Selenium Webdriver - Stage 2
    public CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);

    }


    // Page Specific Methods - Stage 3
    public void enterFirstName(String Firstname){
        FirstNameField.sendKeys(Firstname);

    }

    public void enterLastName(String Lastname){
        LastNameField.sendKeys(Lastname);

    }

    public void enterEmailAddress(String EmailAddress){
        EmailAddressField.sendKeys(EmailAddress);

    }

    public void enterPassword(String Password){
        PassWordField.sendKeys(Password);

    }

    public void enterConfirmPassword(String ConfirmPassword){
        PassWordConfirmationField.sendKeys(ConfirmPassword);

    }


    public void clickCreateAnAccount(){
        CreateAccountButton.click();

    }
































}
