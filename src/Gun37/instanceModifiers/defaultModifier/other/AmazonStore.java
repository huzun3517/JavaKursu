package Gun37.instanceModifiers.defaultModifier.other;

import Gun37.instanceModifiers.defaultModifier.same.Book;

public class AmazonStore {
    public static void main(String[] args) {
        //Book kitap1=new Book(); // default olduğundan
        // diğer paketten ulaşılamaz.

        Book kitap2=new Book("yağmur");
        // bu constructor a ulaşabildim çünkü public
    }
}
