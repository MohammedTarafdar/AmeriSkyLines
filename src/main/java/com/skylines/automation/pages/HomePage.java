package com.skylines.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver localDriver){
        this.driver = localDriver;
    }


    @FindBy(name="loginId") WebElement user_name;
    @FindBy(name="lastName") WebElement last_name;
    @FindBy(name="password") WebElement pass_word;
    @FindBy(name="_button_go") WebElement log_in;


    public void doLogin(String userName, String lastName, String passWord) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }

        user_name.sendKeys(userName);
        last_name.sendKeys(lastName);
        pass_word.sendKeys(passWord);
        log_in.click();

    }
}
