package Gun61;

public class S87 {
    public static void main(String[] args) {

        int n[][] = {{1, 3}, {2, 4}};

        for (int i = n.length - 1; i >= 0; i--) {
            for (int j = n[i].length - 1; j >= 0; j--) {
                System.out.print(n[i][j]);
                // 1,1 -> 4
                // 1,0 -> 2
                // 0,1 -> 3
                // 0,0 -> 1
            }

        }
    }
}
// 4231