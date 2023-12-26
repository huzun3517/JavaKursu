package Gun25_Project3;

import java.util.Scanner;

public class soru4_ThreeEvenOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı dizisi giriniz: ");
        String str = scanner.nextLine();

        String []dizistr = str.trim().split("[ ]+");
        int [] dizi = new int[dizistr.length];

        for (int i = 0; i <dizi.length ; i++) {
            dizi[i] = Integer.parseInt(dizistr[i]);
        }

        boolean sonuc = threeEvenOrOdd(dizi);
        System.out.println(sonuc);
    }
    public static boolean threeEvenOrOdd(int[]arr) {
        int sayacC = 0;
        int sayacT = 0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] % 2 == 0)
                sayacC++;

            if (arr[i] % 2 == 1)
                sayacT++;
            }

        if (sayacC == 3 || sayacT == 3)
            return true;

        else return false;
    }
}
 /*
        ThreeEvenOdd
  threeEvenOrOdd  isminde int Array paramaetre alan bir metod yazınız. Bu metod kendisine
  gönderilen Array de 3 tane çift veya 3 tane tek var ise true geri döndürsün. Yok ise
  false göndersin.

  Örnek:

   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı
     */
