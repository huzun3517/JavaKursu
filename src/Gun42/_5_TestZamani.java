package Gun42;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;

public class _5_TestZamani {
    public static void main(String[] args) {

        // What is the class in Java that contains only time?  LocalTime
        // What is the class in java.util.* that contains only date?  LocalDate

        // Which of the following can be inserted into the blank to create a date of June 21, 2014?
        LocalDate date =LocalDate.of(2014, Month.JUNE, 21);  // DF

//        A. new LocalDate(2014, 5, 21);
//        B. new LocalDate(2014, 6, 21);
//        C. LocalDate.of(2014, 5, 21);
//        D. LocalDate.of(2014, 6, 21);
//        E. LocalDate.of(2014, Calendar.JUNE, 21);
//        F. LocalDate.of(2014, Month.JUNE, 21);


        // What is the output of the following code?
//        LocalDate date2 = LocalDate.of(2018, Month.APRIL, 40);
//        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); // f

//        A. 2018 APRIL 4
//        B. 2018 APRIL 30
//        C. 2018 MAY 10
//        D. Another date.
//        E. The code does not compile.
//        F. A runtime exception is thrown.


//        What is the output of the following code?
        LocalDate date3 = LocalDate.of(2018, Month.APRIL, 30);
        date.plusDays(2);
        date.plusYears(3);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); // B

//        A. 2018 APRIL 2
//        B. 2018 APRIL 30
//        C. 2018 MAY 2
//        D. 2021 APRIL 2
//        E. 2021 APRIL 30
//        F. 2021 MAY 2
//        G. A runtime exception is thrown.


//        What is the output of the following code?
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);  // of ifadesi ile en son eklenen geçerlidir
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(d.format(f));

//        A. 5/9/13 11:22
//        B. 5/10/13 11:22
//        C. 5/9/14
//        D. 5/10/14
//        E. The code does not compile.
//        F. A runtime exception is thrown.




    }
}
