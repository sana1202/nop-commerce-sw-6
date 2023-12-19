package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, "this");
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computertext;


    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement desktop;


    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h2[1]/a[1]")
    WebElement notebook;


    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/h2[1]/a[1]")
    WebElement software;

    public String verifyTextcomputer() {
        log.info("getting computer text  " + computertext.toString()  );
        return getTextFromElement(computertext);
    }


    public void clickOnDesktop() {
        log.info("Clicking on Desktop " + desktop.toString()  );
        clickOnElement(desktop);
    }


    public void clickOnNoteBook() {
        log.info("Clicking on noteBook " + notebook.toString() );
        clickOnElement(notebook);
    }

    public void clickOnSoftware() {
        log.info("Clicking on Software " + software.toString() );
        clickOnElement(software);
    }
}
