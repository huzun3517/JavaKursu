package Gun39.javaEnum.Ex3;
// 1- Bir Kitap sınıfı yazınız, fields : name ve kategori(Enum)
// 2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
// 3- 2 kitap tanımlayınız bir ArrayList e atınız.
// 4- bir kategoriye listeletiniz.

import java.util.ArrayList;

enum gunler1{
    PAZARTESI,SALI
}

public class Ex3Main {

    enum gunler{
        PAZARTESI,SALI
    }

    public static void main(String[] args) {
        Kitap kit1 = new Kitap();
        kit1.name="Sefiller";
        kit1.kategori=KitapKategori.ROMAN;

        Kitap kit2=new Kitap();
        kit2.name = "Beyaz Zambaklar";
        kit2.kategori=KitapKategori.ROMAN;

        ArrayList<Kitap> kitaplar=new ArrayList<>();
        kitaplar.add(kit1);
        kitaplar.add(kit2);

        for(Kitap k : kitaplar)
        {
            if (k.kategori == KitapKategori.ROMAN)
            {
                System.out.println("k.name = " + k.name);
            }
        }

    }
}
