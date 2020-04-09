import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        String fName, lName, loginID;
        int grade, studentID;
        double gpa;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("\nFirst name: ");
        fName = keyboard.next();

        System.out.print("\nLast name: ");
        lName = keyboard.next();

        System.out.print("\nGrade: ");
        grade = keyboard.nextInt();

        System.out.print("\nStudent ID: ");
        studentID = keyboard.nextInt();

        System.out.print("\nLogin: ");
        loginID = keyboard.next();

        System.out.print("\nGPA: ");
        gpa = keyboard.nextDouble();

        System.out.print("\nYour information:\nLogin: " + loginID + "\nID: " + studentID + "\nName: " + lName + ", "
                                                        + fName + "\nGPA: " + gpa + "\nGrade: " + grade);
        keyboard.close();
    }
}
