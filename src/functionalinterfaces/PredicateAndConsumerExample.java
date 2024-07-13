package functionalinterfaces;

import entity.Student;
import entity.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate<Student> gradeLevelPredicate = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> gpaPredicate = (student) -> student.getGpa() >= 3.9;

    static BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> {
        System.out.println(name + ": " + activities);
    };
    static Consumer<Student> studentConsumer = (student) -> {
        if(gradeLevelPredicate.and(gpaPredicate).test(student)) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> students) {
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();

        new PredicateAndConsumerExample().printNameAndActivities(students);
    }
}
