package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import com.ilcarro.pages.RentOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.Random;

import static com.ilcarro.pages.BasePage.driver;

public class RentOutSteps {

    @And("User clicks on 'Let car work' link")
    public void click_on_let_car_work_link(){
        new HomePage(driver).clickOnLetCarWorkLink();
    }
    @And("User enters location")
    public void enter_location(){
        new RentOutPage(driver).enterLocation("Haifa");
    }
    @And("User enters manufacture")
    public void enter_manufacture(){
        new RentOutPage(driver).enterManufacture("Volvo");
    }
    @And("User enters model")
    public void enter_model(){
        new RentOutPage(driver).enterModel("XC60");
    }
    @And("User enters year")
    public void enter_year(){
        new RentOutPage(driver).enterYear("2017");
    }
    @And("User selects fuel")
    public void enter_fuel(){
        new RentOutPage(driver).enterFuel("Petrol");
    }
    @And("User enters seats")
    public void enter_seats(){
        new RentOutPage(driver).enterSeats("5");
    }
    @And("User enters car class")
    public void enter_car_class(){
        new RentOutPage(driver).enterCarClass("D");
    }
    @And("User enters car registration number")
    public void enter_car_registration_number(){
        int min = 100000;
        int max = 999999;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;

        new RentOutPage(driver).enterRegistrationNumber(String.valueOf(i));
    }
    @And("User enters price")
    public void enter_price(){
        new RentOutPage(driver).enterPrice("40.99");
    }
    @And("User click on Submit button")
    public void click_on_submit_button(){
        new RentOutPage(driver).clickSubmitButton();
    }
    @Then("User verifies Car is added")
    public void verifies_car_added_message(){
        new RentOutPage(driver).isCarAdded("added successful");
    }



}
