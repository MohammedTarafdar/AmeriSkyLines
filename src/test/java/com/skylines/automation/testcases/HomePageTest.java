package com.skylines.automation.testcases;

import com.skylines.automation.pages.BasePage;
import com.skylines.automation.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {

    @Test
    public void loginTest(){

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.doLogin(excel.getStringData("HomePage",0,0), excel.getStringData("HomePage",0,1), excel.getStringData("HomePage",0,2));
        helper.captureScreenShot(driver);

    }




}
