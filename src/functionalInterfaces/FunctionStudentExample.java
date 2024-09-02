package functionalInterfaces;

import entity.Student;
import entity.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionStudentExample {

    static Predicate<Student> gradeLevelPredicate = (student) -> student.getGradeLevel() >= 3;

    static Predicate<Student> gpaPredicate = (student) -> student.getGpa() >= 3.5;

    static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(student -> {
            if (gradeLevelPredicate.and(gpaPredicate).test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        });

        return studentGradeMap;
    });

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();

        System.out.println(studentFunction.apply(students));
    }
}
