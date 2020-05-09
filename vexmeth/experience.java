package vexmeth;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.IOException;

class experience {

    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        // New scanner
        Scanner input = new Scanner(System.in);

        // Initializes DecimalFormat
        String pattern = "###,###";
        DecimalFormat df = new DecimalFormat(pattern);

        // Asks user for XP input
        System.out.println("How much XP do you have in the skill you are training?");
        Double currentExp = input.nextDouble();

        // Checks if currentExp > lvl 99 or lower than 0, in which case, there is no
        // need to run the program
        if (currentExp >= expToLvl(99)) {
            System.out.println("Congratulations on hitting 99!");
            System.exit(0);
        } else if (currentExp < 0) {
            System.out.println("I don't believe that...");
            System.exit(0);
        }

        // Asks user what the goal level is
        System.out.println("What level are you aiming for?");
        Double upperLevel = input.nextDouble();

        // Checks if upperLevel is higher than 99.
        if (upperLevel > 99) {
            System.out.println("There is no level " + df.format(upperLevel));
            System.exit(0);

        }
        // Outputs amount of XP required
        else {
            Double expLeft = expToLvl(upperLevel) - currentExp;
            System.out.println("You need " + df.format(expLeft) + " exp to get to level " + df.format(upperLevel));
        }

        // Closes scanner
        input.close();
    }

    static double expToLvl(double level) {
        double total = 0;
        for (int i = 1; i < level; i++) {
            total += Math.floor(i + 300 * Math.pow(2, i / 7.0));
        }

        return Math.floor(total / 4);
    }

}
