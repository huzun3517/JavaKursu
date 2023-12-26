package Gun54.Tasks.Sorular;

public class Soru1 {
    public static void main(String args[]) {
        int num1 = 10;
        int num2 = 0;
        int result = 0;
        int input[] = new int[5];
        try {
            input[0] = 0;
            input[1] = 1;
            input[2] = 2;
            input[3] = 3;
            input[4] = 4;
            input[5] = 5; // burada hata oluşacak hata : diziniye fazla eleman eklenmeye çalışılması
            result = num1 / num2;
            System.out.println("Result of Division : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Err: Divided by Zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Err: Array Out of Bound");
        }
    }
}
