package Gun62;

public class S52 {
    int num;
    public static void graceMarks (S52 obj4){ // metodlara gönderilen referans tipli değişkenlerin referansı gider
        // yeni nesne oluşmaz.
        obj4.num += 10;
    }
    public static void main (String[]args){

        S52 obj1 = new S52(); // bir new ile nesne yani instance oluşturuldu.
        S52 obj2 = obj1; // yeni nesne yok, sadece yeni referans diğer referansa eşitlendi.
        S52 obj3 = null; // burda ise yeni bir nesnesi olmayan referans oluşturuldu.


        obj2.num = 60;
        graceMarks(obj2);
    }
}
// bu soruda sadece bir new olduğundan sadece 1 inctance yani bir nesne oluşmuştur.