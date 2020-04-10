import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        String name;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);
        name = keyboard.next();

        System.out.print("Hi, " + name + "! How old are you?");
        age = keyboard.nextInt();

        System.out.println("So you're " + age + ", eh? That's very old.");
        System.out.println("How much do you weigh, " + name + "? ");
        weight = keyboard.nextDouble();

        System.out.println(weight + "! Better keep that quiet!!");
        System.out.println("Finally, what's your income, " + name + "? ");
        income = keyboard.nextDouble();

        System.out.print("Hopefully that is" + income + "per hour");
        System.out.println(" and not per year!");
        System.out.print("Well, thanks for answering my rude questions, ");
        System.out.println(name + ".");
        keyboard.close();
    }
}
/*


    Does the program blow up if you enter an integer value when it is expecting you to type a double? Put an answer in a comment at the bottom of the code, along with your guess why or why not.
    No it does not. It appends .00 to the integer entered.

    Does the program blow up if you enter a numeric value (integer or double) when it is expecting a String? Put an answer in a comment at the bottom of the code, along with your guess why or why not.
    No, it saves the number as a string.

    Type something that makes the program blow up on every question possible, and add comments explaining what blew it up and why.
    Entering comment blocks and quotes blows up the program every time

    Add a new variable of your choosing. Add another question. (It doesn’t have to be rude.) Let the human put an answer to your question into your new variable, and display the human’s answer on the screen afterward.
    Nah I'm good. I get it

*/
