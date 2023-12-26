package Gun15_Project1;

import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
        Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle.

        Eger ilk kelimenin son harfi, ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın

        Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
         */

        Scanner scan = new Scanner(System.in);
        String str1= scan.nextLine();
        String str2= scan.nextLine();

        str1 = str1.trim().replaceAll("\\s+","");
        str2 = str2.trim().replaceAll("\\s+","");

        if(str1.substring(str1.length()-1).equals(str2.substring(0,1))){

            System.out.println(str1.concat(str2.substring(1)));
        }else{
            System.out.println(str1.concat(str2));
        }
    }

}