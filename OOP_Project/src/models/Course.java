package models;

import enums.ElectiveType;
import models.Lesson;
import users.Teacher;
import java.util.List;

public class Course {
    private String courseName;
    private ElectiveType electiveType;
    private List<Teacher> instructors;
    private List<Lesson> lessons;

    public Course(String courseName, ElectiveType electiveType) {
        this.courseName = courseName;
        this.electiveType = electiveType;
    }

    public String getCourseName() {
        return courseName;
    }

    public ElectiveType getElectiveType() {
        return electiveType;
    }

    public List<Teacher> getInstructors() {
        return instructors;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void addInstructor(Teacher teacher) {
        instructors.add(teacher);
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }
}