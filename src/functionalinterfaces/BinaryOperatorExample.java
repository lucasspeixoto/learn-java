package functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = Integer::compareTo;

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (s1, s2) -> s1 * s2;

        Integer result = binaryOperator.apply(3, 4);
        System.out.println(result);

        BinaryOperator<Integer> maxByBinaryOperator = BinaryOperator.maxBy(comparator);
        BinaryOperator<Integer> minByBinaryOperator = BinaryOperator.minBy(comparator);
        System.out.println("Result of maxBy: " + maxByBinaryOperator.apply(13, 44));
        System.out.println("Result of minBy: " + minByBinaryOperator.apply(13, 44));
    }
}
