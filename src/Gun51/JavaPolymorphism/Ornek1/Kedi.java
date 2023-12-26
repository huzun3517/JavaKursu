package Gun51.JavaPolymorphism.Ornek1;

public class Kedi extends Hayvan {

    public Kedi(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("miyavladı");
    }

}
