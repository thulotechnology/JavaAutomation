package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class WorkonAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://webdriveruniversity.com/");
        String value = driver.findElement(By.xpath("//*[@id=\"datepicker\"]/div/div[1]/h1")).getText();
        System.out.println(value);
    }
}
