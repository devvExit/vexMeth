import java.util.Scanner;
public class sequencing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price, salesTax, total = 0;

        System.out.print("What is the price? \n");
        price = input.nextDouble();

        salesTax = price * 0.0825;
        total = price + salesTax;
        System.out.println( "Item price:\t" + price );
        System.out.println("Sales tax:\t" + salesTax);
        System.out.println("Total cost:\t" + total);
        input.close();
    }
}

/*

    Remove the ` = 0 on line 8, so that *price* no longer gets defined on line 8, only declared. What happens when you try to compile the code? Does the error message make sense? (Now put the = 0` back so that the program compiles again.)


    Move the two lines of code that give values to salesTax and total so they occur after price has been given a real value. Confirm that the program now works as expected.


    Now that these lines occur after the variable price has been properly given a real value, try removing the ` = 0` on line 8 again. Does the program still give an error? Are you surprised?

    
*/