package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Rectangle;

import javax.imageio.ImageIO;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://webdriveruniversity.com/Datepicker/index.html");

        WebElement myEelement = driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input"));
        myEelement.sendKeys("01-27-1997");

        Thread.sleep(5000);
        WebElement speeficDate = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[3]"));
        speeficDate.click();



    }

}
