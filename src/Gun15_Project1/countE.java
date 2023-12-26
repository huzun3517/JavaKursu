package Gun15_Project1;

import java.util.Scanner;

public class countE {

    /*
    Girilen bir string de kaç tane b harfi olduğunu yazdırınız.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();


        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin


        int sayac = 0;
        int b = 0;
        while (sayac < text.length()){


            if (text.charAt(sayac) == 'b')
                b++;
            sayac++;

        }
        System.out.println(b);










    }
}
