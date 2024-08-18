package numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NumericStreamsAggregateExample {

    public static void main(String[] args) {
        double[] doubleNumbers = {1.5, 2.5, 3.5, 4.5};
        int[] intNumbers = {2, 5, 8, 4};

        double product = DoubleStream.of(doubleNumbers).parallel().reduce(1.0, (a, b) -> a * b);
        System.out.println("Product: " + product);

        double sumDouble = DoubleStream.of(doubleNumbers).sum();
        System.out.println("Sum Double: " + sumDouble);

        int sumInt = IntStream.of(intNumbers).sum();
        System.out.println("Sum Int: " + sumInt);

        double averageDouble = DoubleStream.of(doubleNumbers).average().orElse(0.0);
        System.out.println("Average Double: " + averageDouble);

        double averageInt = IntStream.of(intNumbers).average().orElse(0);
        System.out.println("Average Int: " + averageInt);

        double max = DoubleStream.of(doubleNumbers).max().orElse(0.0);
        System.out.println("Max: " + max);

        double min = DoubleStream.of(doubleNumbers).min().orElse(0.0);
        System.out.println("Min: " + min);
    }
}
