import java.util.Scanner;
public class stupidCalculator {
    public static void main(String[] args) {
        double x, y, z = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("1st Number: ");
        x = input.nextDouble();
        System.out.println("2nd Number: ");
        y = input.nextDouble();
        System.out.println("3rd Number: ");
        z = input.nextDouble();

        System.out.println(x + " + " + y + " + " + z + " = " + (x + y + z) + ". And this divided by 2 = " + ((x + y + z) / 2) + ".");
        input.close();
    }
}
