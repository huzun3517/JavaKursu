package Gun46.examples.ex2;

public class Araba {
     private String renk;
     private String model;
     private int motor;
     private int kapiSayisi;

     public Araba(){

     }

     public Araba(String renk, String model, int motor, int kapiSayisi) {
          setRenk(renk);
          setModel(model);
          setMotor(motor);
          setKapiSayisi(kapiSayisi);
     }

     public void setKapiSayisi(int kapiSayisi) {
          if (kapiSayisi == 2 || kapiSayisi == 4)
               this.kapiSayisi = kapiSayisi;
          else
               System.out.println("Kapı sayısı 2 veya 4 olabilir");
     }

     public String getRenk() {
          return renk;
     }

     public void setRenk(String renk) {
          this.renk = renk;
     }

     public String getModel() {
          return model;
     }

     public void setModel(String model) {
          this.model = model;
     }

     public int getMotor() {
          return motor;
     }

     public void setMotor(int motor) {
          this.motor = motor;
     }

     public int getKapiSayisi() {
          return kapiSayisi;
     }


}
