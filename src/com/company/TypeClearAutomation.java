package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TypeClearAutomation {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

        WebDriver driver = new ChromeDriver();
     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");
        WebElement searchBox =   driver.findElement(By.name("qr"));
        searchBox.sendKeys("Hello Automation");
        Thread.sleep(3000);
        searchBox.clear();
        Thread.sleep(3000);
        searchBox.sendKeys("Hello Google");

    }
}
