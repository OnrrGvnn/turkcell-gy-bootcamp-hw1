package dataAccess;

import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements CourseDao {
    private List<Course> courses = new ArrayList<>();

    @Override
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added to the database by Hibernate : " + course.getName());
    }

    @Override
    public void updateCourse(Course course) {
        System.out.println("Course update in the database by Hibernate : " + course.getName());
    }

    @Override
    public void deleteCourse(Course course) {
        System.out.println("Course delete from the database by Hibernate : " + course.getName());
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }
}