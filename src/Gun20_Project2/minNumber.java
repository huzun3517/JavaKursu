package Gun20_Project2;

public class minNumber {

      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

         int 2D arrayini  olustur

        2D arrayinden min number print et

     */




    public static void main(String[] args) {

        int [][] arr=new int[][]{{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        int min= arr[0] [0];

        for (int satir =0; satir<arr.length; satir++){

            for (int sutun=0; sutun<arr[satir].length; sutun++ ) {
                if (min > arr[satir][sutun])
                    min = arr[satir][sutun];
            }
        }
        System.out.println("min = " + min);
    }





}
