package Gun50.task1;

public class Ogrenci extends kisi{
    private double okulUcret;

    public Ogrenci(String isim, String adres, Okul okul, UyeTipi uyeTipi, double okulUcreti) {
        super(isim, adres, okul, uyeTipi);
        setOkulUcret(okulUcreti);
    }

    public double getOkulUcret() {
        return okulUcret;
    }

    public void setOkulUcret(double okulUcret) {
        this.okulUcret = okulUcret;
    }

    @Override
    public String toString() {
        return super.toString()+" "+getOkulUcret();
    }
}
