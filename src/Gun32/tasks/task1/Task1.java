package Gun32.tasks.task1;

public class Task1 {
    // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.fields: width, length
    // 2-Adım :Çevre bulmak üzere getPerimeter isminde bir metod yazınız.
    // 3-Adım :Dikdörtgenin alanını bulan getArea isimli bir metod yazınız.

    public static void main(String[] args) {
         Rectangle dikdortgen=new Rectangle();
         dikdortgen.width = 5;
         dikdortgen.length = 4;
         
         System.out.println("dikdortgen.getPerimeter() = " + dikdortgen.getPerimeter());
         System.out.println("dikdortgen.getArea() = " + dikdortgen.getArea());
    }

    

}

