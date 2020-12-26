package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Practising')]")).click();
        //  driver.findElement(By.xpath("//a[text()='Check Box Demo']/preceding-sibling::a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[text()= 'Simple Form Demo'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='Enter message']/following-sibling::input")).sendKeys("Hello");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-default'][1]")).click();
        driver.quit();
    }
    }

