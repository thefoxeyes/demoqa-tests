package com.ezopikhinaelena.tests.utils;

import com.github.javafaker.Faker;

import java.util.Random;

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
            hobbiesWrapper = faker.options().option("Sports", "Reading", "Music"),
            state = getRandomState(),
            city = getRandomCity();

    public String getRandomState() {

        Random random = new Random();

        String[] state = new String[]{"NCR", "Haryana", "Rajasthan"};
        return state[random.nextInt(state.length)];
    }

    public String getRandomCity() {

        Random random = new Random();
        String[] city;
        if (state.equals("NCR")) {
            city = new String[]{"Delhi", "Gurgaon", "Noida"};
        } else if (state.equals("Haryana")) {
            city = new String[]{"Karnal", "Panipat"};
        } else {
            city = new String[]{"Jaipur", "Jaiselmer"};
        }
        return city[random.nextInt(city.length)];
    }
}