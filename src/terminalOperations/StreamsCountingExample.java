package terminalOperations;

import entity.Student;
import entity.StudentDataBase;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsCountingExample {

    public static long countStudents(Predicate<Student> predicate) {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(predicate)
                .count();
    }

    public static void main(String[] args) {
        Predicate<Student> gpaPredicate = (student) -> student.getGpa() >= 3.9;
        System.out.println("Gpa Greater than 3.9: " + countStudents(gpaPredicate));

        Predicate<Student> gradeLevelPredicate = (student) -> student.getGradeLevel() >= 3;
        System.out.println("Grade level Greater than 3: " + countStudents(gradeLevelPredicate));
    }
}
