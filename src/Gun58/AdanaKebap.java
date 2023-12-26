package Gun58;

public class AdanaKebap implements IFood {
    @Override
    public void taste() {
        System.out.println("Etin en güzel hallerinden biri");
    }

    @Override
    public double ucret() {
        return 5.0;
    }

    public void marinade()
    {
        System.out.println("Et dünden özel baharatla marine edildi.");
    }

    public void grill()
    {
        System.out.println("hafif ateşte pişirildi.");
    }
}
