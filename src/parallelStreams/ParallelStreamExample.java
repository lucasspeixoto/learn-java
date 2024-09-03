package parallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

/*
    How Parallel Streams works ?
    Parallel streams are designed to improve performance by utilizing multiple threads to execute
    the stream operations. It uses the fork/join framework that got introduced in Java 7.
    The number of threads created is equals to the number of processors available in the machine.
    The advantage of parallel streams is that they can process the data in a more efficient way,
    especially when dealing with large data sets.

 */

public class ParallelStreamExample {

    public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++) {
            supplier.get();
        }

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int sumSequentialStream() {
        return IntStream.rangeClosed(1, 1000000).sum();
    }

    public static int sumParallelStream() {
        return IntStream.rangeClosed(1, 1000000)
                .parallel() // Split data in multiple parts
                .sum();
    }

    public static void main(String[] args) {

        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("Available processors: " + availableProcessors);

        long sequentialResult = checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 30);
        System.out.println("Sequential result: " + sequentialResult + " ms");

        long parallelResult = checkPerformanceResult(ParallelStreamExample::sumParallelStream, 30);
        System.out.println("Parallel result: " + parallelResult + " ms");
    }
}
