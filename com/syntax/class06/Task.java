package com.syntax.class06;
/*
Task
Navigate to http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php
verify the header text Syntax Technologies -......
verify enroll today button is enabled
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static String url = "http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.switchTo().frame("FrameOne");
        WebElement frameHeader = driver.findElement(By.xpath("//a[text() = 'SYNTAX TECHNOLOGIES']"));
        boolean isHeaderDisplayed=frameHeader.isDisplayed();
        System.out.println("Is header displayed "+isHeaderDisplayed);

        driver.switchTo().defaultContent();
        WebElement secondFrame=driver.findElement(By.xpath("//iframe[@name='FrameTwo']"));
        driver.switchTo().frame(secondFrame);
        WebElement enrollTodayButton=driver.findElement(By.linkText("Enroll Today"));
        boolean isEnrolledTodayEnabled=enrollTodayButton.isEnabled();
        System.out.println("Is Enroll Today enabled "+isEnrolledTodayEnabled);
    }
}
