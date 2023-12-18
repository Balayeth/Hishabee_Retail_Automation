package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Scanner;

public class Customer {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.Chrome.driver","C:\\Users\\Easy\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Scanner input=new Scanner(System.in);
        String Name,Number;

        System.out.println("Enter Name:");
        Name=input.nextLine();
        System.out.println("Enter Number:");
        Number=input.nextLine();
        String Test_Case_01="Verify that user can create customer successfully";

        driver.manage().window().maximize();
        driver.get("https://web.hishabee.business/sign-in");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("01861509931");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='bg-light p-2']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//button[contains(text(),'Select Shop')]")).click();
        driver.findElement(By.xpath("//i[@class='ri-menu-line wrapper-menu']")).click();
        driver.findElement(By.xpath("//a[@href='/customer']")).click();
        driver.findElement(By.xpath("//a[@href='/customer/create']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='iq-menu-bt-sidebar']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(Name);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Number);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("balayeth@hishabee.io");
        driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys("Dhaka,Bangladesh");
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("window.scroll(0,900)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(9000);

        String New_Name,New_Number;

        System.out.println("Enter Name:");
        New_Name=input.nextLine();
        System.out.println("Enter Number:");
        New_Number=input.nextLine();

        String Test_Case_02="Verify that user can edit a customer successfully";
        driver.findElement(By.xpath("//input[@placeholder='search']")).sendKeys(Name);
        driver.findElement(By.xpath("(//th[@scope='row'])[1]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='নাম']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='নাম']")).sendKeys(New_Name);
        driver.findElement(By.xpath("//input[@type='number']")).clear();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(New_Number);
        driver.findElement(By.xpath("//input[@type='email']")).clear();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hasan.ali@hishabee.io");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("1219,Dhaka");
        scroll.executeScript("window.scroll(0,900)");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//input[@placeholder='search']")).sendKeys(Name);
        driver.close();

    }
}
