package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import javax.swing.plaf.basic.BasicBorders;

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
        $("[id=firstName]").setValue("Bananov");
        $("[id=lastName]").setValue("Norman");
        $("[id=userEmail]").setValue("banorman@mail.com");
        //$("[gender-radio-1]").selectRadio(s);
        //$(By.name("gender-radio-1")).selectRadio("Male");
        //$(By.name("gender")).setValue("Male");
        //$("[id=gender-radio-1]").click("custom-control-label");
        $("#gender-radio-1").doubleClick();
    }
}