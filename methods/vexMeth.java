package methods;

import java.io.IOException;
import java.util.Scanner;

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

    public static int make(int a, int b, int c) {
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

    public static void cls(String[] args) {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // SplashScreen
    /*
     * Welcome to vexMeth.java
     * 
     * What would you like to do?
     * 
     * make(x, y, z) canMake(x, y, z) isThis420(s, i, d)
     * 
     * Note: Parameters are put in after selecting.
     */
    // Make
    /*
     * Enter 3 integers xyz with no spaces: 509
     * 
     * It would take at least 4 small chocolate bars to make 9 units of chocolate.
     * 
     * Press enter to continue...
     */

    public static void welcome(String[] args) {
        String iS = "";
        System.out.println("Welcome to vexMeth.java\n\nWhat would you like to do?\n\n"
                + "\tmake(x, y, z)\n\tcanMake(x, y, z)\n\tisThis420(s, i, d)\t\t\n\nNote: Parameters are put in after selecting.");
        Scanner input = new Scanner(System.in);
        iS = input.next();
        switch (iS) {
            case "make":
                System.out.print("Enter 3 integers xyz with no spaces: ");
                iS = input.next();
                int can = make(Integer.valueOf(iS.substring(0)), Integer.valueOf(iS.substring(1)),
                        Integer.valueOf(iS.substring(2)));
                System.out.println("\nIt would take at least " + can + " small chocolate bars to make "
                        + Integer.valueOf(iS.substring(2)) + " units of chocolate.\n\nPress enter to continue...");
                input.next();
                main(args);
                break;
            case "canMake":

                break;
            case "isThis420":
                iS = input.next();
                System.out.print(isThis420(iS, pInt(iS), doob(iS)));
                break;
            default:
                break;
        }
        input.close();
    }

    private static int pInt(String n) {
        int foo;
        try {
            foo = Integer.parseInt(n);
            return foo;
        } catch (NumberFormatException e) {
            foo = 0;
            return -1;
        }
    }

    private static Double doob(String n) {
        Double foo;
        try {
            foo = Double.parseDouble(n);
            return foo;
        } catch (NumberFormatException e) {
            foo = 0.0;
            return -1.0;
        }
    }

    public static void main(String[] args) {
        cls(args);
        welcome(args);
    }
}