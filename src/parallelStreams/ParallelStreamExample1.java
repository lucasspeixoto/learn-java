package parallelStreams;

import entity.Student;
import entity.StudentDataBase;

import java.util.List;

public class ParallelStreamExample1 {

    public static void printStudentActivities() {
        long start = System.currentTimeMillis();
        List<String> students =  StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        long end = System.currentTimeMillis();
        System.out.println("Sequential Duration: " + (end - start));

    }

    public static void printStudentActivitiesInParallelStream() {

        long start = System.currentTimeMillis();
        List<String> students =  StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        long end = System.currentTimeMillis();
        System.out.println("Parallel Duration: " + (end - start));
    }

    public static void main(String[] args) {
        printStudentActivities();
        printStudentActivitiesInParallelStream();
    }
}
