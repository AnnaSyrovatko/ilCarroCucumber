package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RentOutPage extends BasePage{
    public RentOutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".input-container")
    WebElement locationContainer;
    @FindBy(id = "pickUpPlace")
    WebElement locationInput;
    public RentOutPage enterLocation(String city) {
        click(locationContainer);
        locationInput.sendKeys(city);
        pause(500);
        locationInput.sendKeys(Keys.DOWN);
        pause(500);
        locationInput.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id = "make")
    WebElement manufactureInput;
    public RentOutPage enterManufacture(String manufacture) {
        manufactureInput.sendKeys(manufacture);
        return this;
    }

    @FindBy(id = "model")
    WebElement modelInput;
    public RentOutPage enterModel(String model) {
        modelInput.sendKeys(model);
        return this;
    }

    @FindBy(id = "year")
    WebElement yearInput;
    public RentOutPage enterYear(String year) {
        yearInput.sendKeys(year);
        return this;
    }

    @FindBy(id = "fuel")
    WebElement fuelInput;
    public RentOutPage enterFuel(String fuel) {
        fuelInput.sendKeys(fuel);
        return this;
    }
    @FindBy(id = "seats")
    WebElement seatsInput;
    public RentOutPage enterSeats(String seats) {
        seatsInput.sendKeys(seats);
        return this;
    }
    @FindBy(id = "class")
    WebElement classInput;
    public RentOutPage enterCarClass(String carClass) {
        classInput.sendKeys(carClass);
        return this;
    }
    @FindBy(id = "serialNumber")
    WebElement serialNumberInput;
    public RentOutPage enterRegistrationNumber(String serialNumber) {
        serialNumberInput.sendKeys(serialNumber);
        return this;
    }

    @FindBy(id = "price")
    WebElement priceInput;
    public RentOutPage enterPrice(String price) {
        priceInput.sendKeys(price);
        return this;
    }
    @FindBy(css = "[type='submit']")
    WebElement rentOutButton;
    public RentOutPage clickSubmitButton() {
        rentOutButton.click();
        return this;
    }

    @FindBy(css = ".message")
    WebElement confirm;
    public RentOutPage isCarAdded(String message) {
        assert confirm.getText().contains(message);
        return this;
    }
}
