package Gun09;

import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {


        //   1- Girilen bir sayının birler basamağını ekrana yazdırınız.
        //  1453

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = oku.nextInt();

        int kalan = sayi % 10; // Bir sayının 10 a bölümünden kalan birler basamağını verir.
        System.out.println("Biler basamağı = " + kalan);

    }
}
