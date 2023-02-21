package org.example.DZ6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends AbstractPage{
    @FindBy(xpath = "//a[contains(text(),'Войти')]")
    private WebElement enter;

    @FindBy(xpath = "//input[@id='user']")
    private WebElement login;

    @FindBy(xpath = "//input[@id ='lj_loginwidget_password']")
    private WebElement password;


    @FindBy(name = "action:login")
    private WebElement submit;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginIn(String login, String password){

        Actions loginIn = new Actions(getDriver());
        loginIn
                .click(this.enter)
                .pause(5000)
                .sendKeys(this.login,login)
                .click(this.password)
                .sendKeys(password)
                .click(this.submit)
                .build()
                .perform();
    }



}
