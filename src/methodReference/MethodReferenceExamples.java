package methodReference;

import entity.Student;
import entity.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExamples {

    static List<String> languages = Arrays.asList("Java", "Python", "C++");
    static Function<String ,String> toUpperCase = String::toUpperCase;

    static Consumer<Student> printItem = System.out::println;

    static Predicate<Student> studentGradeLevel = (student) -> student.getGradeLevel() >=3;

    static Consumer<Student> printActivities = Student::printListOfActivities;

    public static void main(String[] args) {
        System.out.println(toUpperCase.apply("Lucas Peixoto\n"));

        StudentDataBase.getAllStudents().forEach(printActivities);

        System.out.println(studentGradeLevel.test(StudentDataBase.studentSupplier.get()));
    }
}
