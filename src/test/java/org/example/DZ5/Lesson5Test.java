package org.example.DZ5;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Lesson5Test extends AbstractTest{



    @Test

    void authorization() throws InterruptedException {

        Actions search = new Actions(getDriver());

        search.click(getDriver().findElement(By.xpath("//a[contains(text(),'Войти')]")))
                .sendKeys(getDriver().findElement(By.xpath("//input[@id='user']")),"serenad0")
                .sendKeys(getDriver().findElement(By.xpath("//input[@id ='lj_loginwidget_password']")),"Daneris0")
                .click(getDriver().findElement(By.name("action:login")))
                .build()
                .perform();

        Thread.sleep(10000);

    }
    @Test
    void comments()  {
        WebElement webElement8 = driver.findElement(By.xpath("//a[@class='post-card__link']"));
        webElement8.click ();

        WebElement webElement9 = driver.findElement(By.xpath("//*[@class='svgicon svgicon--comments']"));
        webElement9.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement webElement10 = driver.findElement(By.xpath("//div[@class = 'b-updateform-rte']/div/div"));
        webElement10.click();
        webElement10.sendKeys("Хороший пост");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement webElement11 = driver.findElement(By.xpath("//div[@class='b-watering-submit']"));
        webElement11.click();

        WebElement webElement12 = driver.findElement(By.xpath("//*[@class='s-logo-title s-logo-title']"));
        webElement12.click();

    }

    @Test
    void like(){
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement webElement13 = driver.findElement(By.xpath("//a[@class='post-card__link']"));
        webElement13.click();

        WebElement webElement14 = driver.findElement(By.xpath("//*[@class='svgicon svgicon--heart']"));
        webElement14.click();

        WebElement webElement15 = driver.findElement(By.xpath("//*[@class='s-logo-title s-logo-title']"));
        webElement15.click();
    }

    @Test
    void elected (){
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement webElement5 = driver.findElement(By.xpath("//a[@class='post-card__link']"));
        webElement5.click ();

        WebElement webElement6 = driver.findElement(By.xpath("//*[@class='svgicon svgicon--bookmark']"));
        webElement6.click();

        WebElement webElement7 = driver.findElement(By.xpath("//*[@class='s-logo-title s-logo-title']"));
        webElement7.click();
    }

}
