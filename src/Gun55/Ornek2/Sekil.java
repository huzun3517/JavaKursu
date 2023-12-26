package Gun55.Ornek2;

public abstract class Sekil {
    private String name;

    public Sekil(String name) {
        setName(name);
    }

    public  Sekil()
    {
        System.out.println("kullanılıyor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  abstract double alan();
    public  abstract double cevre();

    @Override
    public String toString() {
        return "ismi = "+this.name +
                "\nAlan="+ Math.round(this.alan())+
                "\nCevre="+ Math.round(this.cevre());
    }

    public String toString2() {
        String formatliCevre=String.format("%-10.2f" , this.cevre());
        // toplam 10 hane noktadan sonra ise 2 hane
        // - ise sola dayalı yazar
        return "ismi = "+this.name +
                "\nAlan="+ Math.round(this.alan())+
                "\nCevre="+ formatliCevre;
    }

    public void ciz()
    {
        System.out.println(this.name+" çizildi..");
    }
}
