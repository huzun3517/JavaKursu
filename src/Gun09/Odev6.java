package Gun09;

public class Odev6 {

    public static void main(String[] args) {

        // 6-2020 yılına kadar geçen gün sayısını bulunuz.

        int son_yil = 2020;
        int artık_yil = son_yil / 4; // 4 yılda bir yıl 366 gündür

        int gun_sayisi= artık_yil + (son_yil * 365);

        System.out.println("Geçen gün sayısı = " + gun_sayisi);
    }
}
