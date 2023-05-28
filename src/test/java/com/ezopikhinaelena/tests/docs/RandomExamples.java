package com.ezopikhinaelena.tests.docs;

import static com.ezopikhinaelena.tests.utils.RandomUtils.*;

public class RandomExamples {
    public static void main(String[] args) {
        System.out.println(getRandomString(17));

        String randomMessage = getRandomMessage(58, 59);
        System.out.println(randomMessage);

        int randomInt = getRandomInt(3333322, 77777777);
        System.out.println(randomInt + "");

        String randomPhone = getRandomPhone();
        System.out.println(randomPhone);

        String randomPhoneWithPrefix = getRandomPhone("+1");
        System.out.println(randomPhoneWithPrefix);

        String difficultRandomPhoneWithPrefix = getDifficultRandomPhone("+7");
        System.out.println(difficultRandomPhoneWithPrefix);

        String randomEmail = getRandomEmail();
        System.out.println(randomEmail);
    }
}