package _c_chapter3._f_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class ConvertingToLong1970 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now().toEpochDay()); //returns the number of days since January 1, 1970
        System.out.println(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));//returns the number of seconds since January 1, 1970
    }
}
