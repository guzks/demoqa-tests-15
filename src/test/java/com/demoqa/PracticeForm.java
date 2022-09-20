package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import javax.swing.plaf.basic.BasicBorders;

import java.io.File;
import java.nio.file.Files;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeForm {
    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Bananov");
        $("#lastName").setValue("Norman");
        $("#userEmail").setValue("banorman@demoqa.com");
        $("#gender-radio-1").doubleClick();
        $("#userNumber").setValue("8909909909");
        $("#dateOfBirthInput").click();
        $("[class=react-datepicker__month-select]").click();
        $("[class=react-datepicker__month-select]").selectOption("April");
        $("[class=react-datepicker__year-select]").click();
        $("[class=react-datepicker__year-select]").selectOption("1997");
        $("[class*='react-datepicker__day--021']").click();
        $("#subjectsInput").setValue("History").pressEnter();
       // $("#hobbies-checkbox-2").click();
        File attach = new File("src/test/java/resources/1.PNG");
        $("#uploadPicture").uploadFile(attach);
        $("#currentAddress").setValue("current Address");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Gurgaon")).click();
    }
}