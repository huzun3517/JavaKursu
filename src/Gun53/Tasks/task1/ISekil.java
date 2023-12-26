package Gun53.Tasks.task1;

public interface ISekil {
    final double PI=3.14;

    // int ... kullanıldığında gelen bütün sayılar
    // dizinin bir elemanı gibi işlem görür ve dizi değişkenine
    // atanır
    int cevresi(int ...dizi);
    int alani(int ...dizi);
}
//    cevresi(int ...dizi) nin anlamı
//    bu metod a birden fazla int değer
//        2,3,4 şeklind egönderilebilir demektir.
//        ve diz[0] , dizi[1], dizi[2] gibi gelen sayı kadar
//        işlem görür.