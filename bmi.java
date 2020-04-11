import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double m, kg, bmi, inch, feet, lbs;
        String metric = "m";

        System.out.println("Would you like to use metric or imperial values: (input m or i)");
        String measureSystem = keyboard.next();

        if (measureSystem.equals(metric)) {
            System.out.print("Your height in m: ");
            m = keyboard.nextDouble();
            double m2 = m * m;

            System.out.print("Your weight in kg: ");
            kg = keyboard.nextDouble();

            bmi = kg / m2;

            System.out.println("Your BMI is " + bmi);
        } else {
            System.out.print("Your height in feet without inches: ");
            feet = keyboard.nextDouble();

            System.out.print("Inches: ");
            inch = keyboard.nextDouble();
            m = (feet * 0.3048) + (inch * 0.0254);
            double m2 = m * m;

            System.out.print("Your weight in lbs: ");
            lbs = keyboard.nextDouble();
            kg = lbs * 0.4535924;

            bmi = kg / m2;

            System.out.println("Your BMI is " + bmi);
        }
        keyboard.close();
    }
}