package Gun15_Project1;

import java.util.Scanner;

public class getTotal {

     /*
     içinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String okutunuz.
     okunan bu 3 string içindeki negatif de olabilen sayıları toplatın.
     Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.

         Ornek:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output ----> 65; olmali

        String num1 = "$15";
        String num2 = "$-80";
        String num3 = "$30";
        output ----> -1; olmali
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        str1 = str1.trim().replaceAll("[^0-9,-]","");
        str2 = str2.trim().replaceAll("[^0-9,-]","");
        str3 = str3.trim().replaceAll("[^0-9,-]","");

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int num3 = Integer.parseInt(str3);

        int sum = num1 + num2 + num3;
        if (sum > 0){
            System.out.println(sum);
        }
        else {
            System.out.println(-1);
        }

    }
}