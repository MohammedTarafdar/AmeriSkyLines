package com.skylines.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

    Properties prop;

    public ConfigProperties(){

        File src = new File("./config/config.properties");


        try {
            FileInputStream fIS = new FileInputStream(src);
            prop = new Properties();
            prop.load(fIS);
        } catch (IOException e) {
            System.out.println("Not able to load config file "+e.getMessage());
        }

    }

    public String getDataFromProperties(String KeyToSearch) {
        return prop.getProperty(KeyToSearch);
    }

    public String getBrowser(){
        return prop.getProperty("browser");
    }

    public String getUrl(){
        return prop.getProperty("url");
    }





}
