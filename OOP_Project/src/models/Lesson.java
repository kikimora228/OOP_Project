package models;

import enums.LessonType;
import enums.WeekDays;
import users.Teacher;
import java.util.List;

public class Lesson {
    private LessonType lessonType;
    private List<WeekDays> days;
    private Teacher teacher;

    public Lesson(LessonType lessonType, List<WeekDays> days, Teacher teacher) {
        this.lessonType = lessonType;
        this.days = days;
        this.teacher = teacher;
    }

    public LessonType getLessonType() {
        return lessonType;
    }

    public void setLessonType(LessonType lessonType) {
        this.lessonType = lessonType;
    }

    public List<WeekDays> getDays() {
        return days;
    }

    public void setDays(List<WeekDays> days) {
        this.days = days;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}