package defaults;

import java.util.List;

public interface Multiplier {

    int multiply(List<Integer> values);

    default int size(List<Integer> values) {
        return values.size();
    }

    static boolean isEmpty(List<Integer> values) {
        return values != null && values.isEmpty();
    }
}
