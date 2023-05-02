package com.ezopikhinaelena.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadTimeout = 600000;
    }

    @AfterAll
    static void afterAll() {
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Elena");
        $("#lastName").setValue("Bulochkina");
        $("#userEmail").setValue("mail@mail.ru");
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue("9999999999");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1986");
        $(".react-datepicker__month-select").selectOption("September");
        $$(".react-datepicker__day").findBy(text("2")).click();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("photo/ce30ff722e5ec13b8e3fc8eb1d2ffcac.jpeg");
        $("#currentAddress").setValue("Street 1");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressTab();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Elena Bulochkina"));
        $(".table-responsive").shouldHave(text("mail@mail.ru"));
        $(".table-responsive").shouldHave(text("Female"));
        $(".table-responsive").shouldHave(text("9999999999"));
        $(".table-responsive").shouldHave(text("02 September,1986"));
        $$(".table-responsive").findBy(text("Subjects")).shouldHave(text("Computer Science"));
        $$(".table-responsive").findBy(text("Hobbies")).shouldHave(text("Sports, Reading, Music"));
        $(".table-responsive").shouldHave(text("ce30ff722e5ec13b8e3fc8eb1d2ffcac.jpeg"));
        $(".table-responsive").shouldHave(text("Street 1"));
        $(".table-responsive").shouldHave(text("NCR Delhi"));
    }
}
