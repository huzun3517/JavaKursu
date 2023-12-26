package Gun54.odev1;

public interface IAnimal {

    String food();

}

interface IFlying extends IAnimal {


}

interface ISailling extends IAnimal {

}

class Swallow implements IFlying {

    @Override
    public String food() {
        return "Kırlangıçlar böcek yerler...";
    }
}

 class Cat implements IAnimal {


    @Override
    public String food() {
        return "Kedi mama yer...";
    }

    public void sescikar() {
        System.out.println("Kedi miyavladı...");
    }
}

class Shark implements ISailling {

    @Override
    public String food() {
        return "Köpekbalığı balıkları yer...";
    }
}

class Duck implements IFlying,ISailling {

    @Override
    public String food() {
        return "Ördek hem uçar hem yüzer hem de yeşillik yer...";
    }


}

class Main{

    public static void main(String[] args) {

        Duck duck1 = new Duck();
        System.out.println(duck1.food());

        IFlying duck = new Duck();
        System.out.println(duck.food());

        System.out.println("----------------");

        Cat cat = new Cat();
        System.out.println(cat.food());
        cat.sescikar();

        IAnimal cat2 = new Cat();
        System.out.println(cat2.food());

        System.out.println("-----------------");

        Shark shark = new Shark();
        System.out.println(shark.food());

        ISailling shark2 = new Shark();
        System.out.println( shark2.food());

        System.out.println("------------------");

        Swallow swallow = new Swallow();
        System.out.println(swallow.food());

        IAnimal swallow2 = new Swallow();
        System.out.println(swallow2.food());
    }
}