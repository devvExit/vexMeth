package methods;

public class vexMeth {

    public static String isThis420(String s, int i, double d) {
        if (s.equals("420") || i == 420 || d == 420.0)
            return "Yeah man!";
        else
            return "Nah...";
    }

    public static boolean canMake(int a, int b, int c) {
        return ((b == 0 && c <= a) || (b * 5 >= c && c % 5 <= a) || (b * 5 <= c && c - b * 5 <= a));
    }/*
      * trueIf | true | OR | true | OR | true |
      */

    public int make(int a, int b, int c) {
        if (b == 0 && c <= a)
            return c;
        if (a == 0 && c % 5 == 0 && c <= b * 5)
            return 0;
        if (b * 5 >= c && c % 5 <= a)
            return c % 5;
        if (b * 5 <= c && c - b * 5 <= a)
            return c - b * 5;
        else
            return -1;
    }

    public static void main(String[] args) {
        System.out.print(isThis420("", 420, 0));
    }
}