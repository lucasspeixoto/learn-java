package functionalInterfaces;

import entity.Student;
import entity.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static Predicate<Student> gradeLevelPredicate = (student) -> student.getGradeLevel() >= 3;

    static Predicate<Student> gpaPredicate = (student) -> student.getGpa() >= 3.5;

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentGpaMapBuilder = ((students, studentPredicate) -> {
        Map<String, Double> studentGradeMap = new HashMap<>();

        students.forEach(student -> {
            if (studentPredicate.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        });

        return studentGradeMap;

    });

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();

        Map<String, Double> studentsGpaMap = studentGpaMapBuilder.apply(students, gpaPredicate);

        System.out.println(studentsGpaMap);
    }
}
