package Gun40_Project6.TestPackage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Gun40_Project6.Settings.UserNameAndPassword;
import java.util.ArrayList;

public class YourTest {

    /*
        Given before class

              Do not change the before class
    */

    /*
        before class verilmiştir

        before class değiştirmeyin
   */
    @Before
    public void beforeClass(){

        UserNameAndPassword userNameAndPassword = new UserNameAndPassword();

        userNameAndPassword.addUserToList();

    }

    /*

    YOUR CODE IS STARTING HERE

    Test the UserNameAndPassword class setUsername method

    Check all the possible options.

    NOTE :  For each possibility you need to create a different @Test method

     */


      /*

    KOD BURDAN BAŞLIYOR

     UserNameAndPassword class setUsername method TEST EDİN

    Bütün ihtimalleri check edin

    NOTE :  Her ihtimal için farklı @Test method oluşturmanız gerekiyor

     */

    @Test
    public void Test1() {
        UserNameAndPassword pass = new UserNameAndPassword();
        String sonuc = pass.setUsername("Bekir");
        Assert.assertEquals("Username length should be more then 6",sonuc);
    }

    @Test
    public void Test2() {
        UserNameAndPassword pass = new UserNameAndPassword();
        String sonuc = pass.setUsername(" Huseyi n");
        Assert.assertEquals("Username should not contain space",sonuc);
    }

    @Test
    public void Test3() {
        UserNameAndPassword pass = new UserNameAndPassword();
        String sonuc = pass.setUsername("Yavuz1");
        Assert.assertEquals("Username should contain @ symbol",sonuc);
    }

    @Test
    public void Test4() {
        UserNameAndPassword pass = new UserNameAndPassword();
        ArrayList<String>UserNameLists = new ArrayList<>();
        boolean sonuc = UserNameLists.contains("huzun3517@gmail.com");
        Assert.assertFalse("Username should be unique",sonuc);
    }

    @Test
    public void Test5() {
        UserNameAndPassword pass = new UserNameAndPassword();
        String sonuc = pass.setUsername("huzun3517@gmail.com");
        Assert.assertEquals("huzun3517@gmail.com",sonuc);
    }






   
}
