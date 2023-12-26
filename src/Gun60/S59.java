package Gun60;

public class S59 {
    public static void main(String[] args) {
        int[] intArr = {8,16,32,64,128};

        //E
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i] + " ");
        }

        //B
        for (int i : intArr){
            System.out.println(i + " ");
        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i] + " ");// for döngüsünde intArr[i] yazdırılmalı
        }

        for (int i : intArr){
            System.out.println(i + " ");// for eachde ise intArr i'ye atandığı için i print edilmeli
        }

    }
}
