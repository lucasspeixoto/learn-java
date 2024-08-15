package streams;

import entity.Student;
import entity.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class StreamsFilterExample {

    static Predicate<Student> femaleStudents = student -> student.getGender().equals("female");

    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(femaleStudents)
                .peek(System.out::println)
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println(filterStudents());
    }
}
