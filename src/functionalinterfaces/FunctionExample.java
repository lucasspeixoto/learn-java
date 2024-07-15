package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    static List<String> languages = Arrays.asList("Java", "Python", "C++", "Golang", "Ruby", "Rust", "PHP");

    static Function<String, Integer> getLength = (s) -> s.length();

    static Function<String, Integer> getLengthWithMethodReference = String::length;

    static Function<String, String> toUpperCase = String::toUpperCase;

    static Function<String, String> addSomeString = (s) -> s.concat(" default");

    public static void getListLength() {
        languages.stream()
               .map(getLength)
               .forEach(System.out::println);
    }

    public static void getListUpperCase() {
        languages.stream()
               .map(toUpperCase)
               .forEach(System.out::println);
    }

    public static void getListWithSomeString() {
        languages.stream()
               .map(addSomeString)
               .forEach(System.out::println);
    }

    public static void main(String[] args) {
        getListLength();
        getListUpperCase();
        getListWithSomeString();

        System.out.println(getLength.apply("Java"));
        System.out.println(toUpperCase.andThen(addSomeString).apply("Java")); // --> JAVA default
        System.out.println(toUpperCase.compose(addSomeString).apply("Java")); // --> JAVA DEFAULT
    }
}
