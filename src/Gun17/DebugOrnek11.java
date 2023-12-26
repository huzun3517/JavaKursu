package Gun17;

public class DebugOrnek11 {
    public static void main(String[] args) {

        dis_dongu : for (int i = 1; i < 10; i++) {

            ic_dongu : for (int j = 1; j < 10; j++) {

                if (j==3)break dis_dongu;

                System.out.println("i= " + i + ", j= " + j);

            }

            System.out.println();

        }

    }
}
