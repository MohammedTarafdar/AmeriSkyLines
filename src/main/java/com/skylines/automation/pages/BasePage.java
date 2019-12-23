package com.skylines.automation.pages;

import com.skylines.automation.utility.BrowserFactory;
import com.skylines.automation.utility.ConfigProperties;
import com.skylines.automation.utility.ExcelDataProvider;
import com.skylines.automation.utility.Helper;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BasePage {

    //Framework by Mukesh Otwani.

    public WebDriver driver;
    public ExcelDataProvider excel;
    public ConfigProperties config;
    public Helper helper;


    @BeforeSuite
    public void setUpSuite(){

        excel = new ExcelDataProvider();
        config = new ConfigProperties();
        helper = new Helper();
    }


    @BeforeClass
    public void setUp(){

        driver = BrowserFactory.launchBrowser(driver, config.getBrowser(), config.getUrl());
    }

    @AfterMethod
    public void tearDownMethod(ITestResult result){
        if(result.getStatus() == ITestResult.FAILURE){
            helper.captureScreenShot(driver);
        }
    }

    @AfterClass
    public void tearDown(){
        BrowserFactory.quitBrowser(driver);
    }
}
