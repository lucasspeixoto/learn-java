package lambdas;

import entity.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdaE {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Charlie", 35, "charlie@email.com"));
        people.add(new Person("Alice", 30, "alice@email.com"));
        people.add(new Person("David", 25, "david@email.com"));
        people.add(new Person("Bryan", 15, "bryan@email.com"));

        /*
         * Before java 8
         */
        Comparator<Person> comparatorPersonByAge = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };
        Collections.sort(people, comparatorPersonByAge);
        System.out.println("Ordering by age:");
        people.forEach(p -> System.out.println(p.getName()));
        System.out.println("\n");

        /*
         * After java 8
         */
        Comparator<Person> comparatorPersonByAgeWithLambda = Comparator.comparingInt(Person::getAge);
        Collections.sort(people, comparatorPersonByAgeWithLambda);
        System.out.println("Ordering by age With Lambda:");
        people.forEach(p -> System.out.println(p.getName()));
        System.out.println("\n");

        Comparator<Person> comparatorPersonByNameWithLambda = Comparator.comparing(Person::getName);
        Collections.sort(people, comparatorPersonByNameWithLambda);
        System.out.println("Ordering by name With Lambda:");
        people.forEach(p -> System.out.println(p.getName()));
        System.out.println("\n");
        
    }
}
