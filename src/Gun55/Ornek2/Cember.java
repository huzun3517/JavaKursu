package Gun55.Ornek2;

public class Cember extends Sekil {
    private double yaricap;

    public Cember(double yaricap)
    {
        setYaricap(yaricap);
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alan() {
        // pi * r *r
        return Math.PI * yaricap * yaricap;
    }

    @Override
    public double cevre() {
        // 2 * pi * r
        return 2 * Math.PI * yaricap;
    }
}
