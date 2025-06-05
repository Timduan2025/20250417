package org.example.model;

public class RetiredTeacher extends Teacher {
    //Unique field
    private boolean isRetired;

    public RetiredTeacher(String name, int age, String email, String teacherId, String department, Course[] courses, boolean isRetired) {
        super(name, age, email, teacherId, department, courses, 200.0, 10);
        this.isRetired = isRetired;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }
}
