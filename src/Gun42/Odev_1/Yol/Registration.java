package Gun42.Odev_1.Yol;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    ArrayList<User> userlist = new ArrayList<>();

    public ArrayList<User> register() {

        Scanner scanner = new Scanner(System.in);
        String username;

        do {
            System.out.print("Kullanıcı adı giriniz: ");
            username = scanner.nextLine();
            User user = new User(username, LocalDateTime.now());

            if (username.equals("q")){
                System.out.println("Çıkış yapılıyor...");
                System.out.println();
                break;
            }

            if (username.length() > 0){
                userlist.add(user);
            }

        }while (username.length() > 0);

        return userlist;
    }

    void printHappyUsers(ArrayList<User> userlist) {
        System.out.println("Şanslı kullanıcılar: ");

        for (User user: userlist){

            if (user.registerDate.getSecond() <= 10){
                System.out.println("isim: " + user.name);
                System.out.println("Kayıt Zamanı: " + user.registerDate.getSecond() + " saniye");
                System.out.println("--------------------------");
            }
        }
    }
}
