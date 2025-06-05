package org.example;

import org.example.model.Car;
import org.example.model.Circle;
import org.example.model.Rectangle;
import org.example.model.Student;

public class Main {
    public static void main(String[] args) {
        Student henry = new Student("Tim", 33, "ichiro_88@hotmail.com", "A12345", "Aerospace", "male");
        henry.getAge();
        System.out.println(henry.getAge());
        henry.getSex();
        System.out.println(henry.getSex());
        // henry.setSex(1);
        // System.out.println(henry.getSex());
        Circle circle = new Circle("red", 3);
        System.out.println(circle.getArea());
        Rectangle rectangle = new Rectangle("blue", 4, 5);
        System.out.println(rectangle.getArea());
        Car motorcar = new Car("Benz", 120);
        motorcar.getSpeed();
        // 測試GitHub
    }
}