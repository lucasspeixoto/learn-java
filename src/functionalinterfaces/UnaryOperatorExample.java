package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = (s) -> s.concat(" default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Lucas"));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        UnaryOperator<Integer> doubles = x -> x * 2;
        List<Integer> doublesList = numbers.stream().map(doubles).toList();

        System.out.println(doublesList);
    }
}
