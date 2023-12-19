package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver,"this");
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement computerLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement logo;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;


    public void clickLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login " + loginLink.toString() + "<br>");
    }


    public void setRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on RegisterLink " + registerLink.toString() + "<br>");
    }


    public void clickOnComputer() {
        clickOnElement(computerLink);
        log.info("Clicking on Computer " + computerLink.toString() + "<br>");
    }


    public String verifyLogout() {
        log.info("getting Logout text " + logout.toString() + "<br>");
        return driver.getCurrentUrl();
    }
    public String verifyloginText() {

        return getTextFromElement(loginLink);
    }
}
