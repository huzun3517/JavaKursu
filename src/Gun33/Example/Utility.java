package Gun33.Example;

public class Utility {

      //2.Yöntem için kullanıldı
//    public String getString(int value)
//    {
//        return String.valueOf(value);
//    }
//
//    public int getInt(String value)
//    {
//        return Integer.parseInt(value);
//    }
//
//    public Double getDouble(String value)
//    {
//        return Double.parseDouble(value);
//    }
//
//    public boolean getBool(String value)
//    {
//        return Boolean.parseBoolean(value);
//    }

    //3.Yöntem static eklendi
    public static String getString(int value)
    {
        return String.valueOf(value).trim();
    }

    public static int getInt(String value)
    {
        return Integer.parseInt(value);
    }

    public static double getDouble(String value)
    {
        return Double.parseDouble(value);
    }

    public static boolean getBool(String value)
    {
        return Boolean.parseBoolean(value);
    }

}
