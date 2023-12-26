package Gun46.tasks.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {

        int miktar=0;
        Scanner oku=new Scanner(System.in);
        boolean usernameIste=true;
        String username="";
        String password="";
        ArrayList<User> userlist = new ArrayList<>();

        do{

            if (usernameIste) {
                System.out.print((miktar + 1) + ".User Name=");
                username = oku.nextLine();
            }

            System.out.print("Password=");
            password=oku.nextLine();

            try {
                User yeniUser = new User(username, password);
                userlist.add(yeniUser);
                miktar++;
                usernameIste=true; // hata olmadığında bir sonraki kullanıcı için username istenecek
                yeniUser.setId();
            }
            catch (Exception ex)
            {
                usernameIste=false; // hata lduğu durumda tekrar username isteme
                System.out.println(ex.getMessage());
            }

        }while(miktar <5);

        for (User u: userlist){
            System.out.println(u);
        }
    }
}
