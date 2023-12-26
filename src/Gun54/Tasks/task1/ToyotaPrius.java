package Gun54.Tasks.task1;

public class ToyotaPrius extends Vehicle implements IElectric,IGas{

    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Ömür boyu degiştirmeden sür";
    }

    @Override
    public String changeOil() {
        return "30 litre benzin ile 1000 km yol al";
    }

    @Override
    public String drive() {
        return "ilk 10 km elektirikte kullanir";
    }
}
