package Gun51.finalMethod;

public class Araba extends Tasit {
    public Araba(String model) {
        super(model);
    }

//    @Override
//    public String toString() {
//        return getModel();
//    }

    // yazdırma metodu toString final tipinde
    // olduğundan override edilemez yani
    // değiştirilemez.
}
