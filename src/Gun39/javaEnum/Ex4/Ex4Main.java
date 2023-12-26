package Gun39.javaEnum.Ex4;

public class Ex4Main {

    public static void main(String[] args) {
        Months ay=Months.MART;
        // atama anında constructer gibi
        // çalışan bölüm : Months(int gunMiktari)
        // gun miktarını dayse set ediyor.

        ay.getGunMiktari();

        System.out.println("ay.days = " + ay.days);
        System.out.println("ay = " + ay);

//        switch (ay)
//        {
//            case OCAK:
//                System.out.println("31");
//                break;
//
//            case SUBAT:
//                System.out.println("28");
//                break;
//
//            case MART:
//                System.out.println("31");
//                break;
//
//            case NISAN:
//                System.out.println("31");
//                break;
//        }
    }




}
