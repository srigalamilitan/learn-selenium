package com.putracode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppLocator
{
    public static final Logger logger=Logger.getLogger(AppLocator.class.getName());
    public static void main( String[] args ) throws InterruptedException {
        System.out.println( "Hello AppLocator!" );
        logger.info( "Hello World: Selenium!" );
        final String pathLocalDriver="D:\\selenium\\chrome-driver\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",pathLocalDriver);
        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //open brower chrome and go to URL
        webDriver.get("https://rahulshettyacademy.com/locatorspractice/");
        //find by id
        webDriver.findElement(By.id("inputUsername")).sendKeys("rahul");
        //find by name
        webDriver.findElement(By.name("inputPassword")).sendKeys("wrongpassword");
        //find by class name
        webDriver.findElement(By.className("signInBtn")).click();
        logger.info("Error Message : "+ webDriver.findElement(By.cssSelector("p.error")).getText());
        //find by link name
        webDriver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        // find by X-Path
        webDriver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Krisna Putra");
        // find by css Selector
        webDriver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("krisna@putracode.com");

        webDriver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        webDriver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("krisna@gmail.com");
        webDriver.findElement(By.xpath("//form/input[3]")).sendKeys("0264564545");
        webDriver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        logger.info(webDriver.findElement(By.cssSelector("form p")).getText());
        webDriver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector("#inputUsername")).sendKeys("krisna");
        // find by css selector with keyword asterik (*) like
        webDriver.findElement(By.cssSelector(("input[type*='pass']"))).sendKeys("rahulshettyacademy");
        webDriver.findElement(By.id("chkboxOne")).click();
        // using contains java
        webDriver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        webDriver.quit();
    }
}
