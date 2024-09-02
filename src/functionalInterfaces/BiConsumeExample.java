package functionalInterfaces;

import entity.Student;
import entity.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumeExample {

    public static void nameAndActivities() {

        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
            System.out.println(
                    name +
                            ": " +
                            activities.stream().map(String::toLowerCase).toList()
            );
        };

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach((student) -> {
            biConsumer.accept(student.getName(), student.getActivities());
        });
    }

    public static void main(String[] args) {

        BiConsumer<String, String> firstByConsumer = (name, lastName) ->
                System.out.println("Name: " + name + "\nLast Name: " + lastName);

        //firstByConsumer.accept("Lucas", "Peixoto");


        BiConsumer<Integer, Integer> sumByConsumer = (firstValue, secondValue) -> {
            System.out.println("Sum is: " + (firstValue + secondValue));
        };

        BiConsumer<Integer, Integer> multiplicationByConsumer = (firstValue, secondValue) -> {
            System.out.println("Multiplication is: " + (firstValue * secondValue));
        };

        BiConsumer<Integer, Integer> divisionByConsumer = (firstValue, secondValue) -> {
            System.out.println("Division is: " + (firstValue / secondValue));
        };

        //multiplicationByConsumer.andThen(divisionByConsumer).accept(10, 2);

        nameAndActivities();
    }
}
