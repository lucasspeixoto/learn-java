package defaults;

import entity.Student;
import entity.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;


public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = (System.out::println);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
    static Comparator<Student> gradeComparator = Comparator.comparingDouble(Student::getGradeLevel);

    public static void sortByName(List<Student> students) {
        System.out.println("After sortByName: ");

        students.sort(nameComparator);

        students.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> students) {
        System.out.println("After sortByGpa: ");

        students.sort(gpaComparator);

        students.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> students) {
        System.out.println("After comparatorChaining: ");

        students.sort(gradeComparator.thenComparing(nameComparator));

        students.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> students) {
        System.out.println("After sortWithNullValues: ");

        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);

        students.sort(studentComparator);

        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();

        System.out.println("Before sorting: " + students);

        sortWithNullValues(students);
    }
}
