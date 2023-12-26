package Gun50.task1;

public class kisi {
    private String isim;
    private String adres;
    private Okul okul;
    private UyeTipi uyeTipi;

    public kisi(String isim, String adres, Okul okul, UyeTipi uyeTipi) {
        setIsim(isim);
        setAdres(adres);
        setOkul(okul);
        setUyeTipi(uyeTipi);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Okul getOkul() {
        return okul;
    }

    public void setOkul(Okul okul) {
        this.okul = okul;
    }

    public UyeTipi getUyeTipi() {
        return uyeTipi;
    }

    public void setUyeTipi(UyeTipi uyeTipi) {
        this.uyeTipi = uyeTipi;
    }

    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", okul = "+ getOkul().getIsim()+

//                ", okul=" + okul +  // Bu bölüm main de okul toString
                        //metodu çalıştırılınca çalışan ve öğrenci nin
                        //üst classı olan kisi sınıfındaki buradaki
                        // okul değişkenini tekrar çağırarak sonsuz
                        // döngü oluşturduğundan Runtime Error verdi.
                        // bu yüzden kaldırıldı.

//                        Kendi Kendini çağıran metodlara Recursive Metod denir.
//
//        Main de
//
//        println(okul)-> okul.toString(); -> ogrencileri (Ogrenci.toString) -> kisi.toString() -> okul.toString()

                ", uyeTipi=" + uyeTipi
                ;
    }
}
