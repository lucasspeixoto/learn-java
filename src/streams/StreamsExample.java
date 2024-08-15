package streams;

import entity.Student;
import entity.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> gradeLevelMoreThan3StudentPredicate = (student -> student.getGradeLevel() >= 3);
        Predicate<Student> gpaMoreThen39StudentPredicate = (student -> student.getGpa() >= 3.9);

        Map<String, List<String>> mappedStudents = StudentDataBase.getAllStudents()
                .parallelStream()
                .peek((student -> {
                    System.out.println(student);
                }))
                .filter(gradeLevelMoreThan3StudentPredicate)
                .peek((student -> {
                    System.out.println(student);
                }))
                .filter(gpaMoreThen39StudentPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities)); //collect start stream operation. Without collect nothing happens

        System.out.println(mappedStudents);
    }
}
