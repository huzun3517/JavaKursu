package Gun37.instanceModifiers.publicModifier.other;

import Gun37.instanceModifiers.publicModifier.same.SearchEngine;

public class EdgeBrowser {

    public static void main(String[] args) {
        // diğer oaketteki bu constructor a ulaşabildim.
        // çünkü public.
        SearchEngine microsoft=new SearchEngine("explorer");
        microsoft.name ="Edge"; // diğer paketteki bu fileda ulaşabildim

        System.out.println("microsoft = " + microsoft);
    }
}
