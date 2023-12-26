package Gun60;

public class S56 {
    public static void main(String[] args) {
        String names[]= {"Thomas","Peter", "Joseph"};
        String pwd[]= new String[3];
        int idx=0;
        try {
            for (String n: names ) {
                pwd[idx] = n.substring(2, 6);
                // Thomas  ->   2. indexten dahil başla , 6 ya kadar 6 dahil değil, parçayı al => omas
                // Peter   ->   2. indexten dahil başla , 6 ya kadar 6 dahil değil fakat 5 dahil => 5 index li eleman var mı?
                // olmadığı için hata verdi.

                System.out.println(pwd[idx]);  // omas ı yazdı
                idx++;
            }
        }catch (Exception e) {
            System.out.println("Invalid Name");
        }
    }
}
// substring(2) -> 2.ye konumlan sonuna kadar al
//omas
//Invalid Name