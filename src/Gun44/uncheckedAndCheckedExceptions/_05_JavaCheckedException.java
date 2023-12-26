package Gun44.uncheckedAndCheckedExceptions;

import java.io.FileInputStream;

public class _05_JavaCheckedException {
    public static void main(String[] args) {

        // Dosya okuma/yazma işlemi
        // bu işlemlerde hata olasılığı yüksek olduğundan
        // hata kontrolü zorunlu tutuluyor.
        // bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor.
        // bu gibi surumlara karşılk gelen hatalara Checked Exception denir.
        // Özellikle IO (inputOutput) işlemleri Checked Exception dır.
        try {
            FileInputStream file = new FileInputStream("dosya.txt");
        }
        catch(Exception ex)
        {

        }
    }
}
