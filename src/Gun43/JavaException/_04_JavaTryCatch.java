package Gun43.JavaException;

import java.time.LocalDate;
import java.time.Month;

public class _04_JavaTryCatch {

    public static void main(String[] args) {

        try { // dene, hatanın başladığı yerin üstüne konur
            LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
            System.out.println(" işlem tamam");
        } // hatanın bittiği yerde parantez kapatılır
        catch(Exception hata) // hata isimli değişkende oluşan hataların bilgisi atanıyor
        {
            // hata olduğunda en yazpılacağı buraya yazılıyor.
//            System.out.println("hata oldu");
//            System.out.println("hata: " +   " tarih dönüşüm hatası");
            System.out.println("hata.getMessage() = " + hata.getMessage()); // hata mesajını verir
            hata.printStackTrace(); // hatanın geçtiği aşamaları yazar
        }

        System.out.println("Programın sonuna kadar gelindi.");

        try{
            // Java Öğren
        }
        catch(Exception hata){
            // anlaşılamadı
            // hızlıca konuları tekrar et
            // zaman az
        }

        // Sonunda inş iyi bir meslek ve kazanç seni bekliyor.







    }
}
