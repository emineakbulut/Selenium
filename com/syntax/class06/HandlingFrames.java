package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement textBox=driver.findElement(By.id("name"));
        textBox.sendKeys("2020 sucks!!!");


        driver.switchTo().defaultContent();//switching the focus back to main page
        WebElement alertButton= driver.findElement(By.id("alert"));
        alertButton.click();
    }
}
