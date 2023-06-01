package com.ezopikhinaelena.pages;

import com.codeborne.selenide.SelenideElement;
import com.ezopikhinaelena.pages.components.CalendarComponent;

import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    private final String FORM_TITLE = "Student Registration Form";
    private final SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderInput = $("#genterWrapper"),
            numberInput = $("#userNumber"),
            subjectInput = $("#subjectsInput"),
            hobbyChoose = $("#hobbiesWrapper"),
            pictureInput = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input"),
            buttonPush = $("#submit");

    public CalendarComponent calendar = new CalendarComponent();

    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }

    public void typeFirstName(String value) {
        firstNameInput.setValue(value);
    }

    public void typeLastName(String value) {
        lastNameInput.setValue(value);
    }

    public void typeEmail(String value) {
        emailInput.setValue(value);
    }

    public void typeGender(String value) {
        genderInput.$(byText(value)).click();
    }

    public void phoneNumber(String value) {
        numberInput.setValue(value);
    }

    public void subjectStudy(String value) {
        subjectInput.setValue(value).pressEnter();
    }

    public void hobbyType(String value) {
        hobbyChoose.$(byText(value)).click();
    }

    public void pictureDownload(String value) {
        pictureInput.uploadFromClasspath(value);
    }

    public void addressType(String value) {
        addressInput.setValue(value);
    }

    public void stateCityType(String state, String city) {
        stateInput.setValue(state).pressEnter();
        cityInput.setValue(city).pressTab();
    }

    public void buttonType() {
        buttonPush.click();
    }

    public void checkResultsValue(String key, String value) {
        $x("//td[text()='" + key + "']").parent()
                .shouldHave(text(value));
    }
}