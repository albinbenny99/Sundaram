package JAVA8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateApi {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyy");

        System.out.println(today.format(formatter));
        LocalTime time= LocalTime.now().plusHours(1);
        System.out.println(today+""+time);
    }
}
