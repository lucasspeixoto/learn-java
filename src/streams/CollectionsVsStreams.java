package streams;

import java.util.ArrayList;

public class CollectionsVsStreams {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Jim");
        names.add("Jenny");

        names.remove(0);

        System.out.println(names);
    }
}
