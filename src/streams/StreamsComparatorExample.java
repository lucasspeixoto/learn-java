package streams;

import entity.Student;
import entity.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class StreamsComparatorExample {

    public static void main(String[] args) {
        List<String> studentsSortedByName = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .map(Student::getName)
                .toList();

        List<String> studentsSortedByGpa = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .map(Student::getName)
                .toList();

        List<String> studentsSortedByGpaDesc = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .map(Student::getName)
                .toList();

        System.out.println("Sorted by name: " + studentsSortedByName);
        System.out.println("Sorted by GPA: " + studentsSortedByGpa);
        System.out.println("Sorted by GPA Desc: " + studentsSortedByGpaDesc);
    }
}
