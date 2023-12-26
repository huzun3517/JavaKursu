package Gun15_Project1;

import java.util.Scanner;

public class factorialNumber {

    public static void main(String[] args) {

        /*
        Girilen bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720

         */
            // 3! = 3*2*1

         //      kodu burdan başlatın

        Scanner scanner = new Scanner(System.in);

        int sayi = scanner.nextInt();

   /*     int faktoriyel = 1;
        while (sayi > 0) {
            faktoriyel = faktoriyel * sayi;
            sayi--;
        }
        System.out.println(faktoriyel);

    */   int f = 1;

        for (int i =1; i<=sayi; i++){
            f *= i;
        }
        System.out.println(f);

    }
}
