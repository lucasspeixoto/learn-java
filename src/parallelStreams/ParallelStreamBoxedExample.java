package parallelStreams;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

    public static int sequentialSum(List<Integer> integerList) {
        long start = System.currentTimeMillis();
        int sum = integerList
                .stream()
                .reduce(0, Integer::sum);

        long end = System.currentTimeMillis();

        System.out.println("Sequential Duration: " + (end - start));

        return sum;
    }

    public static int parallelSum(List<Integer> integerList) {
        long start = System.currentTimeMillis();
        int sum = integerList
                .parallelStream()
                .reduce(0, Integer::sum);

        long end = System.currentTimeMillis();

        System.out.println("Parallel Duration: " + (end - start));

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1, 100000)
                .boxed()
                .toList();

        System.out.println("Sum: " + sequentialSum(integerList));
        System.out.println();
        System.out.println("Sum: " + parallelSum(integerList));
    }
}
