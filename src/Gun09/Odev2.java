package Gun09;

import java.util.Scanner;

public class Odev2 {

    public static void main(String[] args) {
        //  2- Girilen bir sayının onlar basamağını ekrana yazdırınız.
        //  1071

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int bolum = sayi/10; // Bir sayıyı 10 a böleriz ve bölümü alırız.
        int kalan = bolum % 10;  // bölümün 10 a bölümünden kalan onlar basamağını verir.

        System.out.println("Yüz basamağı = " + kalan);
    }
}
