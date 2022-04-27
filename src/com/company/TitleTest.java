package com.company;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://javaguide.technologychannel.org/");
        String expectedTitle = "Java Guide - Technology Channel";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String automationTitle = driver.getTitle();

        if(expectedTitle.equals(automationTitle)){
            System.out.println("Test Case Passed");
        }else{
            System.out.println("Test Case Failed");
        }

        //driver.close();
    }
}
