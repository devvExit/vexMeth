import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class humanTest {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        String uName = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Username: ");
        uName = in.next();
        System.out.println("Password: ");
        in.next();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Prove that you are human. What does 192%17 equal?");
        in.next();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.print("That is incorrect.");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(" It's " + (192 % 17) + " btw.");
        TimeUnit.SECONDS.sleep(1);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Welcome to Application.java, " + uName + "!");
        in.close();
    }
}