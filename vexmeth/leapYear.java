package vexmeth;

public class leapYear {

    static String a = " is ";
    static String b = " is not ";
    static String c = " was ";
    static String d = " was not ";
    static String e = " is gonna be ";
    static String f = " is not gonna be ";
    static String g = "a leap year";

    static boolean l = false;
    static int n = 2020;
    static int i;

    public static void main(String[] args) {
        for (i = 1000; i <= n + 180; i++) {
            l = (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0));
            System.out.println(isLeapYear(i));
        }
    }

    public static String isLeapYear(int year) {

        if (i == n && l)
            return year + a + g;
        else if (i == n && !l)
            return year + b + g;
        else if (i < n && l)
            return year + c + g;
        else if (i < n && !l)
            return year + d + g;
        else if (i > n && l)
            return year + e + g;
        else
            return year + f + g;
    }
}