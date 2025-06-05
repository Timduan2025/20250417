package org.example;

import net.datafaker.Faker;
import org.example.model.Course;
import org.example.model.RetiredTeacher;
import org.example.model.Student;
import org.example.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class InheritDemo {
    public static void main(String[] args) {
        // 1. Faker initialized
        Faker faker = new Faker();
        // 2. Teacher initialized
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
                },
                200.0, 10
        );
        // 3. Student Initialized
        Student student = new Student(
                faker.name().fullName(),
                faker.number().numberBetween(18, 25),
                faker.internet().emailAddress(),
                faker.number().digit(),
                faker.educator().course(),
                faker.gender().shortBinaryTypes()
        );
        // 6. RetiredTeacher initialized
        RetiredTeacher retiredTeacher = new RetiredTeacher(
                faker.name().fullName(),
                faker.number().numberBetween(50, 70),
                faker.internet().emailAddress(),
                faker.number().digit(),
                faker.educator().campus(),
                new Course[]{
                        new Course(faker.number().randomDigit(), faker.educator().course(), faker.text().text()),
                        new Course(faker.number().randomDigit(), faker.educator().course(), faker.text().text()),
                        new Course(faker.number().randomDigit(), faker.educator().course(), faker.text().text()),
                },
                true
        );
        // 4. Teacher invoke(call) function
        teacher.teach();
        teacher.displayInfo();
        teacher.eat();
        System.out.println("--------------------");
        // 5. Student invoke(call) function
        student.eat();
        student.displayInfo();
        student.sendNotification("你被21了");
        // 7. 打印retiredTeacher的 isRetired屬性
        System.out.println("--------------------");
        System.out.println("該位老師是否退休:" + retiredTeacher.isRetired());
        System.out.println("--------------------");
        // 8. Teacher invoke(call) function
        teacher.processPayment();
        // 7. 打印Teacher的getPayment的方法
        System.out.println(teacher.getPaymentDetail());
        teacher.sendNotification("測試訊息");
    }
}
