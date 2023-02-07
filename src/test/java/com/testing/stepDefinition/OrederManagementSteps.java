package com.testing.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrederManagementSteps {
    @Given("I am on create an account pagee")
    public void iAmOnCreateAnAccountPagee() {
    }

    @When("I enter active account {string} {string} {string} {string} {string}")
    public void iEnterActiveAccount(String Firstname, String Lastname, String Email, String Password, String ConfirmPassword) {
    }

    @And("I click on createe an account")
    public void iClickOnCreateeAnAccount() {
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
    }
}
