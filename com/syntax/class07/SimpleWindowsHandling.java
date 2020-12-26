package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowsHandling {
    public static String url = "https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
         String mainPageHandle=driver.getWindowHandle();
        System.out.println("Parent handling "+mainPageHandle);//output-->CDwindow-D57CF5D1525A61071BD9DF5EAC8267E2
        WebElement helpLink=driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles = driver.getWindowHandles();//will automatically return LinkedHashSet
        System.out.println(allWindowHandles.size());//output-->2
        Iterator<String> it=allWindowHandles.iterator();//in order to iterate through window
        mainPageHandle= it.next();//stepping forward to main page
        String childHandle= it.next();//Stepping forward to child
        System.out.println("Child handling "+childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle);//switching back to parent window


    }
}
