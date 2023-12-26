package Gun36.tasks.task1;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book(String name, int publishYear, String author)
    {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public Book(String name, int publishYear)
    {
        this(name,publishYear,"");
    }

    public Book()
    {
        this("",0,"");
    }

    // toString metodu deniyor
    public String toString()
    {
        return name+" "+publishYear+" "+author;
    }

    public void ShowInfo()
    {
        System.out.println(name+" "+publishYear+" "+author);
    }
}
