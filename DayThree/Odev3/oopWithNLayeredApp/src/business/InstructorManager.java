package business;

import core.logging.BaseLogger;
import dataAccess.InstructorDao;
import entities.Instructor;

import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private BaseLogger[] baseLoggers;

    public InstructorManager(InstructorDao instructorDao, BaseLogger[] baseLoggers) {
        this.instructorDao = instructorDao;
        this.baseLoggers = baseLoggers;
    }

    public void addInstructor(Instructor instructor) {
        for (Instructor item : instructorDao.getAllInstructor()) {
            if (item.getName().equals(instructor.getName())) {
                throw new RuntimeException("Instructor name already exists.");
            }
        }

        instructorDao.addInstructor(instructor);

        for (BaseLogger baseLogger : baseLoggers) {
            baseLogger.log("Instructor added : " + instructor.getName());
        }
    }

    public void updateInstructor(Instructor instructor) {
        for (Instructor item : instructorDao.getAllInstructor()) {
            if (item.getName().equals(instructor.getName())) {
                throw new RuntimeException("Instructor name already exists.");
            }
        }

        instructorDao.updateInstructor(instructor);

        for (BaseLogger baseLogger : baseLoggers) {
            baseLogger.log("Instructor added : " + instructor.getName());
        }
    }

    public void deleteInstructor(Instructor instructor) {
        instructorDao.deleteInstructor(instructor);

        for (BaseLogger baseLogger : baseLoggers) {
            baseLogger.log("Instructor deleted : " + instructor.getName());
        }
    }

    public void listInstructors() {
        List<Instructor> instructors = instructorDao.getAllInstructor();

        for (Instructor instructor : instructors) {
            System.out.println(instructor.getName());
        }

        System.out.println("Instructors listed.");

        for (BaseLogger logger : baseLoggers) {
            logger.log("Instructors listed.");
        }
    }

}