package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMapToExample {

    public static List<Integer> mapToObj() {
       return IntStream.rangeClosed(1, 5)
                .mapToObj(n -> {
                    return new Integer(n);
                })
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] squaredNumbers = IntStream.of(numbers)
                .map(n -> n * n)
                .toArray();

        for (int number : squaredNumbers) {
            System.out.println(number);
        }
    }
}
