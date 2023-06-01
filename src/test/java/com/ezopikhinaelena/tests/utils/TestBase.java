package com.ezopikhinaelena.tests.utils;

import com.codeborne.selenide.Configuration;
import com.ezopikhinaelena.pages.CheckResultsWindow;
import com.ezopikhinaelena.pages.RegistrationPage;
import com.ezopikhinaelena.pages.components.CalendarComponent;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    CalendarComponent calendarComponent = new CalendarComponent();
    CheckResultsWindow checkResultsWindow = new CheckResultsWindow();
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadTimeout = 600000;
    }

    @AfterAll
    static void afterAll() {
        Configuration.holdBrowserOpen = true;
    }
}
