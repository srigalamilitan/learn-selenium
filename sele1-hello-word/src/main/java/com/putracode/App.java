package com.putracode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final Logger logger=Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        logger.info( "Hello World: Selenium!" );
        final String pathLocalDriver="D:\\selenium\\chrome-driver\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",pathLocalDriver);
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://putracode.com");
        logger.log(Level.INFO,"Title WebSite: {0}",webDriver.getTitle());
        logger.log(Level.INFO,"Current URL : {0}",webDriver.getCurrentUrl());
        webDriver.quit();
    }
}
