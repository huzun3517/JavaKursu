package Gun61;

public class S17 {
    public static void main(String[] args) {
        int [][] arr = new  int [2][4];  // 2 satır  4sütun demektir  toplam 8 elemanlı.

        arr[0] = new int[]{1,3,5,7};
        arr[1] = new int[]{1,3};

        for (int [] a: arr ) { // 0.Satırı ve 1.Satırı
            for (int i: a ) { // o satırdaki elemanları
                System.out.print(i + " ");  // 1357  13
            }
            System.out.println();
        }


    }
}

//1 3 5 7
//        1 3