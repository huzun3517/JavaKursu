package Gun42.periodAndDuration;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class _1_JavaPeriod {
    public static void main(String[] args) {

        LocalDate bugun= LocalDate.now();

        Period period3Gun= Period.ofDays(3); // 3 günlük bir zaman tutuyor.
        Period ceyrekYil = Period.ofMonths(3); // 3 aylık bir zamn dilimi.

        bugun = bugun.plusDays(3); // 3 gün ekleme
        bugun = bugun.plus(period3Gun); // bu da 3 gün ekleme
        bugun = bugun.minus(ceyrekYil); // bu 3 ay eksiltme

        LocalDate kursBaslangic = LocalDate.of(2020, 5, 25);
        Period kursSure = Period.ofMonths(6);
        LocalDate kursBitis = kursBaslangic.plus(kursSure);
        System.out.println("kursBitis = " + kursBitis.format(DateTimeFormatter.ISO_DATE));
        System.out.println("kursBitis gün= " + kursBitis.getDayOfWeek());
    }
}
