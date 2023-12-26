package Gun37.instanceModifiers.defaultModifier.same;

public class BookStore {

    public static void main(String[] args) {
        // aynı paketin içinde olduğundan
        // default a ulaşabildik.
        Book kitap1=new Book();
        kitap1.name ="Lord of the Rings";


        //zaten public olduğundan sınır yoktu
        Book kitap2 = new Book("kar");
    }
}
