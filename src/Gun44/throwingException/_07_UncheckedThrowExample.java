package Gun44.throwingException;

import java.util.Scanner;

public class _07_UncheckedThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Kullanıcı adı giriniz=");
        String username=oku.nextLine();

        try {
            if (username.length() < 6)
                throw new Exception("6 karakterden az olamaz");
            // throw ile kendimiz hata oluşturuyoruz.
            // böylece kritelerimize girmeyenler için de
            // catch bloğunua düşürerek, paratik kullaanım sağlıyoruz.

            if (username.length() > 10)
                throw new Exception("10 karakterden fazla olamaz");
        }
        catch(Exception ex)
        {
            System.out.println("ex = " + ex);
        }
    }
}
