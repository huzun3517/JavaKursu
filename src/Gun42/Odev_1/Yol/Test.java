package Gun42.Odev_1.Yol;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        System.out.println("Çıkış için q tuşuna basınız...\n");

        Registration userReg = new Registration();
        ArrayList<User> register = userReg.register();
        userReg.printHappyUsers(register);

    }
}
