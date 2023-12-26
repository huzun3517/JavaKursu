package Gun49.task4;

public class Okul {
    public static void main(String[] args) {

        LiseOgrencisi lo1=new LiseOgrencisi("ahmet","Lise");
        LiseOgrencisi lo2=new LiseOgrencisi("ali","Lise");

        ilkOgrencisi io1=new ilkOgrencisi("ayşe","ilk");
        ilkOgrencisi io2=new ilkOgrencisi("mehmet","ilk");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io1 = " + io1);
        System.out.println("io2 = " + io2);
    }
}
