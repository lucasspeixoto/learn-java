package imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeE1 {

    public static void main(String[] args) {
        /**
         * Imperative
         */
        int imperativeSum = 0;
        for (int i = 0; i <= 100000000; i += 1) {
            imperativeSum += i;
        }
        System.out.printf("The Sum (Imperative Approach): " + imperativeSum);

        /**
         * Declarative
         */
        int declarativeSum = IntStream.rangeClosed(0, 100000000)
                .parallel()
                .sum();
        System.out.printf("\nThe Sum (Declarative Approach): " + declarativeSum);
    }
}
