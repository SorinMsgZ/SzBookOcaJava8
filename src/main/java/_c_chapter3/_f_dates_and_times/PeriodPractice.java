package _c_chapter3._f_dates_and_times;

import java.time.Period;

public class PeriodPractice {
    public static void main(String[] args) {
        Period wrong1 = Period.ofYears(1).ofWeeks(1);
        System.out.println(wrong1); // P7D

        Period wrong2 = Period.ofYears(1);
        wrong2 = Period.ofWeeks(1);
        System.out.println(wrong2); // P7D

        Period everyYearAndAWeek = Period.of(1, 0, 7);
        System.out.println(everyYearAndAWeek); // P1Y7D
    }
}
