package Gun51.finalAttribute2;

public class Arabalar {
    public static void main(String[] args) {
        Araba araba=new Araba("opel");
        System.out.println(araba.model);

        //araba.model="ford";
        // final tipi değişkenleredeilk değer sadece
        // tanımlandığı yerde veya
        // consructor da atanabilir.
        // sonradan değiştirelemez.


        Araba araba2=new Araba("ford");

    }
}
