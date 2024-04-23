package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {

    @And("User clicks on Login link")
    public void click_on_Login_link(){
        new HomePage(driver).clickOnLoginLink();
    }
    @And("User enters valid data")
    public void enters_valid_data(){
        new LoginPage(driver).enterData("shadow_hawk@test.com","Gx6zEUNKw!");
    }
    @And("User clicks on Yalla button")
    public void click_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();
    }

    @Then("User verifies Success Message is displayed")
    public void verifies_Success_Message(){
        new LoginPage(driver).isMessageDisplayed("Logged in success");
    }
}
