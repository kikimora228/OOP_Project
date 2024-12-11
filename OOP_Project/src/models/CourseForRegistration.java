package models;

import users.Student;
import models.Course;

public class CourseForRegistration {
    private Student student;
    private Course course;

    public CourseForRegistration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }
}