package Gun20_Project2;

import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicates {

    /*
        Given int array

        remove the duplicated values from the array

        print non-duplicated array length

        for example:

        Array is 1,2,2,2,3,3,3,4,4,4,5,5,5

//1 2 2 2 3 3 3 4 4 4 5 5 5
        result should be 5

        NOTE: while printing the result dont use for loop
        use System.out.println(Arrays.toString(your_array_name));
     */


    /*
       Verilen int array

       duplicated(tekrarlanan) öğeleri array den kaldır

        non-duplicated(tekrarlanmayan) öğeleri print et

       Örnek:

       Array is 1,2,2,2,3,3,3,4,4,4,5,5,5

       result  [1,2,3,4,5] olmalı

       NOT: resultu print ederken for loop kullanmayın
       System.out.println(Arrays.toString(your_array_name));  kullanın
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] arr = myStr.split(" ");

        int[] useThisArray = new int[arr.length];

        for(int i = 0 ; i < useThisArray.length ; i++){

            int num = Integer.parseInt(arr[i]);

            useThisArray[i] = num;

        }

//        code start here
//        dont change anything before this line
//        your Array is useThisLine

      // Kodlamaya burdan başla.bu satırdan önceki satirlarda hicbirşeyi  degiştirme.
      // useThisArray arrayini kullan

        int ilkuzunluk=useThisArray.length;
        int [] gecici=new int[ilkuzunluk];

        Arrays.sort(useThisArray);
        int sıfırsayısı=0;
        for(int i=0;i<ilkuzunluk-1;i++)
            if (useThisArray[i]!=useThisArray[i+1])
                gecici[i]=useThisArray[i];
            else {gecici[i]=0; sıfırsayısı++;}
        gecici[ilkuzunluk-1]=useThisArray[ilkuzunluk-1];
        Arrays.sort(gecici);

        int [] sonuc=new int[ilkuzunluk-sıfırsayısı];
        for (int i=sıfırsayısı;i<ilkuzunluk;i++)
            sonuc[i-sıfırsayısı]=gecici[i];
        System.out.println(Arrays.toString(sonuc));

        /*
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (Integer num : arr) {
            treeSet.add(num);
            num++;
        }
        System.out.println(treeSet);

         */



    }


}
