package Gun20_Project2;

public class maxNumber {


      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

        print the max number from the 2d array

     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

         int 2D arrayini  olustur

        2D arrayinden max number print et

     */


    public static void main(String[] args) {

        int [][] arr=new int[][]{{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
        int max= arr[0] [0];

        for (int satir =0; satir<arr.length; satir++){

            for (int sutun=0; sutun<arr[satir].length; sutun++ ) {
                if (max < arr[satir][sutun])
                    max = arr[satir][sutun];
            }
        }
        System.out.println("max = " + max);
    }
}
