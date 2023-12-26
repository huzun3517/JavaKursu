package Gun43.Odev;

public class Test {

//TODO
// Günün Sorusu :
//  Müşterinin alacağı bir ürün için taksit yapılcacaktır.
//  Kullanıcıdan Alıncak olan malın ücret bilgisini ve kaç taksit olacağı bilgisini alınız.
//  Taksit rakamları kuruşlu çıkıyorsa kuruşlar toplanıp, son taksite eklensin.
//  Günün tarihine göre 1 ay atlatarak oluşan taksit tarihi ve ödencek taksit miktarının listesini yazdırınız.

    public static void main(String[] args) {

        AlisVeris gs = new AlisVeris();
        gs.secilenUrunler = gs.urunSec(gs);
        for (Urunler urunler : gs.secilenUrunler) {
            System.out.println(urunler.toString());
        }
        gs.hesaplaToplamAlisVerisTutari();
        gs.taksit = gs.taksitBelirle();
        gs.taksitlendir();
        gs.taksitleriYazdir();

    }
}