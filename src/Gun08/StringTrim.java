package Gun08;

public class StringTrim {
    public static void main(String[] args) {
        // trim : stringin başında ve sonunda olan boşluk karakterlerini temizler
        
        String text="   Merhaba  Dünya   ";

        System.out.println(text.replaceAll("[abn]","_"));
        System.out.println(text.replaceAll("[A-Z]","_"));
        System.out.println(text.replaceAll("[A-Z]","x").replaceAll("[a-z]","x"));
    }
}
