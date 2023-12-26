package Gun53.Tasks.task1;

public class GeoMain {
    public static void main(String[] args) {
        Dikdortgen dd=new Dikdortgen();
        System.out.println("DD Alan="+dd.alani(4,5));
        System.out.println("DD Çevre="+dd.cevresi(4,5));

        Cember cem=new Cember();
        System.out.println("Çember Alan="+cem.alani(5));
        System.out.println("Çember çevre="+cem.cevresi(5));

        Kare kare=new Kare();
        System.out.println("Kare Alan="+kare.alani(4));
        System.out.println("Kare Çevre="+kare.cevresi(4));
    }
}
