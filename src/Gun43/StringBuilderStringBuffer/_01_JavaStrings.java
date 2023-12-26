package Gun43.StringBuilderStringBuffer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _01_JavaStrings {
    public static void main(String[] args) {

        String cumle="";
        cumle += "Bugün";
        cumle += " hava"; // String değişkeni çok fazla ekleme veya işlemlere göre perfomansı oldukça düşük.

        // Eğer çok fazla String işlemleri yapacaksak bunun için performansı oldukça iyi olanStringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.Fakat paralel çalışan uygulamalarda güvenli değildir.Ozaman StringBuffer kullanılır.

        // String , StringBuilder, StringBuffer
        
        StringBuilder s=new StringBuilder("Bu");
        
        s.append("gün");  // add gibi ekleme yapıyor bu yüzden tekrar atamaya gerek yok
        s.append(" hava");
        s.append(" çok sıcak");

        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());
        s.append(4); // ne eklenirse eklensin hepsi strine dönüşüyor

        s.reverse(); // stringi tersine çeviriyor
        System.out.println("s = " + s);

        s.delete(0,5); // 0 dahil 5 hariç 5 e kadar, olan bölümü sildi.
        System.out.println("s = " + s);

        s.deleteCharAt(3); // sadece 0 indexten itibaren verilen index teki karakteri siler
        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());// değişkenin içindeki karakter sayısı
        System.out.println("s.capacity() = " + s.capacity()); // hafızada genişleyebilmesi için
        // verilmiş ön alan, ancak eklendikçe artan bir alan, tampon genişleyebilme alanı

        s.insert(5, "545"); // 5 nolu indexe inset yaptı
        System.out.println("s = " + s);

        s.insert(4, 3.45); // double bile eklenebilir ama strine çevirip ekleyecektir.
        System.out.println("s = " + s);

        int[] dizi={2,3,4,5,506};

        s.insert(6, Arrays.toString(dizi)); // dizi insert edildi.
        System.out.println("s = " + s);

        // burada içeriği yeniledik.
        s=new StringBuilder("Bugünhavaçoksıcak");
        System.out.println("s = " + s);
        s.replace(3,8, "bu"); // başlangıç ve son verilen bölüme verilen stringi atar, eğer verilen büyük ise aradaki
        // bölüm delete olur. üst sınır hariç
        System.out.println("s = " + s);
    }
}
