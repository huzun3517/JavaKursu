package Gun26;

import java.util.ArrayList;

public class soru_tekrar {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer> > notlarArrList = new ArrayList<>();

        ArrayList<Integer> matNotlar = new ArrayList<>();
        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar = new ArrayList<>();
        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar = new ArrayList<>();
        kimNotlar.add(45);
        kimNotlar.add(55);
        kimNotlar.add(65);
        kimNotlar.add(35);
        System.out.println("matNotlar = " + matNotlar);
        System.out.println("turNotlar = " + turNotlar);
        System.out.println("kimNotlar = " + kimNotlar);

        notlarArrList.add(matNotlar);
        notlarArrList.add(turNotlar);
        notlarArrList.add(kimNotlar);

        for (int i = 0; i <matNotlar.size() ; i++) {
            System.out.println("matNotlar " + (i+1) + " = " + matNotlar.get(i));
        }

        System.out.println("*********************************************************");

        for (int i = 0; i < notlarArrList.size()  ; i++) {
            System.out.println("notlarArrList = " + notlarArrList.get(i));

        }

        for (int i = 0; i <notlarArrList.size() ; i++) {
            for (int j = 0; j <notlarArrList.get(i).size() ; j++) {
                System.out.println((i+1) + ".ders = " + (j+1) + ".not = " + notlarArrList.get(i).get(j));
            }

        }
        System.out.println("*******************************************");

        System.out.println("MatNotortalaması = " + dersOrtalamaBul(0,notlarArrList));
        System.out.println("TürNotortalaması = " + dersOrtalamaBul(1,notlarArrList));
        System.out.println("KimNotortalaması = " + dersOrtalamaBul(2,notlarArrList));

        System.out.println("*******************************************");

        System.out.println(" tumdersOrtalama = " +  tumdersOrtalamaBul(notlarArrList));

        System.out.println("*******************************************");

        System.out.println(" yazili1ort = " +  yaziliort(0,notlarArrList));
        System.out.println(" yazili2ort = " +  yaziliort(1,notlarArrList));
        System.out.println(" yazili3ort = " +  yaziliort(2,notlarArrList));
        System.out.println(" yazili4ort = " +  yaziliort(3,notlarArrList));


    }
    public static int dersOrtalamaBul(int dersno, ArrayList<ArrayList<Integer>>notlarArrList ){
        int top =0;

        for (int i = 0; i <notlarArrList.get(dersno).size() ; i++) {
            top += notlarArrList.get(dersno).get(i);
        }

        return top / notlarArrList.get(dersno).size();
    }

    public static int tumdersOrtalamaBul(ArrayList<ArrayList<Integer>>notlarArrList){

        int top =0;
        int notMiktarı =0;

        for (int i = 0; i <notlarArrList.size() ; i++) {
            for (int j = 0; j <notlarArrList.get(i).size() ; j++) {
                top+= notlarArrList.get(i).get(j);
                notMiktarı++;
            }
        }
        return top / notMiktarı;
    }


    public static double yaziliort (int sınavsira,ArrayList<ArrayList<Integer>>notlarArrList ){
        double sum=0;
        int c=0;

        for (int i=0;i<notlarArrList.size();i++)
        {
            if (notlarArrList.get(i).size()>=sınavsira+1)  // girilen sinav no su dersin boyutundan buyukse o notu almiyor.
            {
                sum += notlarArrList.get(i).get(sınavsira);
                c++;
            }
        }
        return sum/c;
    }
    }



