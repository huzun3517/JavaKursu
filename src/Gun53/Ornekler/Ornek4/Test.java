package Gun53.Ornekler.Ornek4;

public class Test implements IGoster,IYazdir{
    @Override
    public void goster() {
        System.out.println("göster");
    }

    // implemente edilen interfaceler de aynı isim ve paramatrede
    // olan metdolardan bir tane yazmak yeterlidir,
    // problem oluşturmaz.
    @Override
    public void yaz() {
        System.out.println("göster yaz");
    }
}
