package com.company;
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;

public class FindItem {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter item do you want to find: ");
        String userinput = sc.nextLine();

        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bombaycurrync.com/");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"post-6\"]/div/div/div/section[1]/div[4]/div[2]/div/section[2]/div/div/div/div[2]/div/div/a/span/span"));
        button.click();
        Thread.sleep(4000);
        List<WebElement> allItems = driver.findElements(By.className("elementor-price-list-description"));
        ArrayList<String> desc = new ArrayList<String>();

        int count = 0;
        for(WebElement element: allItems){
            if(!element.getText().isEmpty()){
                desc.add(element.getText());
            }
           count++;
        }

        for(String item : desc){
            if(item.contains(userinput)){
                System.out.println(item + " Found on System");
                break;
            }
        }



//        WebElement firstItem = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/main/article/div/div/div/section[2]/div[2]/div/div/section[3]/div/div[1]/div/div[1]/div/ul/li[1]/div/div/span[1]"));
//        System.out.println(firstItem.getText());


    }
}
