package terminalOperations;

import entity.Student;
import entity.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String joining(String delimiter, String prefix, String suffix) {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(delimiter, prefix, suffix));
    }


    public static void main(String[] args) {
        System.out.println(joining(", ", "", ""));
        System.out.println(joining(" | ", "", ""));
        System.out.println(joining(", ", "(", ")"));
    }
}
