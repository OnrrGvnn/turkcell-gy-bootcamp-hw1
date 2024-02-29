import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.*;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import dataAccess.JdbcCategoryDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) {
        Category category = new Category(1, "Programlama");
        Instructor instructor = new Instructor(1, "Onur Güven", "onrr.gvnn@gmail.com", "05111111111");
        Course course = new Course(1, "Java", 1000, instructor, category);

        BaseLogger[] baseLoggers = {};

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), baseLoggers);
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), baseLoggers);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), baseLoggers);

        categoryManager.addCategory(category);
        instructorManager.addInstructor(instructor);
        courseManager.addCourse(course);
    }

}