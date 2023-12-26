package Gun32.tasks.task2;

public class ElectricityAccount {
    int totalKw=0;
    double rate=0.7;
    double bill;

    // Kendisine verilen tüketim değerini totalKw isimli değişkene ekleyerek toplam tüketimi oluşturuyor.
    void tuketimEkle(int tuketim)
    {
         totalKw += tuketim;
    }

    double totalBill()
    {
        bill=rate*totalKw;
        return bill;
    }
}
