package Gun54.odev2;

public interface IReadFile {

    String open();
    String read();
    String save();
    String close();
}

class TxtFile implements IReadFile  {


    @Override
    public String open() {
        return "Metin dosyası açılıyor...";
    }

    @Override
    public String read() {
        return "Metin dosyası okunuyor...";
    }

    @Override
    public String save() {
        return "Metin dosyası kaydediliyor...";
    }

    @Override
    public String close() {
        return "Metin dosyası kapatılıyor...";
    }
}

class PowerPointFile implements IReadFile {


    @Override
    public String open() {
        return "PowerPoint dosyası açılıyor...";
    }

    @Override
    public String read() {
        return "PowerPoint dosyası okunuyor...";
    }

    @Override
    public String save() {
        return "PowerPoint dosyası kaydediliyor...";
    }

    @Override
    public String close() {
        return "PowerPoint dosyası kapanıyor...";
    }
}

class DMGFile implements IReadFile{

    @Override
    public String open() {
        return "DMG dosyası açılıyor...";
    }

    @Override
    public String read() {
        return "DMG dosyası okunuyor...";
    }

    @Override
    public String save() {
        return "DMG dosyası kaydediliyor...";
    }

    @Override
    public String close() {
        return "DMG dosyası kapanıyor...";
    }
}

class EXEFile implements IReadFile {


    @Override
    public String open() {
        return "EXE dosyası açılıyor...";
    }

    @Override
    public String read() {
        return "EXE dosyası okunuyor...";
    }

    @Override
    public String save() {
        return "EXE dosyası kaydediliyor...";
    }

    @Override
    public String close() {
        return "EXE dosyası kapanıyor...";
    }
}

class Main {

    public static void main(String[] args) {

        TxtFile txt = new TxtFile();
        System.out.println( txt.open());
        System.out.println(txt.read());
        System.out.println( txt.save());
        System.out.println( txt.close());


    }
}
