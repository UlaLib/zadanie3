package com.intive.QAPatronage3.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class MyPersonalInfoPage {
    private WebDriver driver;

    @FindBy(how = How.ID, using = "firstname")
    private WebElement FirstName;
    @FindBy(how = How.ID, using = "lastname")
    private WebElement LastName;
    @FindBy(how = How.ID, using = "email")
    private WebElement Email;
    @FindBy(how = How.ID, using = "days")
    private WebElement Days;
    @FindBy(how = How.ID, using = "months")
    private WebElement Months;
    @FindBy(how = How.ID, using = "years")
    private WebElement Years;

    public MyPersonalInfoPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void checkFirstName(String firstname){
        String j = FirstName.getAttribute("value");
        System.out.println(j);
        assertEquals(firstname,j);
    }
    public void checkLastName(String lastname){
        String j = LastName.getAttribute("value");
        System.out.println(j);
        assertEquals(lastname,j);
    }
    public void checkEmail(String email){
        String j = Email.getAttribute("value");
        System.out.println(j);
        assertEquals(email,j);
    }
    public void checkDay(String day){
        String j = Days.getAttribute("value");
        System.out.println(j);
        assertEquals(day,j);
    }
    public void checkMonth(String month){
        String j = Months.getAttribute("value");
        System.out.println(j);
        assertEquals(month,j);
    }
    public void checkYear(String year){
        String j = Years.getAttribute("value");
        System.out.println(j);
        assertEquals(year,j);
    }

}
