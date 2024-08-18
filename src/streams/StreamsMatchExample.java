package streams;

import entity.Student;
import entity.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class StreamsMatchExample {

    static Predicate<List<String>> anyPlaySoccer = sport -> sport.contains("soccer");

    public static void main(String[] args) {
        boolean isAnyStudentThatPlaySoccer = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .anyMatch(anyPlaySoccer);

        System.out.println("Any student play soccer ? " + isAnyStudentThatPlaySoccer);
    }
}
