package Gun38.nonAccessModifier.staticModifier;

public class Ogrenciler {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci("Ali","Yılmaz");
        Ogrenci ogr2=new Ogrenci("Ayşe","Demir");
//        ...
//        ...
//        ...
        Ogrenci ogr500=new Ogrenci("mehmet","kaya");
        // 500 tane öğrenci oluşturuldu.

        ogr1.print();
        ogr2.print();
        ogr500.print();

        //1- Kural static field a sadece class dan erişilir
        //2- Kural diğer field lara sadece new ile oluşturulmuş nesnelerden
        //   ulaşılır.
        //3- Ancak oluşturulmuş bir nesnenin metodlarında
        //   static değişkene ulaşılabilir.



    }
}
