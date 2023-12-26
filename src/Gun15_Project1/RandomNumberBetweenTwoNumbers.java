package Gun15_Project1;

import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {

    /*
     Girilen 2 sayı arasında Random integer sayı üreten programı yazınız.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int min = scanner.nextInt();

        int random = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println(random);




    }
}
