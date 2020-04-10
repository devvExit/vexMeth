package methods;

public class is420 {
    
    public static String isThis420(String s, int i, double d) {
        boolean t = false;
        if (s.equals("420") || i == 420 || d == 420.0)
            t = true;
        if (t)
            return "Yeah man!";
        else
            return "Nah...";
    }

    public static void main(String[] args) {
        System.out.print(isThis420("", 420, 0));
    }
}