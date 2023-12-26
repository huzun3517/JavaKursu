package Gun62;

public class S162 {

    int count;

    public static void displayMsg(){
        //count++;                                                   // line n1
        //System.out.println("Welcome "+" Visit Count: " + count);   // line n2
        // Static bir metodun içerisine dışarıdan çağrılan metod veya fiedlar mutlak suret STATIC olmalı.
    }

    public static void main(String[] args) {

        S162.displayMsg();       // line n3
        S162.displayMsg();      // line n4
    }

}
