import java.util.Scanner;
public class exp {

    public static boolean makeBricks(int a,int b,int c){return((b==0&&c<=a)||((b*5>=c&&c%5<=a)||(b*5<=c&&c-b*5<=a)));}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        String t = "";
        String result = "";
        //Takes input for a
        System.out.print("Enter number of small bricks (1in):   \n"); 
        a = in.nextInt();
        //Takes input for b
        System.out.print("Enter number of big bricks (5in):     \n"); 
        b = in.nextInt();
        //Takes input for c
        System.out.print("Enter goal length (in):               \n"); 
        c = in.nextInt();

        //Checks if makeBricks is true and changes t and result to reflect the result in the final string
        if (makeBricks(a, b, c)){t += " could "; result = "Yes! ";}
        else                            {t += " can not "; result = "No. ";}
        
        //Output result in a readable way
        System.out.print(result + "You" + t + "reach your goal length of " + c + " inches with  some combination of "
                + a + " bricks of 1 inch in length and " + b + " bricks of 5 inch in length.");
        
        t = "";
        result = "";
        in.close();
    }
}

