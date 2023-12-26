package Gun39.javaEnum.Ex2;

public class Ex2Main {

    public static void main(String[] args) {
//        User kullanici=new User();
//        kullanici.name="Alperen";
//        kullanici.Role=1;
//        kullanici.Status=2;
//
//        User kullanici2=new User();
//        kullanici.name="Çiğdem";
//        kullanici.Role=1;
//        kullanici.Status=1;

          User kul1=new User();
          kul1.name="Alperen";
          kul1.yetkisi = Role.ADMIN;
          kul1.durum = Status.ACTIVE;

          User kul2 = new User();
          kul2.yetkisi = Role.CUSTOMER;
          kul2.durum = Status.INACTIVE;


          if (kul2.yetkisi == Role.ADMIN)
          {
              // silme işlemini yap
          }

        // Önceden belli olan sabit verilerin
        // atanmasındaki anlama zorluğu yerine
        // bu değerlerin karşılıkları ENUM ile
        // tanımlanarak , atama değeri için kullanılrlar.
        // Bu durum yazma ve anlama kolaylığı sağlar.
    }
}
