package controllers;

import models.Course;
import enums.ElectiveType;
import models.Lesson;
import users.Teacher;

public class CourseController {
    public Course createCourse(String courseName, ElectiveType electiveType) {
        return new Course(courseName, electiveType);
    }

    public void addInstructor(Course course, Teacher teacher) {
        course.addInstructor(teacher);
    }

    public void addLesson(Course course, Lesson lesson) {
        course.addLesson(lesson);
    }

    public void displayCourseDetails(Course course) {
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Elective Type: " + course.getElectiveType());
        System.out.println("Instructors: " + course.getInstructors());
        System.out.println("Lessons: " + course.getLessons());
    }
}
