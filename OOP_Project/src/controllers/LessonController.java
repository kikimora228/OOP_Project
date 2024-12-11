package controllers;

import models.Lesson;
import enums.LessonType;
import enums.WeekDays;
import users.Teacher;
import java.util.List;

public class LessonController {
    public Lesson createLesson(LessonType lessonType, List<WeekDays> days, Teacher teacher) {
        return new Lesson(lessonType, days, teacher);
    }

    public void updateLessonType(Lesson lesson, LessonType lessonType) {
        lesson.setLessonType(lessonType);
    }

    public void updateLessonDays(Lesson lesson, List<WeekDays> days) {
        lesson.setDays(days);
    }

    public void updateLessonTeacher(Lesson lesson, Teacher teacher) {
        lesson.setTeacher(teacher);
    }

    public void displayLessonDetails(Lesson lesson) {
        System.out.println("Lesson Type: " + lesson.getLessonType());
        System.out.println("Teacher: " + lesson.getTeacher());
        System.out.println("Scheduled Days: " + lesson.getDays());
    }
}

