package _c_chapter3._f_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterISOStandard {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11,12,34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(date);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE)); //DateTimeFormatter

        System.out.println(time);
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME)); //DateTimeFormatter

        System.out.println(dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); //DateTimeFormatter
    }
}
