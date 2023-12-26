package Gun61;

public class S152 {
    public static void main(String[] args) {

        int n [][] = {{1,3}, {2,4}};

        for(int i = n.length -1; i >= 0; i--){ // i=1 den başlıyor yani önce 1.satırın indexi gönderiliyor

            for(int y : n[i]){  // n[i] -> n[1] -> 2,4
                System.out.print(y); // önce 2,4 yazar , sonra 1,3
            }
        }

    }
}
// 2413