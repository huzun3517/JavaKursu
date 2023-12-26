package Gun15_Project1;

import java.util.Scanner;

public class RandomNum {
     /*

    Kullanıcıdan pozitif bir sayı alınız ve
    0 ile girilen sayı arasında Random int tipinde bir sayı üreten programı yazınız.

    not : girilen sayı üretilen sayılara dahil olmalı

  */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int min = 0;

        int random = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println(random);





    }
}