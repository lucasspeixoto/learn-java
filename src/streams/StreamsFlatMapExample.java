package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsFlatMapExample {

    public static void main(String[] args) {

        List<String> sportsStudent1 = Arrays.asList("swimming", "soccer");
        List<String> sportsStudent2 = Arrays.asList("soccer", "baseball");
        List<String> sportsStudent3 = Arrays.asList("gymnastics", "swimming");

        List<List<String>> allStudentsSports = Arrays.asList(
                sportsStudent1,
                sportsStudent2,
                sportsStudent3
        );

        List<String> distinctSports = allStudentsSports
                .stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();

        long totalSports = allStudentsSports
                .stream()
                .mapToLong(List::size)
                .distinct()
                .count();

        System.out.println(distinctSports); //Result: [swimming, soccer, baseball, aerobics]
        System.out.println("Total: " + totalSports);
    }
}
