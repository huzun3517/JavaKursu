package Gun09;

import java.util.Scanner;

public class Odev4 {

    public static void main(String[] args) {

        //   4-Girilen 3 basamaklı bir sayının basamaklarının toplamını ekrana yazdırınız
        // 453 -> 4 + 5 + 3 = 12

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üç basamaklı bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int birler= (sayi % 10) ;
        int onlar = (sayi / 10) % 10;
        int yuzler = (sayi / 100) % 10;

        int basamaktoplam = birler + onlar + yuzler;
        System.out.println("Basamak toplamı = " + basamaktoplam);

    }
}
