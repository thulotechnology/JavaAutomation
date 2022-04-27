package com.company;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        String producttoFind = "rani tikki";
        WebDriver driver = new ChromeDriver();
        driver.get("https://bombaycurrync.com/contact-us/");

        System.out.println("Website Title: "+driver.getTitle());

        driver.findElement(By.id("form-field-name")).sendKeys("Hello ");

        // Find Source of Website
        String allPageSource = driver.getPageSource();

        String url = driver.getCurrentUrl();
        System.out.println("Website URL is "+url);
        if(url.equals("https://bombaycurrync.com/menu")){
            System.out.println("Website is on the right path.");
        }else{
            System.out.println("Something Went Wrong");
        }
        System.out.println(driver.findElement(By.xpath("//*[@id=\"post-14\"]/div/div/div/section[3]/div")).getAttribute("class"));

        // Full Screen
       // driver.manage().window().fullscreen();

        // Maximize
        //driver.manage().window().maximize();

        // Minimize
      //  driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        Thread.sleep(5000);
        driver.quit();






//
//       if(allPageSource.contains(producttoFind)){
//           System.out.println("Product Found");
//       }else{
//           System.out.println("Product Not Found");
//       }

    }
}
