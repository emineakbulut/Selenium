package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    /*
    Homework
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Emina");
        driver.findElement(By.name("customer.lastName")).sendKeys("Eris");
        driver.findElement(By.id("customer.address.street")).sendKeys("Blackford Ave");
        driver.findElement(By.name("customer.address.city")).sendKeys("Manisa");
        driver.findElement(By.id("customer.address.state")).sendKeys("Turkiye");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("99117");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("99112233");
        driver.findElement(By.id("customer.ssn")).sendKeys("012233445566");
        driver.findElement(By.id("customer.username")).sendKeys("Zeris");
        driver.findElement(By.id("customer.password")).sendKeys("pss123");
        driver.findElement(By.name("repeatedPassword")).sendKeys("pss123");
        driver.findElement(By.className("button")).click();
        Thread.sleep(5000);
        driver.close();


    }
}
