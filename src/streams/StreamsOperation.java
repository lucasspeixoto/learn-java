package streams;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamsOperation {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Lucas", "Liana", "Cecilia");

        List<String> names = stringStream.
                peek(System.out::println)
                .toList();

        System.out.println(names);

        Stream.iterate(1, x -> x * 2)
                .limit(10)
                .forEach(System.out::println);

        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(10)
                .forEach(System.out::println);
    }
}
