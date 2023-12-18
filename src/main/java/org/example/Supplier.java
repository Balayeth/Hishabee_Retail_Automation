package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Supplier {
    public static void main(String[] args) {
        System.setProperty("WebDriver.Chrome.driver","C:\\Users\\Easy\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://web.hishabee.business/sign-in");
        
    }
}
