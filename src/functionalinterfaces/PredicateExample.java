package functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> evenOrOddPredicate = (value) -> value % 2 == 0;

    static Predicate<Integer> fiveMultiple = (value) -> value % 5 == 0;

    public static void predicateAnd() {
        System.out.println("Predicate And: " + evenOrOddPredicate.and(fiveMultiple).test(12));
    }

    public static void predicateOr() {
        System.out.println("Predicate Or: " + evenOrOddPredicate.or(fiveMultiple).test(12));
        System.out.println("Predicate Or Negated: " + evenOrOddPredicate.or(fiveMultiple).negate().test(12));
    }


    public static void main(String[] args) {

        predicateAnd();
        predicateOr();

    }
}
