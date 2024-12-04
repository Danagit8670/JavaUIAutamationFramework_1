package com.danacimpoacaqa;

import com.danacimpoacaqa.managers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import org.openqa.selenium.WindowType;

public class TestRunner {
    public static void main(String[] args) {

        WebDriver driver = DriverManager.getInstance().getDriver();
        driver.get("https://www.google.com/");

        String theNameOfTheFirstTab = driver.getWindowHandle();

        // Open a new window and navigate to DIEZ page
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://diez.md/");
        // Close the current tab
        driver.close();

        driver.switchTo().window(theNameOfTheFirstTab);
        driver.get("https://www.stiri.md");


        driver.quit();
    }
}
//DriverManager.getInstance().getDriver().quit();

