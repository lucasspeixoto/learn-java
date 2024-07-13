package functionalinterfaces;

public class FunctionExample1 {

    public static String performContact(String str) {
        return FunctionExample.addSomeString.apply(str);
    }

    public static void main(String[] args) {
        String concatenedString = performContact("Hello");
        System.out.println(concatenedString);
    }
}
