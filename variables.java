//  5 - https://grahammitchell.com/assignments/javahard-chap05.html
//      Add four more variables to the program: another integer, another double, and two Strings. Name them whatever you want. Give them values. Print them out.

public class variables {
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
