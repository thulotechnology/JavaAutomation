package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class AliBaba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter item do you want to find: ");
        String userinput = sc.nextLine();
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.alibaba.com/Consumer-Electronics_p44?spm=a2700.8293689.scGlobalHomeHeader.390.49a767afLtFHIz");

        List<WebElement> items = driver.findElements(By.tagName("span"));
        String text ="";

        for(WebElement e : items){
            text+=e.getText();
        }

        if(text.toLowerCase().contains(userinput.toLowerCase())){
            System.out.println("Item Found");
        }else{
            System.out.println("Item Not Found");
        }

    }
}
