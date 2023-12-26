package Gun53.Tasks.task1;

public class Cember implements ISekil{
    @Override
    public int cevresi(int... dizi) {
        // 2*pi*r
        return (int)(2*dizi[0]*ISekil.PI);
    }

    @Override
    public int alani(int... dizi) {
        //pi*(r*r)
        return (int)(ISekil.PI*dizi[0]*dizi[0]);
    }
}
