package Gun49.task1;

public class Sekil {
    //Sekil
    //   Cember
    //   Dikdortgen
    //         Kare

    @Override
    public String toString() {
        return "Sekil : Bilgi yok ";
    }

    public double getAlan()
    {
        throw new RuntimeException("Bu sınıfın bu metod özelliği yoktur");
    }

    public  double getCevre()
    {
        throw new RuntimeException("Bu sınıfa bu metod implemente(entegre) edilmemiştir");
    }

}
