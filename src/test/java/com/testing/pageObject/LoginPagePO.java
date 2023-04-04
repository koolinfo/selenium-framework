package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePO {
    // Element locators - Stage 1
      @FindBy(id = "email")
    public static WebElement EmailField;

   @FindBy(id = "pass")
   public static WebElement PasswordField;

   @FindBy(css = "#send2 > span")
   public static WebElement SignInButton;





    //Initialise Web Elements to use Selenium Webdriver - Stage 2
    public LoginPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);

    }





    // Page Specific Methods - Stage 3
    public void enterEmail(String email){
        EmailField.sendKeys(email);

    }

    public void enterPassword(String pass){
        PasswordField.sendKeys(pass);

    }

    public void clickSignIn(){
        SignInButton.click();

    }


    public void clickLoginPageLink() {
    }
}
