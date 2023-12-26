package Gun46.examples.ex1;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1=new Kisi();

        kisi1.ad ="Mustafa";
        kisi1.soyad = "Gültekin";
        kisi1.setYas(-25);

        System.out.println("kisi1.getYas() = " + kisi1.getYas());


    }
}
