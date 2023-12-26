package Gun09;

import java.util.Scanner;

public class Odev7 {

    public static void main(String[] args) {

        // 7-Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bulunuz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize notu: ");
        int vize = scanner.nextInt();

        System.out.print("Final notu: ");
        int fin = scanner.nextInt();

        double ort = vize * 0.4 + fin * 0.6;
        System.out.println("Not ortalaması = " + ort);
    }
}
