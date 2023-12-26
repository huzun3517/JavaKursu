package Gun44.JavaTryCatch;

import java.util.Scanner;

public class _01_TryCatch {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        try {  // hatanın olma ihtimalinin olduğu kodlar bu bloğa alınır
            System.out.print("1.Sayıyı giriniz=");
            int a = oku.nextInt();

            System.out.print("2.Sayıyı giriniz=");
            int b = oku.nextInt();

            int c = a / b;
            System.out.println("c = " + c);
        }
        catch (Exception hata) // hata olduğunda çalışacak bölüm
        {
            System.out.println("hata oldu");
//            System.out.println("hata.getMessage() = " + hata.getMessage());
//            hata.printStackTrace();
            System.out.println("2.Sayıyı 0 vermeyiniz.");
        }
        // 2.Sayı sıfır girildiğinde ArithmeticException
        // harf girildiğinde ise InputMismatchException hatası veriyor.
    }
}
