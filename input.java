//  7 - https://grahammitchell.com/assignments/javahard-chap07.html
//      I have typed this out verbatum. I might need the info, but I know how it's used
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //Will not fix leak in assignment

        System.out.println("What city is the capital of France?");
        keyboard.next();
        System.out.println("What is 6 * 7?");
        keyboard.nextInt();
        System.out.println("Enter a number between 0.0 and 1.0.");
        keyboard.nextDouble();
        System.out.println("Is there anything else you would like to say?");
        keyboard.next();
        keyboard.close();
    }
}
