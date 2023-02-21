package org.example.DZ6;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Lesson6Test extends AbstractTest{
    @Test
    void loginIn(){
       LoginPage loginPage =new LoginPage(getWebDriver());
       loginPage.loginIn("serenad0","Daneris0");

    }

    @Test
    void comments (){
        CommentsPage commentsPage = new CommentsPage(getWebDriver());
        commentsPage.commIn("serenad0","Daneris0","Хороший пост");
    }


}


