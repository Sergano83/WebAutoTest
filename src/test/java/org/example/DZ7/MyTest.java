package org.example.DZ7;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;


@Story("История")

public class MyTest extends AbstractTest{





        @Test
        @DisplayName("Сделай скрин")
        @Description("Тест создает скрин")
        @Link("https://www.livejournal.com/")
        @Severity(SeverityLevel.BLOCKER)
        void testFalse() throws InterruptedException, IOException {
            Thread.sleep(1000);
            File file = Util.makeScreenshot(getWebDriver(),"failure- org.example.DZ7.MyTest.test" + System.currentTimeMillis() + ".png");
            saveScreenshot(Files.readAllBytes(file.toPath()));
            Assertions.assertTrue(true);
        }

        @Step("Степ 1")
        @Attachment(value = "Page screenshot", type = "image/png")
        public byte[] saveScreenshot(byte[] screenShot) {
            return screenShot;
        }



        @Feature("ТЕСТ 1")
        @Test
        void testTrue2(){
            Assertions.assertTrue(true);
        }

        @Feature("ТЕСТ 1")
        @Test
        void testTrue3(){
            Assertions.assertTrue(true);
        }

    }

