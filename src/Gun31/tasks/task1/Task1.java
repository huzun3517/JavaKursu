package Gun31.tasks.task1;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        // 1) create class student with fields: string name, int not
        // 2) Daha sonra 3 tane öğrenci ve notu oluşturun. ve bu öğrencileri bir ArrayList e ekleyin.
        // 3) Daha öğrenci bilgilerin yazdıran bir metod yazarak , Arraylist teki öğrenci bilgilerini döngü yazdırınız.
        // 4) Daha sonra bütün öğrencilerin not ortalamasını bir metod aracılığı bularak main de yazdırınız.


        //2.Kısımı
        Student ogr1=new Student();
        Student ogr2=new Student();
        Student ogr3=new Student();

        ogr1.name="Ahmet";
        ogr1.not=95;
        ogr2.name="Ayşe";
        ogr2.not=98;
        ogr3.name="Kaya";
        ogr3.not=60;

        ArrayList<Student> ogrenciler=new ArrayList<>();
        ogrenciler.add(ogr1);
        ogrenciler.add(ogr2);
        ogrenciler.add(ogr3);
        /********************************/


        BilgiYazdir(ogrenciler);

        System.out.println("ortalama = " + OrtalamaBul(ogrenciler));
        System.out.printf("ortalama = %6.2f" , OrtalamaBul(ogrenciler));
    }

    //3.Kısım
    public static void BilgiYazdir(ArrayList<Student> ogrenciler)
    {
        for(Student ogr: ogrenciler)
        {
            System.out.println("ogr.name= " + ogr.name+" Notu="+ogr.not);
        }
    }

    public static double OrtalamaBul(ArrayList<Student> ogrenciler)
    {
        double ort=0;
        double toplam=0;
        for(Student ogr: ogrenciler)
        {
            toplam += ogr.not;
        }

        ort=toplam / ogrenciler.size();

        return ort;
    }


}

//1.Kısımı
class Student{
    String name;
    int not;
}
