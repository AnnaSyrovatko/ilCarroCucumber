package com.ilcarro.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    WebElement homePageTitle;
    public HomePage isHomePageTitleDisplayed() {
        assert isElementDisplayed(homePageTitle);
        return new HomePage(driver);
    }

    @FindBy(css = ".navigation-link:nth-child(6)")
    WebElement loginLink;
    public LoginPage clickOnLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }

    @FindBy(css = ".input-container")
    WebElement inputContainer;
     @FindBy(id = "city")
    WebElement cityInput;

    public HomePage enterCity(String city) {
        click(inputContainer);
        cityInput.sendKeys(city);
        pause(500);
        cityInput.sendKeys(Keys.DOWN);
        pause(500);
        cityInput.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id = "dates")
    WebElement datesInput;
    public HomePage enterDates(String firstDate, String lastDate) {
        click(datesInput);
        String os = System.getProperty("os.name");
        System.out.println("My OS is " + os);

        if (os.startsWith("Mac")){
            datesInput.sendKeys(Keys.COMMAND,"a");
        }else {
            datesInput.sendKeys(Keys.CONTROL,"a");
        }
        datesInput.sendKeys(firstDate + " - " + lastDate);
        datesInput.sendKeys(Keys.ESCAPE);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement yallaButton;
    public HomePage clickOnSearchButton() {
        click(yallaButton);
        return this;
    }

    @FindBy(className = "cars-container")
    WebElement cars;
    public HomePage isSearchResultDisplayed() {
        assert isElementDisplayed(cars);
        return this;
    }

    @FindBy(css = ".navigation-link:nth-child(3)")
    WebElement RentLink;
    public RentOutPage clickOnLetCarWorkLink() {
        click(RentLink);
        return new RentOutPage(driver);
    }
}
