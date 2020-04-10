//This script is written from memory as a test of my current abilities.

import java.util.Scanner;

public class squares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;

        System.out.print("Input a number: ");
        x = input.nextDouble();
        System.out.print("Your number is " + x + "\nThe square of this number is " + x * x + "\tAnd the square root is "
                + Math.sqrt(x));
        input.close();
    }
}
