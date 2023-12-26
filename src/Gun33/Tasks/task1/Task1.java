package Gun33.Tasks.task1;

public class Task1 {

    public static void main(String[] args) {
        // Math sınıfndaki metodlarıdan 5 tanesini kendi isimlendirmenizle
        // ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.

        System.out.println("myMath.getMax(5,36) = " + myMath.getMax(5,36));
        System.out.println("myMath.getMin(5,4,) = " + myMath.getMin(5,4));
        System.out.println("myMath.getMutlak(-10) = " + myMath.getMutlak(-10));
        System.out.println("myMath.getUs(3,2) = " + myMath.getUs(3,2));
        System.out.println("myMath.getKarekok(9) = " + myMath.getKarekok(9));

    }

}
