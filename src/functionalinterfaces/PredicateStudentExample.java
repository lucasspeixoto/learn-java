package functionalinterfaces;

import entity.Student;

import java.util.function.Predicate;

public class PredicateStudentExample {

    Predicate<Student> predicate = (student) -> student.getGradeLevel() >= 3;

    public static void main(String[] args) {

    }
}
