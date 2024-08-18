package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingExample {

    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 10)//inStream of 10 elements
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> integerList) {
        return integerList
                //unboxing to convert the Integer to int
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing: " + boxing());
        System.out.println("Unboxing: Sum: " + unboxing(boxing()));
    }
}
