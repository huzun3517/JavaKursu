package Gun60;

public class S64 {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length ; i++) {

            System.out.println(arr[i]+ " ");  // A

            if (arr[i].equals("C")) {   // ilk adımdayız A olduğu için çalışmadı
                continue;
            }

            System.out.println("Work done");  // Work Done

            break; // döngüyü kırdı.
        }

    }
}
