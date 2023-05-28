package com.ezopikhinaelena.tests;

import com.ezopikhinaelena.tests.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.ezopikhinaelena.tests.TestData.firstName;
import static com.ezopikhinaelena.tests.TestData.lastName;

public class TextBoxWithPageObjectTests extends TestBase{
    RegistrationPage registrationPage = new RegistrationPage();

        @Test
    void fillFormTest() {
        registrationPage.openPage();

        registrationPage.typeFirstName(firstName)
                        .typeLastName(lastName);

        $("#userEmail").setValue("mail@mail.ru");
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue("9999999999");
        registrationPage.calendar.setDate("1986", "September", "30");

        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("photo/ce30ff722e5ec13b8e3fc8eb1d2ffcac.jpeg");
        $("#currentAddress").setValue("Street 1");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressTab();
        $("#submit").click();

        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
        registrationPage.checkResultsValue("Student Name", firstName + " " + lastName);
    }
}
