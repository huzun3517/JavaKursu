package Gun44.Odev;

import java.util.Scanner;

public class Test {

    /*TODO
        1- Girilen bir stringi int e çeviren bir program yazınız.
        Girişler scannerla nextLine ile alınacak
        Çevirme işlemini bir metod ile yapınız ve oluşabilecek hataları bir metod içinde kontrol ediniz.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {
                System.out.print("Bir sayı giriniz: ");
                String sayi = scanner.nextLine();
                cevirInt(sayi);
                break;
            } catch (NumberFormatException hata) {
                System.out.println("Hatalı giriş yaptınız...");
                System.out.println("Lütfen rakam giriniz...");

            } catch (Exception hata) {
                System.out.println("Hatalı giriş yaptınız...");
            }

        }
    }


    public static void cevirInt(String str) {

        int num = Integer.parseInt(str);
        System.out.println(num);


    }
}
