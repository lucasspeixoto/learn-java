package newDateApis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NewDateTimeExample {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");

    public static void main(String[] args) {
        //LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date: " + localDate);

        //LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time: " + localTime);

        //LocalTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date Time: " + localDateTime.format(formatter));
    }
}
