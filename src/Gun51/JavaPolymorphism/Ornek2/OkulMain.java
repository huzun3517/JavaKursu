package Gun51.JavaPolymorphism.Ornek2;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci("Özal", "Soyad", "öğrenci", "4a");
        Calisan cal1=new Calisan("Faruk", "Soyad", "öğretmen", "eğitim");

        Kisi.kimlikYaz(ogr1);
        Kisi.kimlikYaz(cal1);

        // ogr1 nesnesinin ait oladuğu class ın basit adı
        System.out.println( ogr1.getClass().getSimpleName());

        // ogr1 nesnesinin ait oladuğu class ın  üst  class ının basit adı
        System.out.println( ogr1.getClass().getSuperclass().getSimpleName());

    }
}
