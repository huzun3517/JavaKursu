package Gun30_Project4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class sortHashSet {

    public static void main(String[] args) {

        HashSet<Integer> allNumbers =new HashSet<>(Arrays.asList(1,5,3,7,5,9,9,9,66));

        System.out.println(sort(allNumbers));
    }

    /*
        Given allNumbers Integer Hashset

        Sort the allNumbers hashset

        Change the result to ArrayList

        Return the ArrayList

        NOTE : DO NOT USE COLLECTION CLASS WHILE SOLVING THE QUESTION USE FOR LOOP OR DIFFERENT SET TYPES

     */


    /*
         allNumbers Integer Hashset  verildiğinde

         allNumbers hashset'i sort et

        Sonucu ArrayList olarak değiştir

        Return  ArrayList

        NOT : SORUYU ÇÖZERKEN COLLECTİON CLASS KULLANMA , FOR LOOP VEYA FARKLI SET TİPLERINI KULLANIN


     */
    public static ArrayList<Integer> sort(HashSet<Integer> allNumbers){  //1,5,3,7,5,9,66

        TreeSet<Integer> tree = new TreeSet<>(allNumbers); // 1 , 3 , 5 , 7, ,9 , 66

        ArrayList<Integer> result = new ArrayList<>(tree); // 1 , 3 , 5 , 7, ,9 , 66

        return result;
    }
}
