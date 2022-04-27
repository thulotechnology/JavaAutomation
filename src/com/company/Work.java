package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;

public class Work {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement firstNamme = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
        firstNamme.sendKeys("Bimal");

        WebElement lastName =  driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
        lastName.sendKeys("Sharma");

        WebElement button = driver.findElement(By.xpath("find and add here"));
        button.click();









    }
}
