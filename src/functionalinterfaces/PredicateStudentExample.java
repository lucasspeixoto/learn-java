package functionalinterfaces;

import entity.Student;
import entity.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> gradeLevelPredicate = (student) -> student.getGradeLevel() >= 3;

    static Predicate<Student> gpaPredicate = (student) -> student.getGpa() >= 3.9;

    public static void filterStudentsByGradeLevel() {
        System.out.println("filterStudentsByGradeLevel: ");
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach((student) -> {
            if (gradeLevelPredicate.test(student)) {
                System.out.println(student.getName());
            }
        });
    }

    public static void filterStudentsByGpa() {
        System.out.println("filterStudentsByGpa: ");
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach((student) -> {
            if (gpaPredicate.test(student)) {
                System.out.println(student.getName());
            }
        });
    }

    public static void filterStudents() {
        System.out.println("filterStudents: ");
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach((student) -> {
            if (gradeLevelPredicate.and(gpaPredicate).test(student)) {
                System.out.println(student.getName());
            }
        });
    }

    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        filterStudentsByGpa();
        filterStudents();
    }
}
