package com.ezopikhinaelena.tests.utils;

import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();
    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            currentAddress = faker.friends().quote(),
            genterWrapper = faker.demographic().sex(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            year = String.valueOf(faker.number().numberBetween(1900, 2023)),
            day = String.valueOf(faker.number().numberBetween(1, 28)),
            month = faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
            subject = faker.options().option("Math", "Chemistry", "Computer Science", "Commerce", "Economics"),
            hobbiesWrapper = faker.options().option("Sports", "Reading", "Music");
}