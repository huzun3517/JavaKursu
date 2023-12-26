package Gun50.task2;
// Girilen bir sayının basamaklarına göre tersiniz yazdırınız.

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.println("Tersi alınacak bir sayı giriniz=");
        int sayi=oku.nextInt();
        int tersiSayi=0;

        // 23452 -> 2  -> 2*10 +5

        while (sayi > 0)
        {
            int basamak = sayi%10;
            sayi=sayi/10;
            tersiSayi =  tersiSayi * 10 + basamak;
        }

        //    basamak  sayı     tersiSayı
        // 1-     2     2345       2
        // 2-     5     234        25
        // 3-     4     23         254
        // 4-     3     2          2543
        // 5-     2     0          25432

    }
}
