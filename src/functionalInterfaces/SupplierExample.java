package functionalInterfaces;

import entity.Person;
import entity.Student;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Person> personSupplier = () -> new Person("Lucas", 32, "lspeixotodev@gmail.com");

        Person person = personSupplier.get();
        System.out.println(person.getName() + " has " + person.getAge() + " years old!");
        System.out.println(person.getName() + " emails`s: " + person.getEmail());

        Supplier<Student> studentSupplier = () -> {
            return new Student("Lucas", 4, 3.9, "male", Arrays.asList("powerlifting", "arm wrestling", "bodybuilding", "football"));
        };

        System.out.println(studentSupplier.get());
    }
}
