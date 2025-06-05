package org.example;

import org.example.model.Dog;

public class Extends {
    public static void main(String[] args) {
        Dog dog = new Dog("mammal", 23.5, "black", 1);
        dog.eat();
        System.out.println(dog.getSpecies());
    }
}
