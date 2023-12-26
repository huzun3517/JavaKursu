package Gun38.nonAccessModifier.finalModifier.example3;

public class Ex3 {
    final String name;

    public Ex3(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Ex3 ornek1= new Ex3("Ayşe");
        Ex3 ornek2= new Ex3("Ali");

//        ornek1.name ="Ali";   final olduğu için, ilk değer atama sonrası değiştirilemez
//        ornek2.name="Zeynep";  final olduğu için, ilk değer atama sonrası değiştirilemez

        System.out.println("ornek1.name = " + ornek1.name);
        System.out.println("ornek2.name = " + ornek2.name);

    }
}
