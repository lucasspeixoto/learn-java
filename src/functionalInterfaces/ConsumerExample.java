package functionalInterfaces;

import entity.Student;
import entity.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> printStudentConsumer = System.out::println;
    static Consumer<Student> nameConsumer = (student) -> System.out.println(student.getName());
    static Consumer<Student> activitiesConsumer = (student) -> System.out.println(student.getActivities() + "\n");

    public static void printStudents() {
        System.out.println("\nprintStudents:");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(printStudentConsumer);
    }

    public static void printNameAndActivities() {
        System.out.println("\nprintNameAndActivities:");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(nameConsumer.andThen(activitiesConsumer));
    }

    public static void printNameAndActivitiesUsingConditions() {
        System.out.println("\nprintNameAndActivitiesUsingConditions:");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student) -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                nameConsumer.andThen(activitiesConsumer).andThen(printStudentConsumer).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        printStudents();
        printNameAndActivities();
        printNameAndActivitiesUsingConditions();
    }
}
