package streams;

import entity.Student;
import entity.StudentDataBase;

import java.util.Optional;

public class StreamsFindExample {

    public static void main(String[] args) {
        Optional<Student> firstStudent = StudentDataBase.getAllStudents()
                .stream()
                .findFirst();

        Optional<Student> anyThatPlaySoccerStudent = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getActivities().contains("soccer"))
                .findAny();

        System.out.println(firstStudent);
        System.out.println(anyThatPlaySoccerStudent);
    }
}
