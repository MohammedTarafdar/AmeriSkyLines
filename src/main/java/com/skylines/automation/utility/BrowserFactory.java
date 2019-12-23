package com.skylines.automation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    //Framework by Mukesh Otwani.

    public static WebDriver launchBrowser(WebDriver driver, String browserName, String url){

        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
            driver = new ChromeDriver();
        }
        else if (browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");
            driver = new FirefoxDriver();
        }
        else if (browserName.equals("IE")){
            System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer");
            driver = new InternetExplorerDriver();
        }
        else {
            System.out.println("Sorry we don't support this driver");
        }

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;

    }

    public static void quitBrowser(WebDriver driver){

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }
        driver.quit();
    }



}
