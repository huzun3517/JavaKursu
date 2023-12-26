package Gun20_Project2;

import java.util.Scanner;

public class Common2Arrays {

    /*
         Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
         Both arrays will be length 1 or more.

        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true

     */

    /*

        a ve b den oluşan 2 int array verildiğinde, aynı ilk öğeye sahiplerse veya aynı son öğeye sahiplerse true değerini döndürün.

        Her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.

       commonEnd([1, 2, 3], [7, 3]) → true
       commonEnd([1, 2, 3], [7, 3, 2]) → false
       commonEnd([1, 2, 3], [1, 3]) → true

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

        int[] array1 = new int[3];
        int[] array2 = new int[arrInt.length-array1.length];

        for (int i = 0; i < array1.length ; i++) {
            array1[i] = arrInt[i];
        }

        for (int i = 3; i < arrInt.length ; i++) {
            array2[i-array1.length] = arrInt[i];
        }


/*
        your code start here .
        Use array 1 and array 2 .
        Don't change or delete anything before this line


        // Bu satırdan önceki satırlarda hicbirşeyi silme ve degiştirme
        // koda burdan basla
        // array1 and array2  kullan
 */

        boolean b = false;

        if (array1[0] == array2[0] || array1[array1.length-1] == array2[array2.length-1]){
            b = true;
        }
        else {
            b = false;
        }
        System.out.println(b);
    }
}