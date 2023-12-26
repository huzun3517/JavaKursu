package Gun49.task2.pak1;

public class pak1Main {
    public static void main(String[] args) {
        pak1Hayvan hayvan1= new pak1Hayvan();
        hayvan1.ad="karakedi";
        hayvan1.yas=2;
        hayvan1.cinsi="tekir"; // kendi paketinin içinde default gibi çalışıyor.
        //hayvan1.renk="";  çünkü private diper classlardan erişilemez
    }
}
