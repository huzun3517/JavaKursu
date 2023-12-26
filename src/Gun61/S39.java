package Gun61;

public class S39 {
    public static void main(String[] args) {

        String shirts[][] = new String[2][2];

        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

//        for(int i=0;i< shirts.length ; i++)
//        {
//            for(int j=0; j< shirts[i].length;j++)
//            {
//                System.out.print(shirts[i][j]+":");
//            }
//        }

        for(String[] c:  shirts) { // shirts 2 boyutlu diziyi : c ise her bir satırı temsil ediyor

            for (String s : c) { // c gelen satırı : s ise satırdaki sıradaki elelamnı temsil ediyor.
                System.out.print(s+":");
            }
        }
    }
}
