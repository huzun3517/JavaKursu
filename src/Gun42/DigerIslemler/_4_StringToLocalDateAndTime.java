package Gun42.DigerIslemler;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _4_StringToLocalDateAndTime {
    public static void main(String[] args) {
        
        String strDate="01 25 2020";

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM dd yyyy"); // String değeri tarihe çevirmek için format belirledik.
        LocalDate tarih = LocalDate.parse(strDate, format);                   // Stringin formatı bu formata uygun olmalı.parse ile çevirdik.

        System.out.println("tarih = " + tarih);

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("MM.dd.yyyy"); // Ekrana yazdırma formatı belirledik.
        System.out.println("tarih.format(format1) = " + tarih.format(format1));  // istediğimiz formatla yazdırdık

        String strTime = "12:49";
        LocalTime time = LocalTime.parse(strTime);  // parse ile string olan zaman bilgisi, LocalTime tipi gerçek zaman değişkenine
        System.out.println("time = " + time);      // çevirdik.
    }
}
