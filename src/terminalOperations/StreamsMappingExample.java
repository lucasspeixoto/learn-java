package terminalOperations;

import entity.Student;
import entity.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {


    public static void main(String[] args) {

        List<String> studentsList = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
        System.out.println(studentsList);

        Set<String> studentsSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));
        System.out.println(studentsSet);
    }
}
