package newDateApis;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {

    public static void main(String[] args) {
        //LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date: " + localDate);

        LocalDate localDate1 = LocalDate.of(1991, 10, 30);
        System.out.println("Local Date 1: " + localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(1991, 303);
        System.out.println("Local Date 2: " + localDate2);

        /*
        * Get values from localDate
         */
        System.out.println("Month: " + localDate.getMonth());
        System.out.println("Month Value: " + localDate.getMonthValue());
        System.out.println("Day of the Week: " + localDate.getDayOfWeek());
        System.out.println("Day of the Year: " + localDate.getDayOfYear());
        System.out.println("Day of the Month: " + localDate.get(ChronoField.DAY_OF_MONTH));

        /*
        *  Modifying Local Date
         */
        System.out.println("Local Date added 2 days: " + localDate.plusDays(2));
    }
}
