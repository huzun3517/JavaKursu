package Gun32.example.Ex1;

public class Ex1 {
    // 1.Adım  :Person isimli bir class yazınız:fields: name, surname, age; olsun.
    // 2.Adım  :main de 2 tane bu sınıftan nesne oluşturup değer atayınız.
    // 3.Adım  :getBirthYear isminde Person a ait bir metod yazınız, çalıştığında kişinin doğum yılını versin.
    // 4.Adım  :getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi şeklinde (Büyük harf) veren metodu yazınız
        // örnek ahmet demir : A.D.

    public static void main(String[] args) {
        Person kisi1=new Person();
        kisi1.name = "Yusuf";
        kisi1.surname = "Yılmaz";
        kisi1.age = 35;

        //1.Yöntem oldukça uğraştırıcı
        System.out.println("kisi1.name = " + kisi1.name);
        System.out.println("kisi1.surname = " + kisi1.surname);
        System.out.println("kisi1.age = " + kisi1.age);

        Person kisi2=new Person();
        kisi2.name = "Ayşe";
        kisi2.surname = "Demir";
        kisi2.age = 30;

        //1.Yöntem oldukça uğraştırıcı
        System.out.println("kisi2.name = " + kisi2.name);
        System.out.println("kisi2.surname = " + kisi2.surname);
        System.out.println("kisi2.age = " + kisi2.age);

        //2.Yöntemin kullanılması : kendi başına yazdır, fakat her nesne için böyle yazarsak oldukça karışır
        BilgiYadir(kisi1); // bu yöntemde parametre göndermek zorun kalıyorum, uğraştırıcı
        BilgiYadir(kisi2);

        //3.Yöntemin main de kullanılması
        kisi1.BilgiYadir(); // bu yöntemde parametre zaten kendisin içinde, büyük kolaylık
        kisi2.BilgiYadir();

        System.out.println("kisi1 in doğum yılı = " + kisi1.getBirthYear());
        System.out.println("kisi2 in doğum yılı = " + kisi2.getBirthYear());

        System.out.println("kisi1.getInitials() = " + kisi1.getInitials());
        System.out.println("kisi2.getInitials() = " + kisi2.getInitials());
    }

    //2.Yöntem iyi metod kullandık, fakat
    public static void BilgiYadir(Person kisi)
    {
        System.out.println("metod.name = " + kisi.name);
        System.out.println("metod.surname = " + kisi.surname);
        System.out.println("metod.age = " + kisi.age);
    }
}

class Person
{
    // fields, attributes, properties
    String name;
    String surname;
    int age;

    // methods
    void BilgiYadir()  //3.Yöntem ait olduğu class a ekleniyor ve en iyi yöntemi bulmuş oluyoruz
    {
        System.out.print("kisi.name = " + name);
        System.out.print(" kisi.surname = " + surname);
        System.out.println(" kisi.age = " + age);
    }

    int getBirthYear()
    {
        return 2020-age;
    }

    // 4.Adım  :getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi şeklinde (Büyük harf) veren metodu yazınız
    // örnek ahmet demir : A.D.
    String getInitials()
    {
        return name.toUpperCase().charAt(0)+"."+surname.toUpperCase().charAt(0)+".";
    }

}


