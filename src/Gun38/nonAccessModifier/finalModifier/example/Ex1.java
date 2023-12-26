package Gun38.nonAccessModifier.finalModifier.example;

public class Ex1 {
    public static void main(String[] args) {
        // bir dairenin alanı pi*r*r dir.

        int yaricap=4;

        double alan= 4 * 4 * Constants.pi;

       // verilen saat,dakika, ve gün bilgisini
        // saniyeye çeviriniz.

        int gun = 23;
        int saat = 7;
        int dakika=25;

        int saniyeCinsinden =
                gun * Constants.hourInDay *Constants.minuteInHour* Constants.secondInMinute+
                saat* Constants.minuteInHour* Constants.secondInMinute+
                dakika * Constants.secondInMinute;
        System.out.println("saniyeCinsinden = " + saniyeCinsinden);
    }
}
