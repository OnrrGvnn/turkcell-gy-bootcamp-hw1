package business;

import core.logging.BaseLogger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private BaseLogger[] baseLoggers;

    public CourseManager(CourseDao courseDao, BaseLogger[] baseLoggers) {
        this.courseDao = courseDao;
        this.baseLoggers = baseLoggers;
    }

    public void addCourse(Course course) {
        for (Course item : courseDao.getAllCourses()) {
            if (item.getName().equals(course.getName())) {
                throw new RuntimeException("Course name already exists.");
            }
        }

        if (course.getPrice() < 0) {
            throw new RuntimeException("Course price cannot be negative!");
        }

        courseDao.addCourse(course);

        for (BaseLogger baseLogger : baseLoggers) {
            baseLogger.log("Course added : " + course.getName());
        }
    }

    public void updateCourse(Course course) {
        for (Course item : courseDao.getAllCourses()) {
            if (item.getName().equals(course.getName())) {
                throw new RuntimeException("Course name already exists.");
            }
        }

        if (course.getPrice() < 0) {
            throw new RuntimeException("Course price cannot be negative!");
        }

        courseDao.updateCourse(course);

        for (BaseLogger baseLogger : baseLoggers) {
            baseLogger.log("Course updated : " + course.getName());
        }
    }

    public void deleteCourse(Course course) {
        courseDao.deleteCourse(course);

        for (BaseLogger baseLogger : baseLoggers) {
            baseLogger.log("Course deleted : " + course.getName());
        }
    }

    public void listCourses() {
        List<Course> courses = courseDao.getAllCourses();

        for (Course course : courses) {
            System.out.println(course.getName());
        }

        System.out.println("Courses listed.");

        for (BaseLogger logger : baseLoggers) {
            logger.log("Courses listed.");
        }
    }

}