package Gun38.nonAccessModifier.finalModifier;

public class JavaFinalModifier {
    // final : öyle bir değişkeniniz var ki, bir değer atanıyor,
    // ve onun yazılım içinde değiştirilmesi istenmiyor.
    // mesala pi sayısı , değeri değişmeyecek
    // Sadece ilk değer atanabilir.

    final double pi=3.14;

    public static void main(String[] args) {
        final int number=5;

       // number=7; // tekrar yeni bir değer atanamaz

    }
}
