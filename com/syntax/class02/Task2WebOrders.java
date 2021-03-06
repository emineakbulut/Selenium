package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2WebOrders {
    /*
    Navigate to
    http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
    login
    get title and verify
    logout
    close browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();

        String actualTitle=driver.getTitle();
        String expectedTitle="Web Orders";
        if (actualTitle.equalsIgnoreCase(expectedTitle)) System.out.println("Title match");
        else {
            System.out.println("Title doesn't match");
        }

        driver.findElement(By.partialLinkText("Logout")).click();
        Thread.sleep(2000);
        driver.quit();
    }
    }

