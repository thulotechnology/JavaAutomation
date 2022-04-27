package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.time.Duration;

public class AllItems {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://webdriveruniversity.com/Page-Object-Model/index.html");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[2]/a"));
        button.click();

        List<WebElement> allList = driver.findElements(By.className("sub-heading"));
        int count =0;
        for(WebElement e: allList){
            System.out.println(e.getText());
            count++;
        }

        System.out.println("Total Items: "+count);

    }
}
