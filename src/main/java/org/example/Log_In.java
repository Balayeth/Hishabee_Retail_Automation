package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Log_In {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver","C:\\Users\\Easy\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://web.hishabee.business/sign-in");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//label[@for='btn-check']")).click();
        driver.findElement(By.xpath("//label[@for='btn-check-2']")).click();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("01861509931");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='bg-light p-2']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//button[contains(text(),'Select Shop')]")).click();
        Thread.sleep(3000);
        driver.close();


    }
    
}
