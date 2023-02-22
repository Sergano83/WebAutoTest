package org.example.DZ6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CommentsPage extends AbstractPage {
    @FindBy(xpath = "//a[contains(text(),'Войти')]")
    private WebElement enter;

    @FindBy(xpath = "//input[@id='user']")
    private WebElement login;

    @FindBy(xpath = "//input[@id ='lj_loginwidget_password']")
    private WebElement password;


    @FindBy(name = "action:login")
    private WebElement submit;


    @FindBy(xpath = "//a[@class='post-card__link']")
    private WebElement card;

    @FindBy(xpath = "//*[@class='svgicon svgicon--comments']")
    private WebElement comments;

    @FindBy(xpath = "//div[@class = 'b-updateform-rte']/div/div")
    private WebElement text;

    @FindBy(xpath = "//div[@class='b-watering-submit']")
    private WebElement textsubmit;


    public CommentsPage(WebDriver driver) {
        super(driver);
    }

    public void commIn(String login, String password,String text ) {

        Actions loginIn = new Actions(getDriver());
        loginIn
                .click(this.enter)
                .click(this.login)
                .sendKeys(login)
                .click(this.password)
                .sendKeys(password)
                .click(this.submit)
                .click(this.card)
                .click(this.comments)
                .click(this.text)
                .sendKeys(text)
                .click(textsubmit)
                .build()
                .perform();
    }
}
