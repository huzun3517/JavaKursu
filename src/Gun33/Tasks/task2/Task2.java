package Gun33.Tasks.task2;

import java.util.ArrayList;

public class Task2 {
    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Ders sınınıfı ayrı dosyada : adı: Lesson , fields : name, credit (1-3 arasında değer alıyor)
    // 2- Öğrenci Sınıfı ayrı dosyada: adı: Student, fields : name, maxCredit, dersleri listesini
    // tutacak bir liste
    // 3- 3 adet ders oluşturunuz.
    // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
    // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
    //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
    //    uyarı versi, alabileceğiniz max credi doldu şeklinde.
    // Ödev
    // 6- Aşağıdaki ders oluşturma kısmı için ilgili sınıfta lessonCreate adında bir metod
    //    oluşturunuz
    // 7- Öğrenciye ders ekleme bölümünü yine ilgili sınıfta bir metod olarak yazınız.


    public static void main(String[] args) {


          Lesson mat101=new Lesson();
          mat101.name="Matematik";
          mat101.credit=3;

          Lesson java101=new Lesson();
          java101.name="Java Programming";
          java101.credit=6;

          Lesson fiz101=new Lesson();
          fiz101.name="Fizik";
          fiz101.credit=4;

          Student ogrenci1=new Student();
          ogrenci1.name="Kemal";
          ogrenci1.maxCredit =10;

          ogrenci1.dersListesi=new ArrayList<>();

          // buraya kontrol konacak toplam aldığı krediye bakılarak
        // Eklenecek ders ile öğrencinin o ana kadarki kredisi toplamı
        // öğrencinin alabileceği max krediyi aşmıyorsa ekle
          if (ogrenci1.totalCredit()+ mat101.credit <= ogrenci1.maxCredit) {
              ogrenci1.dersListesi.add(mat101);
          }
          else
          {
              System.out.println("mat101 için Alabileceğiniz Kredi miktarı doldu");
          }

          if (ogrenci1.totalCredit()+ fiz101.credit <= ogrenci1.maxCredit) {
              ogrenci1.dersListesi.add(fiz101);
          }
          else
          {
              System.out.println("fiz101 için Alabileceğiniz Kredi miktarı doldu");
          }

          if (ogrenci1.totalCredit()+ java101.credit <= ogrenci1.maxCredit) {
              ogrenci1.dersListesi.add(java101);
          }
          else
          {
              System.out.println("java101 için Alabileceğiniz Kredi miktarı doldu");
          }



    }

}
