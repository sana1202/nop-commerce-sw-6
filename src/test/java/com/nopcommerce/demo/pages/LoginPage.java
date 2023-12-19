package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, "this");
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcome;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement loginverify;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement errormessage;


    public String verifyTheErrorMessage() {
        log.info("getting error message text from " + verifyWelcome.toString());
        return getTextFromElement(errormessage);
    }

    public void setEmail(String text) {
        sendTextToElement(email, text);
        log.info("Enter email " + text + " to email field " + email.toString());
    }

    public void setPassword(String text) {
        sendTextToElement(password, text);
        log.info("Enter password : " + text + " to email field " + password.toString());
    }

    public void clickOnLogin() {
        clickOnElement(login);
        log.info("Clicking on login " + login.toString());
    }


    public String verifyLoginText() {
        log.info("getting Login text from " + loginverify.toString());

        return getTextFromElement(loginverify);
    }

    public String verifyWelcomeTextMessage() {
        log.info("getting Welcome text from " + verifyWelcome.toString());
        log.info("getting error message text from " + verifyWelcome.toString());
        return getTextFromElement(verifyWelcome);
    }

    public void clickOnLogout() {
        log.info("Clicking on logout " + login.toString());
        clickOnElement(logout);
    }
}
