package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, "this");
    }


    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;

    @CacheLookup
    @FindBy(xpath = "//select[@name='product_attribute_2']")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath = "//input[@value='7']")
    WebElement harddrive;

    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_5' and @value='12']")
    WebElement operatingsystem;

    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_5' and @value='12']")
    WebElement software;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Build your own computer']")
    WebElement verifyBulidYourComputer;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 add-to-cart-button']")
    WebElement addtocart;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verfytheshoppingtext;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closebutton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement VistaPremium;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement VistaHome1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement TotalCommander1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement MicrosoftOffice1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement AcrobatReader1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement Harddrive;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement Harddrive1;


    public void setAddtocart() {
        log.info("Clicking on addtocart " + software.toString());
        clickOnElement(addtocart);
    }

    public void selectProcessor(String intel) {
        selectByVisibleTextFromDropDown(processor, intel);
        log.info("Enter email " + intel + " to email field " + processor.toString() + "<br>");

    }

    public void selectRam(String text) {
        selectByVisibleTextFromDropDown(ram, text);
        log.info("Selecting RAM " + text + " from dropdown " + ram.toString() + "<br>");
    }


    public void setHarddrive() {
        clickOnElement(harddrive);
        log.info("Clicking on Hard drive " + harddrive.toString() + "<br>");
    }


    public void setOperatingsystem() {
        clickOnElement(operatingsystem);
        log.info("Clicking on operating system " + operatingsystem.toString() + "<br>");
    }


    public void setSoftware() {
        clickOnElement(software);
        log.info("Clicking on software " + software.toString() + "<br>");
    }


    public String verifyTextBuiltYourComputer() {
        log.info("getting Build your own computer text  " + verifyBulidYourComputer.toString() + "<br>");
        return getTextFromElement(verifyBulidYourComputer);
    }


    public String verifyTheShoppingcartText() {
        log.info("verify the text shopping cart " + verfytheshoppingtext.toString() + "<br>");
        return getTextFromElement(verfytheshoppingtext);
    }


    public void clickOnCloseButton() {
        log.info("Clicking on Close Button " + closebutton.toString() + "<br>");
        clickOnElement(closebutton);
    }


    public void getOsRadio(String radio) {
        if (radio == "VistaHome") {
            log.info("Clicking on VistaHome " + VistaHome1.toString() + "<br>");
            clickOnElement(VistaHome1);
        } else {
            log.info("Clicking on VistaPremium " + VistaPremium.toString() + "<br>");
            clickOnElement(VistaPremium);

        }

    }


    public void clickOnSoftwareCheckBox(String software) {
        if (software == "MicrosoftOffice") {
            clickOnElement(MicrosoftOffice1);
            log.info("Clicking on Microsoftoffice " + MicrosoftOffice1.toString() + "<br>");
        }
        if (software == "TotalCommander") {
            clickOnElement(TotalCommander1);
            log.info("Clicking on TotalCommander " + TotalCommander1.toString() + "<br>");
        }
        if (software == "AcrobatReader") {
            clickOnElement(AcrobatReader1);
            log.info("Clicking on AcrobatReader " + AcrobatReader1.toString() + "<br>");
        }
    }


    public void clcikOnHardware(String HDD) {
        if (HDD == "320GB") {
            clickOnElement(harddrive);
            log.info("Clicking on Hardware " + harddrive.toString() + "<br>");
        } else {
            clickOnElement(Harddrive1);
            log.info("Clicking on Harddrive " + Harddrive1.toString() + "<br>");
        }

    }
}
