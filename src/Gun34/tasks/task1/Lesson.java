package Gun34.tasks.task1;

public class Lesson {
    String name;
    int hour;

    // return (dondurme) yoksa void, varsa tipi yazılır.
    public static Lesson createLesson(String name, int hour)
    {
        Lesson ders=new Lesson();
        ders.name= name;
        ders.hour = hour;

        return ders;
    }

}
