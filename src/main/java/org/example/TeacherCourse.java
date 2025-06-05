package org.example;

import net.datafaker.Faker;
import org.example.model.Course;
import org.example.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherCourse {
    public static void main(String[] args) {
        Faker faker = new Faker();

        Course[] courses = {
                new Course(faker.number().positive(),
                        faker.educator().course(),
                        faker.text().text()),
                new Course(faker.number().positive(),
                        faker.educator().course(),
                        faker.text().text()),
                new Course(faker.number().positive(),
                        faker.educator().course(),
                        faker.text().text()),
        };
        Course[] newCourses = addElement(courses, new Course(faker.number().positive(),
                faker.educator().course(),
                faker.text().text()));

        Teacher teacher = new Teacher(
                faker.name().fullName(),
                faker.number().numberBetween(25, 35),
                faker.internet().emailAddress(),
                faker.number().digit(),
                faker.educator().campus(),
                new Course[]{
                        new Course(faker.number().randomDigit(), faker.educator().course(), faker.text().text()),
                        new Course(faker.number().randomDigit(), faker.educator().course(), faker.text().text()),
                        new Course(faker.number().randomDigit(), faker.educator().course(), faker.text().text()),
                }, 200.0, 10
        );
        teacher.teach();
        teacher.displayInfo();
        teacher.eat();
        teacher.processPayment();
        System.out.println(teacher.getPaymentDetail());
        teacher.sendNotification("測試訊息");
    }

    public static Course[] addElement(Course[] array, Course elementToAdd) {
        Course[] result = new Course[array.length + 1];
        System.arraycopy(array, 0, result, 0, array.length);
        result[result.length - 1] = elementToAdd;
        return result;
    }
}
