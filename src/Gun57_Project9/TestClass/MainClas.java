package Gun57_Project9.TestClass;

import Gun57_Project9.Lessons.LessonClass;
import Gun57_Project9.Lessons.Music;
import Gun57_Project9.Student.StudentClass;


public class MainClas {

    public static void main(String[] args) {

        StudentClass studentClass = new StudentClass("Gerard", "Captain2005","Portugal" );

        LessonClass lessonClass = new Music(studentClass);

        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);


        /*
        Run the MainClass

        Result should be Exception in thread "main" java.lang.AssertionError: Location should be one of the following [USA, England, France, Germany, Canada]


         */
    }
}
