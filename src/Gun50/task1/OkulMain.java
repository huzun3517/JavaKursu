package Gun50.task1;

public class OkulMain {

    public static void main(String[] args) {
        Okul okul=new Okul("TechnoStudy", 100);

        Ogrenci ogr1=new Ogrenci("Deniz", "Ümraniye", okul, UyeTipi.OGRENCI, 5000);
        Ogrenci ogr2=new Ogrenci("Davut", "Üsküdar", okul, UyeTipi.OGRENCI, 6000);

        Calisan cal1=new Calisan("Hulya", "Kartal", okul, UyeTipi.CALISAN, 7000);
        Calisan cal2=new Calisan("Mustafa", "Kadıköy", okul, UyeTipi.CALISAN, 8000);

        okul.OgrenciKayit(ogr1);
        okul.OgrenciKayit(ogr2);

        okul.CalisanKayit(cal1);
        okul.CalisanKayit(cal2);

        System.out.println(okul);

        okul.CalisanListele();
        okul.OgrenciListele();



    }

}
