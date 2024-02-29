package dataAccess;

import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class JdbcInstructorDao implements InstructorDao {
    private List<Instructor> instructors = new ArrayList<>();

    @Override
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
        System.out.println("Instructor added to the database by Jdbc : " + instructor.getName());
    }

    @Override
    public void updateInstructor(Instructor instructor) {
        System.out.println("Instructor update in the database by Jdbc : " + instructor.getName());
    }

    @Override
    public void deleteInstructor(Instructor instructor) {
        System.out.println("Instructor delete from the database by Jdbc : " + instructor.getName());
    }

    @Override
    public List<Instructor> getAllInstructor() {
        return instructors;
    }
}