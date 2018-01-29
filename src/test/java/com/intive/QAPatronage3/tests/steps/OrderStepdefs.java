package com.intive.QAPatronage3.tests.steps;

import com.intive.QAPatronage3.tests.pages.*;
import com.intive.QAPatronage3.tests.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;


public class OrderStepdefs extends DriverFactory{


    @Given("^I am on login page$")
    public void iAmOnLoginPage() throws Throwable {
        MainPage pageobject = new MainPage(driver);
        pageobject.clickButton();
    }

    @When("^I enter login ([^\"]*)$")
    public void iEnterLoginLogin(String login) throws Throwable {
        SignInPage pageobject = new SignInPage(driver);
        pageobject.enterLogin(login);
    }

    @And("^I enter password ([^\"]*)$")
    public void iEnterPasswordPassword(String password) throws Throwable {
        SignInPage pageobject = new SignInPage(driver);
        pageobject.enterPassword(password);
    }

    @Then("^I am on account page$")
    public void iAmOnAccountPage() throws Throwable {
        MyAccountPage pageobject = new MyAccountPage(driver);
        pageobject.checkPage();
    }
    @And("^I can go to My Personal Information Section$")
    public void iCanGoToMyPersonalInformationSection() throws Throwable {
        MyAccountPage pageobject = new MyAccountPage(driver);
        pageobject.clickPersonalInformation();
    }

    @And("^I can see can see the details view of the account: ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*)$")
    public void iCanSeeCanSeeTheDetailsViewOfTheAccount(String firstname, String lastname, String email, String day, String month, String year) throws Throwable {
        MyPersonalInfoPage pageobject = new MyPersonalInfoPage(driver);
        pageobject.checkFirstName(firstname);
        pageobject.checkLastName(lastname);
        pageobject.checkEmail(email);
        pageobject.checkDay(day);
        pageobject.checkMonth(month);
        pageobject.checkYear(year);
        destroyDriver();
    }

    @When("^I enter incorrect login ([^\"]*)$")
    public void iEnterIncorrectLoginIncorrectLogin(String incorrectLogin) throws Throwable {
        SignInPage pageobject = new SignInPage(driver);
        pageobject.enterLogin(incorrectLogin);
    }

    @And("^I enter incorrect password ([^\"]*)$")
    public void iEnterIncorrectPasswordIncorrectPassword(String incorrectPassword) throws Throwable {
        SignInPage pageobject = new SignInPage(driver);
        pageobject.enterPassword(incorrectPassword);
    }

    @Then("^I see the error message ([^\"]*)$")
    public void iSeeTheErrorMessageMessage(String message) throws Throwable {
        SignInPage pageobject = new SignInPage(driver);
        pageobject.checkErrorMessage(message);
        //driver.close();
        destroyDriver();
    }
    @Given("^I am authenticate user with ([^\"]*), ([^\"]*)$")
    public void iAmAuthenticateUser(String login, String password) throws Throwable {
        MainPage pageobject = new MainPage(driver);
        pageobject.clickButton();
        SignInPage pageobject1 = new SignInPage(driver);
        pageobject1.enterLogin(login);
        pageobject1.enterPassword(password);
        MyAccountPage pageobject2 = new MyAccountPage(driver);
        pageobject2.clickWomen();
    }

    @When("^I choose a product$")
    public void iChooseAProduct() throws Throwable {
        ProductsPage pageobject = new ProductsPage(driver);
        pageobject.chooseBlouse();
        driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));
        Thread.sleep(3000);
        driver.findElement(By.tagName("img")).click();
        driver.switchTo().defaultContent();
    }

    @And("^I go through all the steps$")
    public void iGoThroughAllTheSteps() throws Throwable {
        ProductsPage pageobject = new ProductsPage(driver);
        pageobject.clickAddToCart();
        OrderStepsPage pageobject1 = new OrderStepsPage(driver);
        pageobject1.goThroughOrderSteps();
    }

    @Then("^I can verify the order$")
    public void iCanVerifyTheOrder() throws Throwable {
        MainPage pageobject = new MainPage(driver);
        pageobject.clickAccountButton();
        MyAccountPage pageobject1 = new MyAccountPage(driver);
        pageobject1.checkOrderHistory();
        destroyDriver();
    }


}
