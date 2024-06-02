package imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeE2 {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 9, 9, 10);

        /**
         * Imperative Approach
         */
        List<Integer> imperativeUniqueList = new ArrayList<>();
        for (Integer integer : integerList) {
            if (!imperativeUniqueList.contains(integer)) {
                imperativeUniqueList.add(integer);
            }
        }
        System.out.printf("Imperative Unique List: " +  imperativeUniqueList);

        System.out.println("\n");
        /**
         * Declarative Approach
         */
        List<Integer> declarativeUniqueList = integerList.stream()
                .distinct()
                .toList();
        System.out.printf("Declarative Unique List: " +  declarativeUniqueList);
    }
}
