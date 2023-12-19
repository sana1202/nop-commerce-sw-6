package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageTest {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on login tab$")
    public void iClickOnLoginTab() {
        new HomePage().clickLoginLink();
    }

    @Then("^I navigate to login page successfully$")
    public void iNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().verifyWelcomeTextMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }


    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLogin();
    }

    @Then("^I should be able see the welcome message$")
    public void iShouldBeAbleSeeTheWelcomeMessage() {
        String expectedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(new LoginPage().verifyWelcomeTextMessage(), expectedMessage);
    }

    @Then("^I should be able to see logout Button$")
    public void iShouldBeAbleToSeeLogoutButton() {
        String expectedMessage1 = "https://demo.nopcommerce.com/";
        Assert.assertEquals(expectedMessage1, new HomePage().verifyLogout());
    }

    @And("^I should be able to see the logout button$")
    public void iShouldBeAbleToSeeTheLogoutButton() {
    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new LoginPage().clickOnLogout();
    }

    @Then("^I can see the login link displayed$")
    public void iCanSeeTheLoginLinkDisplayed() {
        String expectedMessage3 = "Log in";
        Assert.assertEquals(expectedMessage3, new HomePage().verifyloginText());
    }

    @And("^I enter \"([^\"]*)\" emailID$")
    public void iEnterEmailID(String emial) {
        new LoginPage().setEmail(emial);
    }

    @And("^I enter \"([^\"]*)\" password$")
    public void iEnterPassword(String password) {
        new LoginPage().setPassword(password);
    }

    @Then("^I should be able see the error message$")
    public void iShouldBeAbleSeeTheErrorMessage() {
        new LoginPage().verifyTheErrorMessage();
        String expectedMessage4 = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
        Assert.assertEquals(expectedMessage4, new LoginPage().verifyLoginText());
    }
}
