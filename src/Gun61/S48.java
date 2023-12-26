package Gun61;

import java.util.ArrayList;
import java.util.List;

public class S48 {
    public static void main(String[] args) {
        List colors = new ArrayList();

        colors.add("green"); // 0
        colors.add("blue"); // 1
        colors.add("red"); // 2
        colors.add("yellow");//3

        //colors.remove(2); // red silindi  green 0, blue 1, yellow 2

        colors.add(3, "cyan");
        // green, blue, yellow, cyan

        System.out.println(colors);
    }
}
