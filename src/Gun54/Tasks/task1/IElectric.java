package Gun54.Tasks.task1;

// bir interface bir başka interface den mirasını aldık, yani extend ettik.
public interface IElectric extends IVehicle{
    final static int batteryLife=100;

    String changeBattery();
    //soyut yani süslü parantezli kısmı olmayan,
    // yani gövdesi olmayan
    // sadece adı ve paramatereleri olan metodlara
    // Abstract Metod denir.

    // Interface lerde sadece aşağıdaki 2 şekilde gövdeli
    // metod kullanılabilir

    // default belirteciyle, implemente zorunlu değil.
    default void print()
    {
        System.out.println("default belirteciyle metod yazılabilir.");
    }

    // veya static şekilde
    static void autoPilot()
    {
        System.out.println("otonom sürüş modu.");
    }
}
