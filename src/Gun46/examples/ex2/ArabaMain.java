package Gun46.examples.ex2;

public class ArabaMain {
    public static void main(String[] args) {
        Araba bentley = new Araba();

        bentley.setRenk("kırmızı");
        bentley.setModel("benteyga");
        bentley.setMotor(4500);
        bentley.setKapiSayisi(2);

        Araba porsche=new Araba("mavi", "911Turbo", 3600, 2);
        Araba toyota=new Araba("beyaz", "camry", 1600, -2);
        System.out.println("toyota.kapiSayisi = " + toyota.getKapiSayisi());

    }
}
