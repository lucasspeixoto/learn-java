package defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier {
    @Override
    public int multiply(List<Integer> values) {
        return values
                .stream()
                .reduce(1, (a, b) -> a * b);
    }

}
