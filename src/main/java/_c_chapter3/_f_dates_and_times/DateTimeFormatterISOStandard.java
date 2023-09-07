package _c_chapter3._f_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterISOStandard {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 15);
		LocalTime time = LocalTime.of(07, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);

		System.out.println(date); //2020-01-15
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE)); // 2020-01-15
		
		
		// sau viceversa
		System.out.println("viceversa: ");
		
		
		System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(date)); // 2020-01-15

		System.out.println(time); //07:12:34
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME)); // 07:12:34

		System.out.println(dateTime); //2020-01-15T07:12:34
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // 2020-01-15T07:12:34
	}
}
