package Gun58;

public class TechnoKitchen {

    public static void Pisir(IFood yemek){
        System.out.println("===="+yemek.getClass().getSimpleName()+"==== hazırlanıyor..");

          if (yemek instanceof AdanaKebap)
          {
              AdanaKebap kebap=(AdanaKebap)yemek;
              kebap.marinade();
              kebap.grill();
          }
          else
          if (yemek instanceof Lahmacun)
          {
              Lahmacun l=(Lahmacun)yemek;
              l.dough();
              l.topping();
              l.addMeat();
              l.bake();
          }
          else
          if (yemek instanceof Borsh)
          {
              Borsh b=(Borsh)yemek;
              b.boil();
              b.eatTomarrow();
          }
          else
          if (yemek instanceof Palov)
          {
              Palov p=(Palov)yemek;
              p.fry();
              p.boil();
          }

        yemek.taste();
    }
}
