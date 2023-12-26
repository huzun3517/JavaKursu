package Gun29;
// Kullanıcıya
// 1-Ekleme
// 2-Listeleme
// 3-Arama
// 4-Düzeltme
// 5-Çıkış
// Seçeneklerini vererek username,password, userType (Müdür, çalışan) dan oluşan bir Map tanımlayınız.
// Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
// Mainde sadece Seçenekler ve metodların çağrılması olsun.

// Bölüm bölüm gidiyoruz önce mainin içini tasarlayınız.


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

/*  Kullanıcıya
    1-User Ekleme
    2-Listeleme
    3-Arama
    4-Düzeltme
    5-Çıkış
    Seçeneklerini vererek username ve password, userType(Müdür, çalışan)den oluşan bir Map tanımlayınız.
    Kullanıcının seçimine göre her bir işlemi ayrı metotta yaptırınız.
    Mainde sadece Seçenekler ve metotların çağrılması olsun.
    Bölüm bölüm gidiyoruz önce Main in içini tasarlayınız.
 */

    public static void main(String[] args) {

        Map<String, Map<String,String>> users = new HashMap<>();

        Scanner scanner = new Scanner(System.in);


        int secim = 0;

        do {
            System.out.println("*****MENU*****");
            System.out.println("1-Ekleme");
            System.out.println("2-Listeleme");
            System.out.println("3-Arama");
            System.out.println("4-Düzeltme");
            System.out.println("5-Çıkış");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1: Ekleme(users);
                    break;
                case 2: Listeleme(users);
                    break;
                case 3: Arama(users);
                    break;
                case 4: Duzeltme(users);
                    break;
            }
        }while (secim != 5);


    }
    public static void Ekleme(Map<String, Map<String,String>> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Passwort: ");
        String passwort = scanner.nextLine();

        System.out.print("userType: ");
        String userType = scanner.nextLine();

        Map<String,String> bilgilerMap = new HashMap<>();

        bilgilerMap.put("passwort",passwort);
        bilgilerMap.put("userType",userType);
        users.put(username,bilgilerMap);
    }

    public static void Listeleme(Map<String, Map<String,String>> users) {

        System.out.println("users = " + users);
    }

    public static void Arama(Map<String, Map<String,String>> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username giriniz: ");
        String username = scanner.nextLine();
        System.out.println(users.get(username));
    }

    public static void Duzeltme(Map<String, Map<String,String>> users) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Username giriniz: ");
        String username = scanner.nextLine();

        System.out.print("Yeni passwort giriniz: ");
        String yenipass = scanner.nextLine();

        System.out.print("Yeni usertipi giriniz: ");
        String yeniusertip = scanner.nextLine();

        users.get(username).put("passwort",yenipass);
        users.get(username).put("userType",yeniusertip);
    }
}
