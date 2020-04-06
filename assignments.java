
//https://grahammitchell.com/assignments/
//Current Assignment: 17
// Learning based on challenges from "Learn Java the Hard Way (Second Edition)"

//Basics and printing
/*  Print a letter to yourself - letter.java
//  1 - https://grahammitchell.com/assignments/letter-to-yourself.html
//      Write a program that displays your name and address on the screen as if it were a letter.

public class assignments {
    public static void main( String[] args){
        System.out.println(
                "+----------------------+\n" +
                "|                   ## |\n" +
                "|                   ## |\n" +
                "| Vexaton              |\n" +
                "| 1 Meme Avenue        |\n" +
                "| Kownty, MA 69420     |\n" +
                "+----------------------+\n"
            );
    }
}
*/
/*  Print initials as ASCII - initials.java
//  2 - https://grahammitchell.com/assignments/your-initials.html
//      Display your initials on the screen in block letters

import java.util.Scanner;

public class assignments {
    public static void main(String[] args) {
        //Calls alphabet array and sets int alphabetLength to the length of the alphabet
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int alphabetLength = alphabet.length;
        String[] ascii = { "  A  \n A A \nA   A\nAAAAA\nA   A\nA   A\nA   A\n",
                "BBBB \nB   B\nB   B\nBBBB \nB   B\nB   B\nBBBB \n",
                " CCC \nC   C\nC    \nC    \nC    \nC   C\n CCC \n",
                "DDDD \nD   D\nD   D\nD   D\nD   D\nD   D\nDDDD \n",
                "EEEEE\nE    \nE    \nEEE  \nE    \nE    \nEEEEE\n",
                "FFFFF\nF    \nF    \nFFF  \nF    \nF    \nF    \n",
                " GGG \nG   G\nG    \nGGGGG\nG   G\nG   G\n GGG \n",
                "H   H\nH   H\nH   H\nHHHHH\nH   H\nH   H\nH   H\n",
                "IIIII\n  I  \n  I  \n  I  \n  I  \n  I  \nIIIII\n",
                "JJJJJ\n  J  \n  J  \n  J  \nJ J  \nJ J  \n JJ  \n",
                "K   K\nK  K \nK K  \nKK   \nK K  \nK  K \nK   K\n",
                "L    \nL    \nL    \nL    \nL    \nL    \nLLLLL\n",
                "M   M\nMM MM\nMM MM\nM M M\nM   M\nM   M\nM   M\n",
                "N   N\nNN  N\nN N N\nN  NN\nN   N\nN   N\nN   N\n",
                " OOO \nO   O\nO   O\nO   O\nO   O\nO   O\n OOO \n",
                "PPPP \nP   P\nP   P\nPPPP \nP    \nP    \nP    \n",
                " QQQ \nQ   Q\nQ   Q\nQ   Q\nQ   Q\nQ  Q \n QQ Q\n",
                "RRRR \nR   R\nR   R\nRRRR \nR R  \nR  R \nR   R\n",
                " SSS \nS   S\nS    \n SSS \n    S\nS   S\n SSS \n",
                "TTTTT\n  T  \n  T  \n  T  \n  T  \n  T  \n  T  \n",
                "U   U\nU   U\nU   U\nU   U\nU   U\nU   U\nUUUUU\n",
                "V   V\nV   V\nV   V\nV   V\nV   V\n V V \n  V  \n",
                "W   W\nW   W\nW   W\nW W W\nWW WW\nWW WW\nW   W\n",
                "X   X\nX   X\n X X \n  X  \n X X \nX   X\nX   X\n",
                "Y   Y\n Y Y \n  Y  \n  Y  \n  Y  \n  Y  \n  Y  \n",
                "ZZZZZ\n    Z\n   Z \n  Z  \n Z   \nZ    \nZZZZZ\n" };

        //Opens scanner for input
        Scanner in = new Scanner(System.in); //Not fixing the leak here

        //Asks for first and last name
        System.out.print("First name: ");
        String first = in.next();
        System.out.print("Last name: ");
        String last = in.next();

        //Generate Strings for the initials of each word (could be one line, but whatever)
        String n1 = first.substring(0, 1);
        String n2 = last.substring(0, 1);

        //Make the characters uppercase so that they always match the array
        n1 = n1.toUpperCase();
        n2 = n2.toUpperCase();
        System.out.print("Initials: " + n1 + " " + n2);

        //Checks each letter in the alphabet against n1 & n2
        for (int i = 0; i < alphabetLength; i++) {
            char ch = (alphabet[i]);
            String chS = Character.toString(ch);
            if (n1.equals(chS)) {
                System.out.print("\n" + ascii[i]);
            }
        }
        for (int i2 = 0; i2 < alphabetLength; i2++) {
            char ch2 = (alphabet[i2]);
            String chS2 = Character.toString(ch2);
            if (n2.equals(chS2)) {
                System.out.print("\n" + ascii[i2]);
            }
        }
    }
}
*/
/*  Printing Choices - choices.java
//  3 - https://grahammitchell.com/assignments/javahard-chap03.html
//      Java has two common commands used to display things on the screen. So far we have only looked at println(), but print() is sometimes used, too. This exercise will demonstrate the difference.

public class learn {
    public static void main(String[] args) {
        System.out.println("Alpha");
        System.out.println("Bravo");

        System.out.println("Charlie");
        System.out.println("Delta");
        System.out.println();

        System.out.print("Echo");
        System.out.print("Foxtrot");

        System.out.println("Golf");
        System.out.print("Hotel");
        System.out.println();
        System.out.println("India");

        System.out.println();
        System.out.println("This" + " " + "is" + " " + "a" + " test.");
    }
}
*/
/*  Escape Sequences and Comments - escape.java
//  4 - https://grahammitchell.com/assignments/javahard-chap04.html
//      I've just copied this one over. I know these already. I've taken out blocked comments, as these were messing with my formatting.

public class assignments {
    public static void main(String[] args) {
        
        System.out.print( "Learn\tJava\n\tthe\nHard\tWay\n\n" );
        System.out.print( "\tLearn Java the \"Hard\" Way!\n" );
        System.out.print( "Hello\n" );
        System.out.print( "Jello\by\n" );
        System.out.println( "Hard to believe, eh?" );
        System.out.println( "Surprised? Or what did you expect?" );
        System.out.println( "\\ // -=- \\ //" );
        System.out.println( "\\\\ \\\\\\ \\\\\\\\" );
        System.out.print( "I hope you understand \"escape sequences\" now.\n" );
    }
}
*/

