package Gun25_Project3;

import java.util.Scanner;

public class soru2_GetPopulation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ülke adının giriniz: ");
        String ulkeadi = scanner.nextLine();

        String[] countryNames = {"USA" ,"Mexico" ,"Canada"};
        int [] countryPopulations = {100000 , 120000 , 130000};

        int sonuc = populationOfCountry(countryNames,countryPopulations,ulkeadi);
        System.out.println(sonuc);

    }
    public static int populationOfCountry(String [] ulkeler, int[] nufuslar, String ulke ) {

        int nufus = 0;

        for (int i = 0; i <ulkeler.length ; i++) {

            if (ulke.equalsIgnoreCase(ulkeler[i])){
                nufus = nufuslar[i];
                break;
            }

            else {
                nufus = -1;
            }

        }
        return nufus;
    }
}
 /*
        getPopulation:
      main de aşağıdaki isimlerle Array leri tanımlayınız.Verilen örnek değerleri kullanabilirsiniz.
      countryNames Ülke isimleri
      countryPopulations Ülke nüfusları

     populationOfCountry adında bir metod yaznız.
     Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (ulkeAdi) alacak

     Eğer Ülke adı countryNames de var ise, aynı sıradaki ülke nüfusunu diğer Array den bulup geri
     göndersin.

      Ornegin;
        countryNames = {"USA" ,"Mexico" ,"Canada"}
        countryPopulations = {100000 , 120000 , 130000}
        str = "Mexico"
        return 120000 olmali
        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali
         */


