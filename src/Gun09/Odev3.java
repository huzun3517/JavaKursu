package Gun09;

import java.util.Scanner;

public class Odev3 {

    public static void main(String[] args) {

        //  3-Girilen bir sayının yüzler basamağını ekrana yazdırınız.

        //  1984

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int bolum= sayi / 100;    // Bir sayıyı 100 e böleriz ve bölümü alırız.
        int kalan = bolum % 10;   // Bölümün 10 a bölümünden kalan yüzler basamağını verir.

        System.out.println("Yüz basamağı = " + kalan);
    }
}
