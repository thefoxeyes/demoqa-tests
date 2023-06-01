package com.ezopikhinaelena.tests;

import com.ezopikhinaelena.pages.CheckResultsWindow;
import com.ezopikhinaelena.pages.RegistrationPage;
import com.ezopikhinaelena.pages.components.CalendarComponent;
import com.ezopikhinaelena.tests.utils.TestBase;
import com.ezopikhinaelena.tests.utils.TestData;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    CalendarComponent calendarComponent = new CalendarComponent();
    CheckResultsWindow checkResultsWindow = new CheckResultsWindow();
    TestData testData = new TestData();

    @Test
    void fillFormTest() {
        registrationPage.openPage();
        registrationPage.typeFirstName(testData.firstName);
        registrationPage.typeLastName(testData.lastName);
        registrationPage.typeEmail(testData.userEmail);
        registrationPage.typeGender(testData.genterWrapper);
        registrationPage.phoneNumber(testData.userNumber);
        calendarComponent.setDate(testData.year, testData.month, testData.day);
        registrationPage.subjectStudy(testData.subject);
        registrationPage.hobbyType(testData.hobbiesWrapper);
        registrationPage.pictureDownload("photo/ce30ff722e5ec13b8e3fc8eb1d2ffcac.jpeg");
        registrationPage.addressType(testData.currentAddress);
        registrationPage.stateCityType("NCR", "Delhi");
        registrationPage.buttonType();

        checkResultsWindow.checkTitleWindow();
        checkResultsWindow.checkValue(testData.firstName + " " + testData.lastName);
        checkResultsWindow.checkValue(testData.userEmail);
        checkResultsWindow.checkValue(testData.genterWrapper);
        checkResultsWindow.checkValue(testData.userNumber);
        checkResultsWindow.checkValue(testData.day + " " + testData.month + "," + testData.year);
        checkResultsWindow.checkValueCollection("Subjects", testData.subject);
        checkResultsWindow.checkValueCollection("Hobbies", testData.hobbiesWrapper);
        checkResultsWindow.checkValue("ce30ff722e5ec13b8e3fc8eb1d2ffcac.jpeg");
        checkResultsWindow.checkValue(testData.currentAddress);
        checkResultsWindow.checkValue("NCR Delhi");

        checkResultsWindow.closeButton();
    }
}