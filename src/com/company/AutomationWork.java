package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://bishworaj100.github.io/reactloginapp/");

        WebElement username = driver.findElement(By.id("mui-1"));
        username.sendKeys("bivor");

        WebElement password = driver.findElement(By.id("mui-2"));
        password.sendKeys("password12123");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/button"));
        button.click();




    }
}
