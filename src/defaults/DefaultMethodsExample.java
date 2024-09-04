package defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Métodos default em Java 8 são uma adição à linguagem que permite
 * que interfaces tenham métodos com uma implementação padrão.
 * Antes do Java 8, as interfaces só podiam declarar métodos
 * abstratos, ou seja, métodos que precisavam ser implementados
 * pelas classes que as implementassem. Com os métodos default,
 * uma interface pode fornecer um comportamento padrão que pode
 * ser utilizado pelas classes que a implementam sem a
 * necessidade de sobrescrevê-lo.
 */

public class DefaultMethodsExample {


    public static void main(String[] args) {
        // Sort the list names in alphabetical order
        List<String> stringList = Arrays.asList("Zuckerberg", "Adam", "Felix", "Marchal");

        // Before java 8
        Collections.sort(stringList);
        System.out.println("Sorted with Collections.sort(): " + stringList);

        // Java 8 and above
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted with List.sort(): " + stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sorted with List.sort() in reverse: " + stringList);

    }
}
