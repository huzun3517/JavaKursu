package Gun58;

public class Borsh implements IFood{
    @Override
    public void taste() {
        System.out.println("Yeni tadlar denemek lazım");
    }

    @Override
    public double ucret() {
        return 3;
    }

    public void boil()
    {
        System.out.println("Kısık ateşte kaynatılıyor..");
    }

    public void eatTomarrow()
    {
        System.out.println("Bir gün dinlendirilmiş olarak servis ediliyor.");
    }

}
