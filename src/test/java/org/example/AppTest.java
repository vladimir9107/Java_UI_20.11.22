package org.example;

import static org.junit.Assert.assertTrue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options =new ChromeOptions();
        options.addArguments("start-maximized"); // открытие полноэкранного формата
        options.addArguments("--incognito"); // открытие страницы в режиме инкогнито
        options.addArguments("disable-popular-blocking"); //блокировка всплывающих окон

           WebDriver driver = new ChromeDriver(options);
           driver.get("https://www.dns-shop.ru/");

       WebElement webElement = driver.findElement(By.xpath("//*[@id=\"homepage-desktop-menu-wrap\"]/div/div[8]/div[1]/a"));
       webElement.click();

       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/a[2]")).click();
       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/a[3]")).click();

        driver.quit();

    }


}

