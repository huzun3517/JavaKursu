package Gun54.Tasks.task1;

public class Bus extends Vehicle implements IDiesel {

    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDeisel() {
        return "Bir depo mazot ile 1000 km gider.";
    }

    @Override
    public String drive() {
        return "Yavaş süre, yolcuları rahatsız etme";
    }
}
