package org.example;

import net.datafaker.Faker;
import org.example.model.Student;

public class StudentWithFaker {
    public static void main(String[] args) {
        Student student = new Student("James", 12, "james@gmail.com", "A123", "Mathametic", "m");
        student.introduce();
        Faker faker = new Faker();

        Student fakerStudent = new Student(faker.name().fullName(),
                faker.random().nextInt(10, 20),
                faker.internet().emailAddress(),
                faker.idNumber().valid(),
                faker.educator().course(),
                faker.gender().shortBinaryTypes()
        );
        fakerStudent.introduce();
        String gender = faker.gender().shortBinaryTypes();
        System.out.println(gender);
    }
}
