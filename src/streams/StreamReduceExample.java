package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList
                .stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static int performSum(List<Integer> integerList) {
        return integerList
                .stream()
                .reduce(0, Integer::sum);
    }

    public static int performMaxValue(List<Integer> integerList) {
        return integerList
                .stream()
                .reduce(0, (a, b) -> a < b ? b : a);
    }

    public static Optional<Integer> performMinValue(List<Integer> integerList) {
        return integerList
                .stream()
                .reduce((a, b) -> a < b ? a : b);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);

        System.out.println("mult.: " + performMultiplication(integers));
        System.out.println("sum.: " + performSum(integers));
        System.out.println("max.: " + performMaxValue(integers));

        if(performMinValue(integers).isPresent()) {
            System.out.println("min.: " + performMinValue(integers).get());
        }
    }
}
