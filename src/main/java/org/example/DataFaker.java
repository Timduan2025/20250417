package org.example;

import net.datafaker.Faker;
import net.datafaker.providers.base.Weather;
import net.datafaker.providers.healthcare.Disease;

public class DataFaker {
    public static void main(String[] args) {
        Faker faker = new Faker();
        //for (int i = 0; i < 10; i++) {
        //    String loopName = faker.name().fullName();
        //    System.out.println(loopName);
        //}
        Weather weather = faker.weather();
        System.out.println(weather.temperatureCelsius(1, 5));

        //隨機疾病
        Disease myDisease = faker.disease();
        String anyDisease = myDisease.anyDisease();
        System.out.println(anyDisease);
        System.out.println(myDisease.anyDisease());
        System.out.println(getAnyDisease());
        System.out.println(getFaker().disease().anyDisease());

        //隨機籃球運動員
        System.out.println(faker.basketball().players());
        Faker player = new Faker();
        System.out.println(faker);
        System.out.println(getRandomPlayer(faker));
        System.out.println(getRandomBaseballPlayer(faker));
        System.out.println(getRandomDessert(faker));
    }

    private static String getAnyDisease() {
        Faker faker = new Faker();
        Disease disease = faker.disease();
        String anyDisease = disease.anyDisease();
        return disease.anyDisease();
    }

    private static Disease getAnyDisease1() {
        Faker faker = new Faker();
        // Disease disease = faker.disease();
        // String anyDisease = disease.getAnyDisease();
        return faker.disease();
    }

    private static Faker getFaker() {
        Faker faker = new Faker();
        return faker;
    }

    private static String getRandomPlayer(Faker faker) {
        System.out.println(faker);
        Faker newFaker = new Faker();
        System.out.println(newFaker);
        return faker.basketball().players();
    }

    private static String getRandomBaseballPlayer(Faker faker) {
        System.out.println(faker);
        Faker newFaker = new Faker();
        System.out.println(newFaker);
        return faker.baseball().players();
    }

    private static String getRandomDessert(Faker faker) {
        System.out.println(faker);
        Faker newFaker = new Faker();
        System.out.println(newFaker);
        return faker.dessert().flavor();
    }
}