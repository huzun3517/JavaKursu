package Gun25_Project3;

import java.util.Scanner;

public class soru3_SubtractionSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayı : ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci sayı : ");
        int num2 = scanner.nextInt();

        int sonuc = substSquare(num1,num2);
        System.out.println(sonuc);
    }

    public static int getSumOfSquares(int n) {

        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum += i;
        }
        return sum*sum;

    }
    public static int substSquare(int num1, int num2){

        return  getSumOfSquares(num1)+getSumOfSquares(num2);
    }
}
/*
        SubtractionSquare:
   getSumOfSquares adında bir sayı alan ve bu sayıya kadar olan sayıları
   toplayıp çıkan sonucun karesini döndüren bir metod yazınız.

   substSquare isminde 2 adet int parametre alan ve int sonuç döndüren bir metod daha yazınız.

   main den   substSquare   metoduna 2 tane sayı gönderiniz, bu metodun içinden de
   getSumOfSquares metodunu çağırarak gönderilen bu iki sayı için işlem sonuçlarını toplayarak
   main metodundan yazdırınız.
    Örnek:
    int 1 = 10;              yazacağınız method 10 u kullanarak 3250 sonucu verir
    int 2 = 5;                yazacağınız method 5 i kullanarak 225 sonucu verir
    3025 + 225 = 3250
    return 3250
         */
