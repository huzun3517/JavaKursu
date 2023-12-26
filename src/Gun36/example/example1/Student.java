package Gun36.example.example1;

// bir tür yapısı:class
public class Student {
      int id;
      String name;
      String surName;
      int classroom;

      //Conructor : yapıcı metod: ilk oluşmada yapılması
      // istenen işlemlerin yazıldığı metod.
      public Student(int id, String name, String surName, int classroom)
      {
          //this : clasın kendisini gösteriyor yani Student ı gösteriyor.
          this.id = id;
          this.name = name;
          this.surName = surName;
          this.classroom = classroom;

          //System.out.println("consructor çalıştı.");
      }

    public Student(int id, String name, String surName)
    {
//        this.id = id;
//        this.name = name;
//        this.surName = surName;
//        this.classroom = 0;
        this(id,name,surName,0);
    }

    public Student(int id, String name)
    {
//        this.id = id;
//        this.name = name;
//        this.surName = "";
//        this.classroom = 0;
        this(id,name,"",0);
    }

    public Student(int id)
    {
//        this.id = id;
//        this.name = "";
//        this.surName = "";
//        this.classroom = 0;
        this(id,"","",0);
    }

    public Student()
    {
//        this.id = 0;
//        this.name = "";
//        this.surName = "";
//        this.classroom = 0;
        this(0,"","",0);
    }









      //2.Yöntem için yazıldı.
//      public static Student createStudent(int id, String name, String surName,int classroom)
//      {
//          Student ogrenci1=new Student();
//          ogrenci1.id=id;
//          ogrenci1.name=name;
//          ogrenci1.surName=surName;
//          ogrenci1.classroom=classroom;
//
//          return ogrenci1;
//      }
}
