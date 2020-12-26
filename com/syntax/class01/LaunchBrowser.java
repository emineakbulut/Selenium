package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Work\\eclipse-workspace\\TestNG\\drivers\\chromedriver.exe");
                                                               //which driver we using and the path..webdriver.chrome.driver is static.
        WebDriver driver=new ChromeDriver();                  //--->that means we are launching the browser
                                                            //we need to create an object of chrome driver--since we created an obj of the chrome driver
                                                           //this means this driver will perform the actions on the web page
                                                          // WebDriver is an interface
        driver.get("https://syntaxtechs.com/");
        String url = driver.getCurrentUrl();
        System.out.println(url);                        // getting current url
        String title = driver.getTitle();              // getting title of the page
        System.out.println(title);
                                                        //title for this page is "Home-Syntax Technologies" to get the title--->
    }
}