//Variables
/*  Saving Information in Variables - variables.java
//  5 - https://grahammitchell.com/assignments/javahard-chap05.html
//      Add four more variables to the program: another integer, another double, and two Strings. Name them whatever you want. Give them values. Print them out.

public class assignments {
    public static void main(String[] args) {
        int x, y, age, speakerCount;
        double seconds, e, checking, phoneNumber;
        String firstName, lastName, title, rubberDucky, drink;

        x = 10;
        y = 400;
        age = 24;
        speakerCount = 2;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        phoneNumber = 0.90466484;

        firstName = "Erik";
        lastName = "Nope";
        title = "Mr.";
        rubberDucky = "a plush dalmation";
        drink = "liquid LSD.";

        System.out.println("The variable x contains " + x);
        System.out.println("The value " + y + " is stored in the variable y.");
        System.out.println("The experiment took " + seconds + " seconds.");
        System.out.println("A favorite irrational number is Euler's number: " + e);
        System.out.println("Hopefully you have more than $" + checking + "!");
        System.out.println("My name's " + title + " " + firstName + " " + lastName + " And I am " + age + " years old.");
        System.out.println("I have " + speakerCount + " speakers, and this is a number: " + phoneNumber);
        System.out.println("My rubber ducky is " + rubberDucky + ", and my favorite drink is " + drink);
    }
}
*/
/*  Using Variables - variablesTwo.java
//  6 - https://grahammitchell.com/assignments/using-variables.html
//      Write a program that creates three variables: an int, a double, and a String. Put the value 2327 into the first variable, the value 2.71828 into the second, and the value "Computer Science" into the third. It does not matter what you call the variables... this time. Then, display the values of these three variables on the screen, one per line.
public class assignments {
    public static void main(String[] args) {
        int i = 2327;
        double d = 2.71828;
        String s = "Computer Science";
        System.out.println("This is room #" + i + "\ne is close to " + d + "\nI am learning a bit of " + s);
    }
}
*/

//Keyboard input
/*  Getting Input from a Human - input.java
//  7 - https://grahammitchell.com/assignments/javahard-chap07.html
//      I have typed this out verbatum. I might need the info, but I know how it's used


public class assignments {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What city is the capital of France?");
        keyboard.next();
        System.out.println("What is 6 * 7?");
        keyboard.nextInt();
        System.out.println("Enter a number between 0.0 and 1.0.");
        keyboard.nextDouble();
        System.out.println("Is there anything else you would like to say?");
        keyboard.next();
    }
}
*/
