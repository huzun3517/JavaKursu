package Gun42.Odev_2.Yol;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    ArrayList<User> users = new ArrayList<>();

    ArrayList<User> register(){
        Scanner sc = new Scanner(System.in);
        String userName;
        do {
            System.out.print("Kullanici Adini Giriniz : ");
            userName = sc.nextLine();
            User user = new User(userName, LocalDateTime.now());

            if (userName.equals("q")){
                System.out.println("Çıkış yapılıyor...");
                System.out.println();
                break;
            }
            if (userName.length()>0) users.add(user);
        }while (userName.length() > 0);

        return users;
    }

    void printHappyUsers(ArrayList<User> users){
        String formatStr = "%-20s%-10s%n";
        System.out.println("Sansli Kullanicilar : ");
        System.out.printf(formatStr, "Username", "Registation Second");;
        for (User user : users){
            if (user.registerDate.getSecond() <= 10)
                System.out.printf(formatStr, user.name, user.registerDate.getSecond());
        }
    }
}