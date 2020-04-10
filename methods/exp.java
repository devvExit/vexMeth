package methods;

import java.util.Scanner;

public class exp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        String t = "";
        String result = "";
        // Takes input for a
        System.out.print("Enter number of small bricks (1in):   \n");
        a = in.nextInt();
        // Takes input for b
        System.out.print("Enter number of big bricks (5in):     \n");
        b = in.nextInt();
        // Takes input for c
        System.out.print("Enter goal length (in):               \n");
        c = in.nextInt();

        // Checks if makeBricks is true and changes t and result to reflect the result
        // in the final string
        // if (makeBricks(a, b, c)) {t += " could "; result = "Yes! ";}
        // else {t += " can't "; result = "No.. ";}
        if (makeChocolate(a, b, c) >= 0) {
            t += " could ";
            result = "Yes! ";
        } else {
            t += " can't ";
            result = "No.. ";
        }

        // Output result in a readable way
        System.out.print(result + "You" + t + "reach your goal length of " + c);
        System.out.print("\nWould you like to know something about a string? (yes) ");
        t = in.next();
        if (t.equals("yes")) {
            System.out.print("Input string: ");
            t = in.next();
            System.out.println(countingIn.letterCount(t));
        }
        t = "";
        result = "";
        System.out.print("\nGuess my favorite number: \n");
        t = in.next();
        System.out.print("\n" + vexMeth.isThis420(t, 0, 0));
        in.close();
    }

}
