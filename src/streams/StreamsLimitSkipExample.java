package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsLimitSkipExample {


    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use the limit and skip methods to get the first 3 and last 3 numbers
        List<Integer> firstThreeNumbers = numbers.stream().limit(3).toList();
        List<Integer> lastThreeNumbers = numbers.stream().skip(numbers.size() - 3).limit(3).toList();

        System.out.println("First 3 numbers: " + firstThreeNumbers);
        System.out.println("Last 3 numbers: " + lastThreeNumbers);
    }
}
