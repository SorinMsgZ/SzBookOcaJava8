package _c_chapter3._f_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterPredefined {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.APRIL, 10);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);

		
		//with predefined formatter
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

		System.out.println(shortDateTime.format(dateTime));//10.04.20
		System.out.println(shortDateTime.format(date));//10.04.20
//        System.out.println(shortDateTime.format(time)); //-> UnsupportedTemporalTypeException

//ALTERNATIV - viceversa:

		System.out.println(dateTime.format(shortDateTime));//10.04.20
		System.out.println(date.format(shortDateTime));//10.04.20
//        System.out.println(time.format(shortDateTime)); //-> UnsupportedTemporalTypeException

	}
}
