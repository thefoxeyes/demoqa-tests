package com.ezopikhinaelena.tests.utils;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadTimeout = 600000;
    }

    @AfterAll
    static void afterAll() {
        Configuration.holdBrowserOpen = true;
    }
}
