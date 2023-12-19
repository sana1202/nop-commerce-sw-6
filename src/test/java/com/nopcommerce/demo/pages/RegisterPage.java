package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, "this");
    }

    // verify register
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement maleraido;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstname;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement namerequired;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastnamerequired;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailrequired;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordrequired;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement reconifrmpasswordrequired;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastname;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement dateofbirth;


    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement monthofBirth;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement yearofbirth;

    @CacheLookup
    @FindBy(xpath = "//input[@type='email' and @name='Email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    WebElement confirmpassword;


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement clickregister;


    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement actualMessage1;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement clickcontinue;


    public String verifyTextRegister() {
        log.info("getting register text from " + register.toString() );
        return getTextFromElement(register);
    }

    public void clickOnRadioButton() {
        log.info("Clicking on Radio Button" + maleraido.toString() );
        clickOnElement(maleraido);
    }


    public void getFirstName(String text) {
        log.info("Enter email" + text + " to email field " + firstname.toString() );

        sendTextToElement(firstname, text);
    }

    public String verifyFirstNamerequired() {

        log.info("getting Firstname text from " + namerequired.toString() );
        return getTextFromElement(namerequired);
    }

    public String verifyLastNamerequired() {

        log.info("getting Lastname  text  " + lastnamerequired.toString() );
        return getTextFromElement(lastnamerequired);
    }

    public String verifyEmailfieldRequired() {

        log.info("getting Email field text  " + emailrequired.toString() );
        return getTextFromElement(emailrequired);
    }

    public String verifyPasswordRequired() {

        log.info("getting Password text  " + passwordrequired.toString() );
        return getTextFromElement(passwordrequired);
    }

    public String verifyreconfirmpasswordrequired() {

        log.info("getting reconfirmation of password text  " + reconifrmpasswordrequired.toString() );
        return getTextFromElement(reconifrmpasswordrequired);
    }


    public void getLastName(String text) {
        log.info("Enter lastname "+text+ " to email field "+lastname.toString() );
        sendTextToElement(lastname, text);
    }


    public void setDateofbirth(String text) {
        log.info("Selecting date of birth "+text+" from dropdown "+dateofbirth.toString() );
        selectByVisibleTextFromDropDown(dateofbirth, text);
    }

    public void setMonthofBirth(String text) {
        log.info("Selecting month of birth "+text+" from dropdown "+monthofBirth.toString() );
        selectByVisibleTextFromDropDown(monthofBirth, text);
    }


    public void setYearofbirth(String text) {
        log.info("Selecting year of birth "+text+" from dropdown "+yearofbirth.toString() );
        selectByVisibleTextFromDropDown(yearofbirth, text);
    }


    public void getemailaddress(String text) {
        log.info("Enter email "+text+ " to email field "+email.toString() );
        sendTextToElement(email, text);
    }


    public void getPassword(String text) {
        log.info("Enter password "+text+ " to email field "+password.toString() );
        sendTextToElement(password, text);
    }

    public void getConfirmPassword(String text) {
        log.info("Enter confirm password "+text+ " to email field "+confirmpassword.toString() );
        sendTextToElement(confirmpassword, text);
    }

    public void getClickOnRegister() {
        log.info("Clicking on Register "+ clickregister.toString());
        clickOnElement(clickregister);
    }


    public String verifyRegistrationComplete() {
        log.info("getting registration completed text  "+actualMessage1.toString()+"<br>");
        return getTextFromElement(actualMessage1);
    }

    public void setClickContinue() {
        log.info("Clicking on continue "+ clickcontinue.toString());
        clickOnElement(clickcontinue);
    }
}
