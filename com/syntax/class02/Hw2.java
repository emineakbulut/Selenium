package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    /*
    navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://fb.com");
        driver.findElement(By.id("email")).sendKeys("Emine");
        driver.findElement(By.id("pass")).sendKeys("00000");
        driver.findElement(By.name("login")).click();
        Thread.sleep(5000);
        driver.close();

    }
}
