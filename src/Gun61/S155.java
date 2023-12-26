package Gun61;

import java.util.ArrayList;

public class S155 {
    public static void main(String[] args) {
        Integer sayi=null;
        S155 obje=null;

        ArrayList<Integer> points = new ArrayList<>();

        points.add(1);  // points.remove( (Object)1 );  1 değerinin olduğu elemanı siler.
        points.add(2);  // points.remove( (Integer)1 );
        points.add(3);
        points.add(4);
        points.add(null);

        points.remove(1);  // 1,3,4,null
        // kim silinir 1 değerli elemanlı silinir yoksa 1 indexli elemanlı ? indexli olan silinir 2 değeri silinir.
        points.remove(null); // 1,3,4
        // remove metodu hem indexe hem de objeye göre siler, fakat önce indexe bakar.

        points.add(9);
        points.remove( (Object)9 ); // Object e dönüştürerek remove metodunu kullanırsak değeri 9 olan elemanı bulurak siler.

        System.out.println(points);
    }
}
// [1, 3, 4]