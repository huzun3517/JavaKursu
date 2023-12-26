package Gun61;

public class S71 {
    public static void main(String[] args) {

        int [][] arr = new  int [2][4];

        arr[0] = new int[]{1,3,5,7};
        arr[1] = new int[]{1,3};

        for (int[] a: arr ) {  // 0.satırı ve 1.satırı
            for (int i = 0; i < arr.length; i++) {
                // sınır 2   :  arr.length: arr nin kaç satır olduğunu gösterir, a.leng ise o satırdaki sütun sayısını

                System.out.print(a[i]+ " "); // a[0], a[1]  1 ve 3 ü yazacak 1.satırdan
                // 2.Satıra geçtiğinde yine a[0] ve a[1] yani 2satırın 1 ve 3 ünü yazacak

            }System.out.println();
        }

    }

}
//
//1 3
//        1 3
