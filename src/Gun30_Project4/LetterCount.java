package Gun30_Project4;

import java.util.LinkedHashMap;

public class LetterCount {

    public static void main(String[] args) {

        System.out.println( charCount("aabbbccccd"));
    }

    /*
            Given one String
            Get an each char from String return the count of the each char

            For Example

            String = aabbbcccc

            return should be a , 2
                             b , 3
                             c , 4

            Note: There could be any char in the String.

     */

    /*
            Girdiğiniz String parametresinin herbir karakterinin(char) sayısını
            döndüren charCount methodunu yazın

            Örnek:

            String = aabbbcccc

            return     a , 2     olmalı
                       b , 3
                       c , 4

            Not: Stringde herhangi bir char olabilir.

     */

    public static LinkedHashMap<Character, Integer> charCount(String myStr){

        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();

        char[] arr = myStr.toCharArray();

        for ( char c:arr) {
            if (result.containsKey(c)){
                result.put(c,result.get(c)+1);
            }
            else {
                result.put(c,1);
            }
        }
        return  result;
    }
}









