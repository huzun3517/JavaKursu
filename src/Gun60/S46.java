package Gun60;

public class S46 {
    public static void main(String[] args) {

        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];

        int idx = 0;
        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6);  // 1.Adımda omas  0.indexe attı, Peter da hata verdi.

                idx++;
            }
        } catch (Exception e) {
            System.out.println("Invalid Name");  // Peter adımında buraya düştü, ekrana Invalid Name yazdı.
        }

        for (String p : pwd) {
            System.out.println(p);  // omas , null, null
        }

    }
}

//    Invalid Name
//        omas
//        null
//        null
