package Gun62;

public class S73 {
    int x;
    int y;

    public void doStuff(int x, int y){
        x = x;  // metdoun parametresindeki eğeri kendine atar
        y = this.y; // metodun paramtresindeki değişkene değe atar.
    }
    // yukarıdkai iki işlemde de nesnenin x ve y sine değer atanmaz.
    // değer atanabilmesi için this.x=x ve this.y=y olmalı

    public void display () {
        System.out.print(x + " " + y + " : ");
    }

    public static void main(String[] args) {
        S73 m1 = new S73();
        m1.x = 100;
        m1.y = 200;
        S73 m2 = new S73();
        m2.doStuff(m1.x, m1.y);// burada metodun içinde atamalar doğru yapılmadığı için değer atanamaz.
        m1.display();
        m2.display();
    }
}
//100 200 : 0 0 :
