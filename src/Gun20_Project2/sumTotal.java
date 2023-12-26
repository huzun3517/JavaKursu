package Gun20_Project2;

public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22" , "0$"},{"€9" , "€40" , "$1"}, {"€12,€2,€0"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */


    /*
        String 2D array oluştur

       {{"$12" , "$22" , "0$"},{"€9" , "€40" , "$1"}, {"€12,€2,€0"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       double return et

    */
    public static void main(String[] args) {

//        Koda burdan başlayın

        int sumTop = 0;

        String[][] Geld = {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"} };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Geld[i][j].contains("$")) {
                    sumTop += 3.2 * Double.parseDouble(Geld[i][j].replace("$", ""));
                }
                if (Geld[i][j].contains("€")) {
                    sumTop += 4.2 * Double.parseDouble(Geld[i][j].replace("€", ""));

                }


            }
        }

        System.out.println(sumTop);

    }
}


