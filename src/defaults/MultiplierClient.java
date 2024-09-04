package defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> values = Arrays.asList(1, 3, 5);

        System.out.println("Multiplier result: " + multiplier.multiply(values));

        System.out.println("Values size: " + multiplier.size(values));

        System.out.println("Is Empty Check: " + Multiplier.isEmpty(values));
    }
}
