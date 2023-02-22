package org.example.DZ7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LisenerTest extends AbstractTest {
    @Test
    void test(){
        try {
            getWebDriver().findElement(By.xpath("//a[contains(text(),'Войти')]"));
        } catch (NoSuchElementException e){
            Util.makeScreenshot(getWebDriver(),
                    "failure- org.example.DZ6.EventListenerTest.test" + System.currentTimeMillis() + ".png");
        }

    }


    @Test
    void test2(){
        WebElement webElement = getWebDriver().findElement(By.xpath("//a[contains(text(),'Войти')]"));
        webElement.click();

    }
}
