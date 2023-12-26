package Gun43.Odev;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AlisVeris {

    ArrayList<Urunler> secilenUrunler = new ArrayList<>();
    double toplamAlisVerisTutari;
    int taksit;
    LinkedHashMap<LocalDate, Double> taksitler = new LinkedHashMap<>();

    void taksitleriYazdir(){
        System.out.println("Aldiginiz Ürünler : ");
        System.out.println("-------------------");
        for (Urunler urunler : secilenUrunler) {
            System.out.println(urunler.toString());
        }
        System.out.println("Toplam Ödenecek Miktar : " + toplamAlisVerisTutari);
        System.out.println("Tercih Edilen Taksit Miktari : " + taksit);
        System.out.println("Ödeme Tablosu : ");
        System.out.println("---------------");
        int i=0;
        System.out.printf("%-15s%-15s%s%n","Taksitler", "Ödeme Tarihi", "Fiyat");
        for (Map.Entry<LocalDate, Double> entry : taksitler.entrySet())
            System.out.printf("%2d%-13s%-15s%.2f%n",++i,". taksit", entry.getKey(), entry.getValue());

    }

    void taksitlendir(){
        LocalDate bugun = LocalDate.now();
        LocalDate ilkOdemeTarihi = LocalDate.of(bugun.getYear(), bugun.getMonth(), 15);

        int tamTaksitTutari = (int)(toplamAlisVerisTutari/taksit);
        int i=1;
        for (; i < taksit; i++) {
            taksitler.put(ilkOdemeTarihi.plusMonths(i), (double)tamTaksitTutari);
        }
        taksitler.put(ilkOdemeTarihi.plusMonths(i), toplamAlisVerisTutari - ((i-1)*tamTaksitTutari));
    }

    int taksitBelirle(){
        boolean secimTamam = false;
        String secim = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("%-20s%.2f%n", "Ödemeniz Gereken Toplam Tutar : ", toplamAlisVerisTutari);
            System.out.print("Kac Taksit Yapilsin : ");
            secim = sc.nextLine();
            if (urunSecimKontrolu(secim)) {
                secimTamam = true;
            }
        } while (!secimTamam);
        return Integer.parseInt(secim);
    }

    void hesaplaToplamAlisVerisTutari(){
        double fiyat = 0;
        for (Urunler urunler : secilenUrunler) {
            fiyat += urunler.getPrice();
        }
        toplamAlisVerisTutari = fiyat;
    }

    ArrayList<Urunler> urunSec(AlisVeris gs){
        boolean secimTamam = false;
        String secim = "";
        Scanner sc = new Scanner(System.in);
        do {
            menuListe();
            System.out.println("Almak istediginiz ürünlerin numarasini giriniz, Birden fazla ürün secebilirsiniz (13  gibi)");
            System.out.print("Secimleriniz : ");
            secim = sc.nextLine();
            secim = secim.replaceAll("[^12345]","");
            if (urunSecimKontrolu(secim)) {
                secimTamam = true;
            }
        } while (!secimTamam);
        return strToUrunArray(secim);
    }

    boolean urunSecimKontrolu(String str){
        boolean ret = false;
        try {
            long i = Long.parseLong(str);
            ret = true;
        }catch (Exception e){
            ret = false;
        }
        return ret;
    }

    void menuListe(){
        int i = 0;
        for(Urunler urun : Urunler.values())
            System.out.println(++i + "\t" + urun.toString());
    }

    ArrayList<Urunler> strToUrunArray(String str){
        String[] strArr = str.split("");
        ArrayList<Urunler> urunler = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++)
            urunler.add(Urunler.values()[Integer.parseInt(strArr[i])-1]);

        return urunler;
    }

}


enum Urunler{
    TVLED("Televizyon", 723.00,"55 inch Led"),
    SAMSUNGA20("Samsung A20", 211.50,"2019 model Samsung A20"),
    IPHONE10("Iphone-10", 456.99,"2019, Iphone 10, 16 GB "),
    IPHONE11("Iphone 11", 789.99,"2020, Iphone 11, 32 GB"),
    LT_TOSHIBA_1("Toshiba Laptop", 565.50,"Toshina 4x1.8 Ghz, 16 GB"),
    LT_ACER_1("Acer Laptop", 370.50,"Acer 1.6 4xGhz, 8 GB")
    ;


    private String name;
    private double price;
    private String details;

    Urunler(String name, double price, String details){
        this.name = name;
        this.price = price;
        this.details = details;
    }

    String getName(){
        return this.name;
    }

    double getPrice(){
        return this.price;
    }

    String getDetails(){
        return this.details;
    }

    public String toString(){
        String str=this.name;
        for (int i=0; i < 20-this.name.length(); i++)
            str +=" ";
        str += this.getDetails();

        for (int i=0; i < 30-this.details.length(); i++)
            str +=" ";

        str += getPrice();
        return str;
    }

}


