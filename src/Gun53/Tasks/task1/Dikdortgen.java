package Gun53.Tasks.task1;

public class Dikdortgen implements ISekil {

    @Override
    public int cevresi(int... dizi) {
        if (dizi.length == 1)
            return (dizi[0]+dizi[0])*2;
        else
            return (dizi[0]+dizi[1])*2;
    }

    @Override
    public int alani(int... dizi) {
        if (dizi.length==1)
        return dizi[0]*dizi[0];
        else
            return dizi[0]*dizi[1];
    }
}
