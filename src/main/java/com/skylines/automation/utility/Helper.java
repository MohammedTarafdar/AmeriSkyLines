package com.skylines.automation.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {


    public void captureScreenShot(WebDriver driver){

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(src, new File("./screenShorts/SS: "+ getCurrentDateTime() + ".png"));
        }
        catch (IOException e){
            System.out.println("Unable to capture screenshot "+ e.getMessage());
        }

    }


    public String getCurrentDateTime(){

        DateFormat customForm = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
        Date currentDate = new Date();
        return customForm.format(currentDate);

    }



}
