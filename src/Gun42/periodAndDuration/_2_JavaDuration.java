package Gun42.periodAndDuration;

import java.time.Duration;
import java.time.LocalTime;

public class _2_JavaDuration {
    public static void main(String[] args) {

        LocalTime geceYarisi = LocalTime.of(0,0);
        LocalTime ogleVakti = LocalTime.of(13,3, 2, 5);

        Duration fark=Duration.between(geceYarisi, ogleVakti);

        System.out.println("fark = " + fark);
        System.out.println("fark.toMillis() = " + fark.toMillis());

        System.out.println("fark.toHours() = " + fark.toHours());  // Gün dahil Toplam saati veriri
        System.out.println("fark.toMinutes() = " + fark.toMinutes()); // saat dahil toplam dakikayı veriri
        System.out.println("fark.toDays() = " + fark.toDays()); // Toplam günü verir

        System.out.println("fark.toHoursPart() = " + fark.toHoursPart());  // Bu bölüm sadece saat bölümünü verir
        System.out.println("fark.toMinutesPart() = " + fark.toMinutesPart()); // bu bölüm sadece bölümünü dakikayı verir, toplamı vermez
        System.out.println("fark.toSecondsPart() = " + fark.toSecondsPart()); // bu bölüm saniye bölümünü verir.
        System.out.println("fark.toMillisPart() = " + fark.toMillisPart()); // bu bölüm sadece milisaniyeyi verir
        System.out.println("fark.toNanosPart() = " + fark.toNanosPart()); // bu bölüm sadece nanosaniye parçasını veririr
    }
}
