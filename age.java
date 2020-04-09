import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        int age = 0;
        int x = 5;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("You are " + age + " years old. In 5 years, you will be " + (age + x)
                + " years old. And 5 years ago, you were " + (age - x) + " years old.");
        input.close();
    }
}

//First program typed out without any references; all from memory!
