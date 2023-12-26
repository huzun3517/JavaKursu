package Gun30_Project4;

public class DigitPowers {

    public static void main(String[] args) {

    //    int sayi = 1234;
        int sonuc = power4(1234);

        System.out.println("sonuc = " + sonuc);
    }
    /*
          Given one method name is power4
          Parameter is one int()
          Return type is an int

          Get each digit from the parameter int number
          Take the each number to the power 4
          Sum powered numbers
          Return the result

          Example: parameter int is 1234

          1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256

          result should be 354
       */
    /*
         Parametresi int ve return tipi int olan power4 isminde method verilmiştir.

        power4 methodu girilen int parametresinin rakamlarının ayrı ayrı 4.kuvvetini alıp toplayın

         Örnek: parameter int is 1234

         1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256

         result  354 olmalı
      */

        public static int power4(int num){

           String str = String.valueOf(num);

           String[] arr = str.split("");

           int[]arrint = new int[arr.length];

            int top =0;

            for (int i = 0; i <arrint.length ; i++) {
                arrint[i] = Integer.parseInt(arr[i]);
                top+= Math.pow(arrint[i],4);  // top = top + arrint[i*i*i*i]
            }

         return top;
        }
}
