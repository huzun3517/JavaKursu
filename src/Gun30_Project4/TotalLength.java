package Gun30_Project4;

import java.util.Arrays;
import java.util.HashSet;

public class TotalLength {
    public static void main(String[] args) {

         HashSet<String> mySet = new HashSet<>(Arrays.asList("repl","is","homework"));

        System.out.println( getTotalLength(mySet));
    }

    /*

       Parameter is one Set String

       Get the total length of each String in the Set
       return the total

       Example:
       Set String is "repl" "is" "homework"

       result should be 14

       NOTE : IF RESULT IS EQUAL TO 0 THEN CHANGE IT TO -1

     */


    /*

       Parametresi  Set String olan ve Set içindeki Stringlerin uzunluklarının
       toplamını döndüren getTotalLength methodunu yazın.

       return total



       Örnek:

       Set String "repl" "is" "homework"

       result  14 olmalı

       NOT : EĞER SONUÇ 0'A EŞİT OLURSA -1 İLE DEĞİŞTİR

     */

    public static int getTotalLength(HashSet<String> mySet){

        int toplam=0;
        for (String a:mySet) {
            toplam+=a.length();
        }

        if (toplam==0)
            return -1;
        else return toplam;
    }
}

