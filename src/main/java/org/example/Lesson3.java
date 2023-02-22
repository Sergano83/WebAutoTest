package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Lesson3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com/");


// Тест 1.
// Авторизация на сайте "Живой журнал"

        WebElement webElement1 = driver.findElement (By.xpath("//a[contains(text(),'Войти')]"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath("//input[@id='user']"));
        webElement2.click();
        webElement2.sendKeys("serenad0");

        WebElement webElement3 = driver.findElement(By.xpath("//input[@id ='lj_loginwidget_password']"));
        webElement3.click();
        webElement3.sendKeys("Daneris0");

        WebElement webElement4 = driver.findElement(By.name("action:login"));
        webElement4.click();

//Тест 2.
// Написать комментарий к первому посту на сайте "Живой журнал"

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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

//Тест 3.
// Поставить лайк к первому посту на сайте "Живой журнал"

        WebElement webElement13 = driver.findElement(By.xpath("//a[@class='post-card__link']"));
        webElement13.click();

        WebElement webElement14 = driver.findElement(By.xpath("//*[@class='svgicon svgicon--heart']"));
        webElement14.click();

        WebElement webElement15 = driver.findElement(By.xpath("//*[@class='s-logo-title s-logo-title']"));
        webElement15.click();

//Тест 4.
//Добавить а избронное первый пост на сайте "Живой журнал"

        WebElement webElement5 = driver.findElement(By.xpath("//a[@class='post-card__link']"));
        webElement5.click ();

        WebElement webElement6 = driver.findElement(By.xpath("//*[@class='svgicon svgicon--bookmark']"));
        webElement6.click();

        WebElement webElement7 = driver.findElement(By.xpath("//*[@class='s-logo-title s-logo-title']"));
        webElement7.click();



    }
}
