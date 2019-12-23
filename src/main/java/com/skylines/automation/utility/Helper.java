package com.skylines.automation.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Helper {


    public void captureScreenShot(WebDriver driver){

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(src, new File("./screenShorts/Login.png"));
        }
        catch (IOException e){
            System.out.println("Unable to capture screenshot "+ e.getMessage());
        }

    }


    public void getCurrentDateTime(){

    }



}
