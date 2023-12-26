package Gun54.Tasks.task1;

import java.util.ArrayList;

public class OtoGaleri {
    public static void main(String[] args) {

        TeslaCar tesla=new TeslaCar("Tesla p90", 310);
        ToyotaPrius toyota=new ToyotaPrius("pirus",1200);
        Bus otobus=new Bus("302", 6000);

        tesla.print();
        IElectric.autoPilot();

        ArrayList<Vehicle> arabalar=new ArrayList<>();
        ArrayList<IVehicle> arabalar2= new ArrayList<>();

        arabalar.add(tesla);
        arabalar.add(toyota);
        arabalar.add(otobus);

        for(Vehicle arac: arabalar)
        {
            System.out.println( arac.getClass().getSimpleName());
        }

    }
}
