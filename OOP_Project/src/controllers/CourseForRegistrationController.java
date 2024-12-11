package controllers;

import models.CourseForRegistration;
import users.Student;
import models.Course;

public class CourseForRegistrationController {
    public CourseForRegistration registerStudentToCourse(Student student, Course course) {
        return new CourseForRegistration(student, course);
    }

    public void displayRegistrationDetails(CourseForRegistration registration) {
        System.out.println("Student: " + registration.getStudent());
        System.out.println("Course: " + registration.getCourse());
    }
}
