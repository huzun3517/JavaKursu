package Gun42.Odev_2.Yol;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class User {

    String name;
    LocalDateTime registerDate;

    User(String name, LocalDateTime registerDate){
        this.name = name;
        this.registerDate = registerDate;
    }
}
