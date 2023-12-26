package Gun61;

public class S18 {
    public static void main(String[] args) {

        String [][] chs = new  String [5][2];  // 5 satır 2 sutun chs.leng => 5


        chs[0] = new String[2];
        chs[1] = new String[5];

        // chs[0].length -> 2 , chs[1].length => 5

        int i =97;

        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs[a].length; b++) { // chs[0] ın sadec 2 elemanı var fakat bu for 5 e kadar yazdırmak istiyor.
                // ArrayIndexOutOfBoundsException  hatası verir.
                chs[a][b]= ""+i;
                i++;
            }
        }
        for (String [] ca: chs ) {
            for (String c: ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
