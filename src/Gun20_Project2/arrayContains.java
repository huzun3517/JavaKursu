package Gun20_Project2;

import java.util.Scanner;

public class arrayContains {

    /*
        Given two arrays of ints sorted in increasing order,
        outer and inner,
        return true if all of the numbers in inner appear in outer.
        Verify first array contains second array.

        linearIn([1, 2, 4, 6], [2, 4]) → true
        linearIn([1, 2, 4, 6], [2, 3, 4]) → false
        linearIn([1, 2, 4, 4, 6], [2, 4]) → true

     */

    /*

         Aşağıdaki düzende tek line verilen 5 adet eleman , aşağıdaki okuma ile
         ilki 3 ,ikincisi 2 elemanlı 2 adet diziye atılmaktadır.Bu kod vardır.
         İkinci dizinin tüm elemanları 1.nin içerisinde var ise true, yok ise false
         gönderiniz.

         1 2 3 2 3 → 1.dizi :  1,2,3  2.Dizi : 2,3  => true
         10 20 3 1 2 → 1.dizi :  10 20 3  2.Dizi : 1,2  => false
         1 2 3 1 2 → 1.dizi :  1 2 3  2.Dizi : 1 2  => true

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi elemanlarını gir: ");
        String str = scanner.nextLine();

        String[] arrStr = str.trim().replaceAll("\\s+","").split("");

        int[] arrInt = new int[arrStr.length];

        for (int i = 0; i < arrInt.length ; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }

        int[] UseThisArray1 = new int[3];
        int[] UseThisArray2 = new int[arrInt.length-UseThisArray1.length];

        for (int i = 0; i < UseThisArray1.length ; i++) {
            UseThisArray1[i] = arrInt[i];
        }

        for (int i = 3; i < arrInt.length ; i++) {
            UseThisArray2[i-UseThisArray1.length] = arrInt[i];
        }

//        Code start here
//        Use the array name UseThisArray1 and UseThisArray2

//        Koda burdan başla
//        UseThisArray1 ve UseThisArray2 array isimlerini kullan

        int count =0;
        boolean b = false;

        for (int i = 0; i < UseThisArray1.length ; i++) {
            for (int j = 0; j < UseThisArray2.length ; j++) {
                if (UseThisArray2[j] == UseThisArray1[i])
                    count++;
            }
            if (count == UseThisArray2.length){
                b = true;
            }
            else {
                b = false;
            }
        }
        System.out.println(b);
    }
}