package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterTest {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().setRegisterLink();
    }

    @Then("^I should navigate to registration page$")
    public void iShouldNavigateToRegistrationPage() {
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().getClickOnRegister();
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String firstname) {
        String expectedMessage1 = "First name is required.";
        Assert.assertEquals(new RegisterPage().verifyFirstNamerequired(), expectedMessage1);
    }


    @Then("^I should see Your registration completed$")
    public void iShouldSeeYourRegistrationCompleted() {
        String expectedMessage = "Your registration completed";
        Assert.assertEquals(new RegisterPage().verifyRegistrationComplete(), expectedMessage);
    }

    @Then("^I should see the error message \"([^\"]*)\" next to Firstname field$")
    public void iShouldSeeTheErrorMessageNextToFirstnameField(String arg0) {

    }

    @And("^I should see the error message \"([^\"]*)\" next to Lastname field$")
    public void iShouldSeeTheErrorMessageNextToLastnameField(String lastname) {
        String expectedMessage2 = "Last name is required.";
        Assert.assertEquals(new RegisterPage().verifyLastNamerequired(), expectedMessage2);

    }

    @And("^I should see the error message \"([^\"]*)\" next to email field$")
    public void iShouldSeeTheErrorMessageNextToEmialField(String email) {
        String expectedMessage3 = "Email is required.";
        Assert.assertEquals(new RegisterPage().verifyEmailfieldRequired(), expectedMessage3);
    }

    @And("^I should see the error message \"([^\"]*)\" next to Password field$")
    public void iShouldSeeTheErrorMessageNextToPasswordField(String password) {
        String expectedMessage4 = "Password is required.";
        Assert.assertEquals(new RegisterPage().verifyPasswordRequired(), expectedMessage4);

    }

    @And("^I should see the error message \"([^\"]*)\" next to confirm password field$")
    public void iShouldSeeTheErrorMessageNextToConfirmPasswordField(String confpassword) {
        String expectedMessage5 = "Password is required.";
        Assert.assertEquals(new RegisterPage().verifyreconfirmpasswordrequired(), expectedMessage5);

    }


    @And("^I enter  \"([^\"]*)\" email address$")
    public void iEnterEmailAddress(String email) {
        new RegisterPage().getemailaddress("iamslk" + Utility.getRandomString(3) + "@gmail.com");

    }

    @And("^I enter \"([^\"]*)\" password as  password$")
    public void iEnterPasswordAsPassword(String password) {
        new RegisterPage().getPassword("123456");

    }

    @And("^I enter  \"([^\"]*)\" as confirm password$")
    public void iEnterAsConfirmPassword(String confpassword) {
        new RegisterPage().getConfirmPassword("123456");

    }

    @And("^I enter \"([^\"]*)\" as firstname$")
    public void iEnterAsFirstname(String firstname)  {
        new RegisterPage().getFirstName("Kishore");

    }

    @And("^I enter \"([^\"]*)\" as lastname$")
    public void iEnterAsLastname(String arg0)  {
        new RegisterPage().getLastName("Sana");
    }

    @And("^I select \"([^\"]*)\" day of birth$")
    public void iSelectDayOfBirth(String day)  {
        new RegisterPage().setDateofbirth(day);
    }

    @And("^I select \"([^\"]*)\" month of birth$")
    public void iSelectMonthOfBirth(String month)  {
        new RegisterPage().setMonthofBirth(month);
    }

    @And("^I select \"([^\"]*)\" year of birth$")
    public void iSelectYearOfBirth(String year)  {
        new RegisterPage().setYearofbirth(year);
    }
}
