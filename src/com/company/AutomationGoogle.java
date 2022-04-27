package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Random;

public class AutomationGoogle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Navigate to the url
        driver.get("https://www.google.com");

// Get boolean value for is element display
        boolean isButtonVisible = driver.findElement(By.cssSelector("[name='login']")).isDisplayed();
        System.out.println(isButtonVisible);

//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//        driver.get("https://google.com");
//
//        System.out.println("Title is "+ driver.getTitle());
//
//        Random rand = new Random();
//        int randomNum = rand.nextInt(10000, 300000);
//        String value = randomNum + "";
//        driver.findElement(By.name("q")).sendKeys(value);
//        driver.findElement(By.name("q")).submit();
//
//        System.out.println(driver.findElement(By.name("q")).getAttribute("value"));

    }
}
