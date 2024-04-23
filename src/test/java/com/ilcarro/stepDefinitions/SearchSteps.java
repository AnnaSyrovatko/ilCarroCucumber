package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class SearchSteps {

    @And("User enters city")
    public void enter_city(){
        new HomePage(driver).enterCity("Tel Aviv");
    }
    @And("User enters dates")
    public void enter_dates(){
        new HomePage(driver).enterDates("4/24/2024", "4/27/2024");
    }
    @And("User clicks on search button")
    public void click_on_search_button(){
        new HomePage(driver).clickOnSearchButton();
    }
    @Then("User verifies search results are displayed")
    public void verify_search_result(){
        new HomePage(driver).isSearchResultDisplayed();
    }



}
