package Gun42.Odev_1.Yol;

import java.time.LocalDateTime;

public class User {

    String name;
    LocalDateTime registerDate;

    public User(String name, LocalDateTime registerDate) {
        this.name = name;
        this.registerDate = registerDate;
    }
}
