package _c_chapter3._f_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterCustom {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 13);
        LocalTime time = LocalTime.of(11,12,34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f1)); //Januar 13, 2020, 11:12

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("M d, yy, h:m");
        System.out.println(dateTime.format(f2)); //1 13, 20, 11:12

        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("M d yy h m");
        System.out.println(dateTime.format(f3)); //1 13 20 11 12
    }
}
