package vexmeth;

public class leapYear {

    // Result parts
    static String a = " is ";
    static String b = " is not ";
    static String c = " was ";
    static String d = " was not ";
    static String e = " is gonna be ";
    static String f = " is not gonna be ";
    static String g = "a leap year";

    // Variables
    static boolean l = false; // Will represent whether the current year is a leap year
    static int n = 2020; // The current year
    static int r = 17; // Range of years to check in each direction
    static int i; // Iterator

    public static void main(String[] args) {

        // Clutter reductor v2.1
        System.out.println();

        // Main
        for (i = n - r; i <= n + r; i++) { // Iterator is current year minus range, runs until last year in range
            if (i == n) // *See below
                System.out.println();
            l = (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)); // Sets l to the result of the leap year logic
            System.out.println(isLeapYear(i)); // Prints whether the current iteration was, is, or will be a leap year
            if (i == n) // *Separates the current year from the rest
                System.out.println();
        }
    }

    public static String isLeapYear(int year) {

        // Checks for boolean l and whether the current iteration is before, during, or
        // after the current year
        if (i == n && l)
            return year + a + g;
        if (i == n)
            return year + b + g;
        if (i < n && l)
            return year + c + g;
        if (i < n)
            return year + d + g;
        if (i > n && l)
            return year + e + g;
        else
            return year + f + g;
    }
}
