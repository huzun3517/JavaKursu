package Gun61;

public class S82 {
    public static void main(String[] args) {
        String [][] chs = new  String [2][];

        chs[0] = new String[2];
        chs[1] = new String[5];

        int i =97;
        for (int a = 0; a < chs.length; a++) {  // for unu sınırı kaşa kadar ? 2
            for (int b = 0; b < chs.length; b++) { // for un sınırı kaşa kadar ? 2
                // 1.satır  : 97 98   2.Satır:  99 100  null null null
                chs[a][b]= ""+i; // inti Stringe cevirmis, "" ile yoksa hata veriyor
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
