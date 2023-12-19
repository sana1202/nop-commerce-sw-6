package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerTest {
    @When("^I click on computer tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputer();
    }

    @Then("^I can see the text computer$")
    public void iCanSeeTheTextComputer() {
        String expectedMessage = "Computers";
        Assert.assertEquals(new ComputerPage().verifyTextcomputer(), expectedMessage);
    }

    @And("^I can see build your own computer$")
    public void iCanSeeDesktopLaptopBuildYourOwnComputer() {
        String expectedMessage6 = "Build your own computer";
        Assert.assertEquals(new BuildYourOwnComputerPage().verifyTextBuiltYourComputer(), expectedMessage6);

    }

    @And("^I click on Desktop link$")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDesktop();
    }

    @Then("^I can see the desktop text$")
    public void iCanSeeTheDesktopText() {


    }

    @And("^I click on Built your own computer$")
    public void iClickOnBuiltYourOwnComputer() {
        new DesktopsPage().setBuiltyourcomputer();
    }


    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().setAddtocart();
    }

    @Then("^I can see the message product has been added to your shopping cart$")
    public void iCanSeeTheMessageProductHasBeenAddedToYourShoppingCart() {
        String expectedMessage4 = "";
    }

    @And("^I select  \"([^\"]*)\" from processor$")
    public void iSelectFromProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);

    }

    @And("^I select \"([^\"]*)\" from RAM$")
    public void iSelectFromRAM(String rams) {
        new BuildYourOwnComputerPage().selectRam(rams);

    }

    @And("^I select \"([^\"]*)\" from Harddrive$")
    public void iSelectFromHarddrive(String hdd) {
        new BuildYourOwnComputerPage().clcikOnHardware(hdd);

    }

    @And("^I select \"([^\"]*)\" from operating system$")
    public void iSelectFromOperatingSystem(String os) {
        new BuildYourOwnComputerPage().setOperatingsystem();

    }

    @And("^I select \"([^\"]*)\" from software$")
    public void iSelectFromSoftware(String arg0) {
        new BuildYourOwnComputerPage().setSoftware();

    }
}
