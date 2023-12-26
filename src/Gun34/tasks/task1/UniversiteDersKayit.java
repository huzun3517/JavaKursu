package Gun34.tasks.task1;

public class UniversiteDersKayit {
    // Üniversitede Öğrencilere Ders kaydı programı yapılmak isteniyor.
    // Önce ders tanımlamaları yapılacak, sonra her öğrenci için alabileceği ders saatini geçmeyecek şekilde, dersler
    // öğrencilere eklenecek.
    // 1- Adım : Yeni ders oluşturmak için Lesson adında bir sınıf tanımlayınız : fields: name, hour
    // 2- Adım : Ders oluşturma metodunu yazınız. createLesson
    // 3- Adım : 3 adet ders tanımlayınız.
    //    mat101 6 saat,  fiz101 4 saat, java101 6 saat
    // 4- Adım : Student isminde yeni bir class tanılayınız:
    //           fields : name, maxAlabilecegiDersSaatMiktari
    // 5- Adım : Öğrenci oluşturmayı bir metod ile yazınız.createStudent
    // 6- Adım  : 2 adet öğrenci oluşturunuz:
    //            Adı: Mehmet, maxAlabilecegiDersSaatMiktari=20 olsun
    //            Adı: Ayşe, maxAlabilecegiDersSaatMiktari=12
    // 7- Adım :  Öğrenciye ders Eklemek için bir dersListesi tutacak bir
    //            field ekleyiniz: studentLessons adında
    // 8- Adım :  Öğrenciye ders ekleyen LessonAdd isimli bir metod yazınız;
    //  fakat ders eklenirken toplam ders saat miktarı öğrencinin alabileceği saat
    //  miktarını aşmasın, aşarsa uyarı versin.
    // yani öğrencinin alabileceği max saat miktarına baksın, geçmeyecekse eklesin.
    //9- Adım  : Her öğreninin aldığı dersleri yazan bir metod yazınız.ve
    //           dersleri yazdırınız. printLesson


    public static void main(String[] args) {

        Lesson mat101=Lesson.createLesson("mat101",6);
        Lesson fiz101=Lesson.createLesson("fiz101",4);
        Lesson java101=Lesson.createLesson("java101",6);

        Student mehmet= Student.createStudent("Mehmet",20);
        Student ayse= Student.createStudent("Ayşe",12);

        mehmet.lessonAdd(mat101);
        mehmet.lessonAdd(fiz101);
        mehmet.lessonAdd(java101);

        ayse.lessonAdd(mat101);
        ayse.lessonAdd(fiz101);
        ayse.lessonAdd(java101);

        mehmet.printLessons();
        ayse.printLessons();
    }



}
